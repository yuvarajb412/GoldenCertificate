package org.Java.oops;

public interface Animals {

    int value =10;
    public void start();
    public void  end();

    private void sleep(){
        System.out.println("The animal is sleeping");
    }

    static  void  done(){
        System.out.println("The animal is dead");
    }

    default void on(){
        System.out.println("The game is on ");
    }

    default void some(){
        System.out.println("something new");
    }

}
interface Animal1 extends Animals{
   void start();
   void end();
    default void on(){
        System.out.println("The game is on  Animal1");
    }

}
