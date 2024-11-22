package org.Java.oops;

public class AAnonymous {
    public static void main(String[] args) {

        Moon moon = new Moon() {
            static  int a=100;

            @Override
            public void shine() {
                System.out.println("The moon is shining..");
                System.out.println(a);
                hello();
            }

            public  void  hello(){
                System.out.println("mnksdn nsdc nm ");
            }
        };

        moon.shine();



    }
}

interface Moon{

    void shine();

}
