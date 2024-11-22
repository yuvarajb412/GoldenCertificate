package org.Java.oops;

/*
A class inherit a super class ,  the super class, which also subclass for another class
 */

import javax.crypto.spec.PSource;

public class MultilevelInheritance {

    public static void main(String[] args){

        Dogs dogs = new Dogs();
        dogs.start();
        dogs.end();
        dogs.dogSpecial();

        System.out.println("---------------");

        Cats cats= new Cats();
        cats.start();
        cats.end();
        cats.catSpecial();
        cats.dogSpecial();

        System.out.println("----------------");

        Tiger tiger = new Tiger();
        tiger.catSpecial();
        tiger.dogSpecial();
        tiger.TigerSpecial();
        tiger.start();
        tiger.end();

        System.out.println("--------");
        Dogs dogs1= new Tiger();
        dogs1.start();
        dogs1.end();
        dogs1.dogSpecial();


    }
}

class Dogs {

    public void start(){
        System.out.println("The dog is started to walk");
    }

    public void end(){
        System.out.println("The dog end is waling");
    }

    public void dogSpecial(){
        System.out.println("The dog is love to smell a object");
    }

}

class Cats extends Dogs{
    public void start(){
        System.out.println("The cats started walking");
    }

    public void end(){
        System.out.println("The cats ended is walking");
    }
    public void catSpecial(){
        System.out.println("The cat love beat a humans");
    }
}

class Tiger extends Cats{

    public void start(){
        System.out.println("The Tiger started to walk");
    }
    public void end(){
        System.out.println("The tiger ended is walking");
    }

    public void TigerSpecial(){
        System.out.println("The tiger love hunt thr humans");
    }

    public void dogSpecial(){
        System.out.println("The tiger love to eat a dog");
    }

    public void catSpecial(){
        System.out.println("The tiger love to eat a cat");
    }


}
