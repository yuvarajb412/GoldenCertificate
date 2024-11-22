package org.Java.oopsadv;

public class Generic<T extends Integer> {

   private  T value;


   public Generic(T value){
        this.value=value;
    }

    public void setValue(T value){
       this.value=value;
    }

    public T getValue(){
       return value;
    }

    public static int addition(int a, int b){
       return a+b;
    }

}

class M{
    public static void main(String[] args) {

        Generic<Integer> integerGeneric = new Generic<>(20);
        System.out.println(integerGeneric.getValue());
        integerGeneric.setValue(90);
        System.out.println(integerGeneric.getValue());
    }
}
