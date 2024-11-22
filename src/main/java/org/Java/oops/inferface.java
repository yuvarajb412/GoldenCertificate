package org.Java.oops;

import org.Java.Basic.OneDArray;

public class inferface {

    public static void main(String[] args){
       Animal1  animal1 = new one();
       animal1.on();
       animal1.some();
        System.out.println("------------");


        Animals animals = new one();
        animals.on();
        animals.some();


    }
}

class one implements Animal1,Animals{

    public void start(){
        System.out.println("The class one is started");
    }

    public void end(){
        System.out.println("The class one is ended");
    }

   public void on(){
        System.out.println("NBN NB");
    }

}
