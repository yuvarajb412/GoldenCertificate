package org.Java.oops;

public class Abstract {
    public static void main(String[] args){

        Animal animal = new Lion();
        animal.sound();
        Animal.start();
        animal.end();


        Lion lion= new Lion();
        lion.sound();
        Lion.start();
        lion.end();
        lion.LionAge();



    }
}

abstract class Animal{

    private int animalAge;

    Animal(){
        this.animalAge=10;
        System.out.println("CONSTRUCTOR");
    }

    public int getAnimalAge(){
        return animalAge;
    }
    abstract public void sound();

    public static  void  start(){
        System.out.println("Animal is walking");
    }

    public void end(){
        System.out.println("Animal is ended the walking");
    }

}

class Lion extends Animal{



    public  void sound(){
        System.out.println("Lion make huge sound");

    }

    public void LionAge(){
        System.out.println("Lion age is "+getAnimalAge());
    }

}
