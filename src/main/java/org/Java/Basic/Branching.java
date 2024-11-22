package org.Java.Basic;

public class Branching {

    public static void ifStatement(int value){

        if (value > 0){
            System.out.println("The value is valid");
        }

    }

    public static void ifElseStatement(int value){
        if (value >0){
            System.out.println("The value is valid");
        }else {
            System.out.println("The value is  not a valid");
        }
    }
    public static void ladderIfElseStatement(int value){
        if (value>40){
            System.out.println("The value is greater than 40");

        }else if (value > 20){
            System.out.println("The value is greater than 20");

        } else if (value > 0){
            System.out.println("The value is Valid");

        }else {
            System.out.println("The value is invalid");
        }
    }

    public static  void switchStatement(int value){

        switch (value){
            case 1:
                System.out.println("The value is one ");
                break;
            case 2:
                System.out.println("The value is 2");
                break;
            case 3:
                System.out.println("The value is 3");
                break;
            default:
                System.out.println("The value is invalid");
        }
    }

   public static void main(String[] args){
      ifStatement(10);
      ifElseStatement(20);
      ladderIfElseStatement(30);
      switchStatement(2);
   }
}
