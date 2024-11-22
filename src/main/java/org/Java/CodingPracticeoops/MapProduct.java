package org.Java.CodingPracticeoops;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class MapProduct {

    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product("Laptop", "Electronics", 1000),
                new Product("Shirt", "Clothing", 50),
                new Product("Headphones", "Electronics", 150),
                new Product("Jeans", "Clothing", 60)
        );


        HashMap<String,Integer> map= new HashMap<>();

        for (Product product : products){
           map.merge(product.getCategory(),product.getPrice(),Integer::sum);
        }

        System.out.println(map);

        products.stream()
                .collect(
                        Collectors.groupingBy(
                                Product::getCategory,
                                Collectors.summarizingInt(Product::getPrice)
                        )
                );





    }
}

class Product implements Comparable<Product>{

    private String name;
    private String category;
    private Integer price;

    Product(String name,String category,Integer price){

        this.name=name;
        this.category=category;
        this.price=price;
    }

    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }

    public Integer getPrice(){
        return price;
    }

    public String toString(){
        return  "("+this.name+ " "+this.category+" "+this.price+")";
    }

    public int compareTo(Product product){
        return Integer.compare(this.price,product.getPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(category, product.category) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category, price);
    }
}
