package org.Java.Lambdas;

import java.util.List;
import java.util.Objects;

public class DiscountCalculator {

    public static void main(String[] args) {

        ProductCalculator laptop= new ProductCalculator(
                "Laptop", 1000.0, "Electronics"
        );

        ProductCalculator apples = new ProductCalculator(
                "Apples", 5.0, "Groceries"
        );
        ProductCalculator jackets= new ProductCalculator(
                "Jacket", 50.0, "Clothing"
        );

        DiscountCalc<ProductCalculator,Double,Double>

                discountCalc= MethodRef::discounts;



        Double f1= discountCalc.discount(laptop,ProductCalculator.discountByCategory(laptop));
        Double f2= discountCalc.discount(apples,ProductCalculator.discountByCategory(apples));
        Double f3= discountCalc.discount(jackets,ProductCalculator.discountByCategory(jackets));

        System.out.println(laptop+ " "+ f1);
        System.out.println(apples+" "+f2);
        System.out.println(jackets+" "+f3);





    }
}

class ProductCalculator{


    private String name;
    private Double price;
    private String category;



    public ProductCalculator(String name,
                             Double price,String category){
        this.name=name;
        this.category=category;
        this.price=price;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPrice(Double price){
        this.price=price;
    }

    public void setCategory(String category){
        this.category=category;
    }

    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }

    public Double getPrice(){
        return price;
    }

    public  String toString(){
        return this.name+" "+this.category+" "+this.price;
    }



    public static Double discountByCategory(ProductCalculator productCalculator){

        return switch (productCalculator.getCategory().toLowerCase()) {
            case "electronics" -> 10.0;
            case "groceries" -> 5.0;
            default -> 20.0;
        };

    }

}

@FunctionalInterface
interface DiscountCalc<T,V,U>{

    public U discount(T product,V price);

}

class MethodRef {


    public static Double discounts(ProductCalculator product, Double discount) {

        Double sum = product.getPrice() / discount;
        return product.getPrice() - sum;

    }
}


