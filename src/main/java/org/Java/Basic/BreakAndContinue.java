package org.Java.Basic;

public class BreakAndContinue {

    public static void breakControl(int value){

        for (int i=0; i<value;i++){

            if(i==4){
                break;
            }
            System.out.println("The value is"+i);
        }
    }

    public static void continueControl(int value){
        for (int i=0;i<value;i++){

            if(i==8){
                continue;
            }
            System.out.println("The value is"+i);
        }
    }
    public static void outerBreak(){
        Outer:
        for (int i=0; i< 10;i++){
            for (int j=0;j<10;j++){

                if(i ==3){
                    break Outer;
                }
                System.out.println("The value of I and J is"+i+" "+ j);
            }
        }
    }
    public static void outerContinue(){
        Outer:
        for (int i=0; i<10;i++){
            for (int j=0; j<10;j++){

                if(i ==3){
                    continue Outer;
                }
                System.out.println("The value of I and J is"+i+" "+ j);
            }
        }
    }

    public static void main(String[] args){
        System.out.println("--------------------");
        breakControl(10);
        System.out.println("--------------------");
        continueControl(10);
        System.out.println("--------------------");
        outerBreak();
        System.out.println("--------------------");
        outerContinue();
        System.out.println("--------------------");


    }
}


