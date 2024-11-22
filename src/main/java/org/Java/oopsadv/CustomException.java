package org.Java.oopsadv;

public class CustomException {

    public static void main(String[] args) {

        try {
            checked();
        } catch (Checked e) {
            System.out.println(e);
        }
        Unchecked();

    }


    public static void checked() throws Checked{
        throw  new Checked("error");
    }

    public static void Unchecked() {
        try {
            throw new Unchecked();
        }catch (Unchecked e){
            System.out.println(e);
        }

    }
}

class Checked extends Exception{
    public Checked(String string){
        super(string);
    }
    public Checked(){

    }
}

class Unchecked extends RuntimeException{
    public Unchecked(String string){
        super(string);
    }
    public Unchecked(){

    }

}
