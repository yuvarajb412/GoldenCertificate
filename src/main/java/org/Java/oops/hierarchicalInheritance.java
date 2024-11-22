package org.Java.oops;

/*
hierarchical inheritance -  multiple subclasses inherit
from a  single  superclass.

 */

public class hierarchicalInheritance {

    public static void main(String[] args){

        car car= new car();
        car.start();
        car.end();

        car  car1 = new swift();
        car1.start();
        car1.end();



    }
}

class  car{

    public void start(){

        System.out.println("The car is started...");
    }

    public void end(){
        System.out.println("The car is stopped...");
    }

}

class toyota extends car{
    public void  start(){
        System.out.println("The toyota car is started...");
    }
    public void end(){
        System.out.println("The toyota car is ended...");
    }
}

class swift extends car{
    public void start(){
        System.out.println("The swift car is stated...");
    }

    public void end(){
        System.out.println("The swift car is ended...");
    }
}
