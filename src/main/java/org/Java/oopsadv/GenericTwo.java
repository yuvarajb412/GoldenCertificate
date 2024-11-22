package org.Java.oopsadv;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericTwo {
    public static void main(String[] args){
        TwoType.add("scss",10);

        TwoType<Integer,Integer> integerIntegerTwoType = new TwoType<>(20,30);
        integerIntegerTwoType.addition(20,40);
        List<Double> doubles = new ArrayList<>();
        doubles.add(1.2);
        doubles.add(4.9);
        integerIntegerTwoType.multiply(doubles);

    }
}

class TwoType<T,V>{

    private T Key;
    private V value;

    private static final int two=0;

    public TwoType(T key,V value){
        this.Key=key;
        this.value=value;
    }

    public T getKey(){
        return Key;
    }

    public V getValue(){
        return value;
    }

    public void setKey(T key){
        this.Key=key;
    }

    public void setValue(V value){
        this.value=value;
    }



    public <U> void print(U value){
        System.out.println(value);
    }

    public static  <U,V>  void add(U value1,V value2){
        System.out.println(value1 +" "+value2);
    }

    public <U extends Number,V extends Number> Integer addition(U value1,V value2){
        return value1.intValue()+value2.intValue();

    }

    public <U extends Number> void multiply(List<U> v){

        for (U vs: v){
            System.out.println(vs);
        }
    }

    public void list(List<? super Integer> values){

       for (Object value: values ){
           System.out.println(value);
       }

    }


}
