package org.Java.oops;

/*
 inheritance is a fundamental concept in oops. that allows subclass to inherit the
 properties and behaviours of another class this enables code reusability
 and established a natural hierarchy
 between classes
 */
  /*
       single inheritance-A class inherits from one superclass
   */
public class SingleInheritance {

    public static  void main(String[] args){
        Dog dog= new Cat(10);
        dog.start();
        dog.end();
        dog.startEnd();




        Cat dog2 = new Cat(20);
        dog2.start();
        dog2.end();
        dog2.startEnd();






        Dog dog1 = new Dog(30);
        dog1.start();
        dog1.end();
        dog1.startEnd();


    }
}
class Dog{

    int value;

    Dog(int value){
        this.value=value;
        System.out.println("the value is "+value);
    }

    public void start(){
        System.out.println("The Dog is walking....");

    }

    public void end(){
        System.out.println("The Dog stopped Walking...");
    }

    public void startEnd(){
        System.out.println("It's doing both things");
    }


}
 class Cat extends Dog{

    Cat(int value){
        super(value);
    }

    public void start(){
        System.out.println("The cat is Walking....");
    }
    public void end(){
        System.out.println("The cat stopped walking...");
    }

    public  void meow(){
        System.out.println("This cat is meow..");
    }
}
