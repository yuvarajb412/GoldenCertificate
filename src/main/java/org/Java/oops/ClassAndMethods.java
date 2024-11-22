package org.Java.oops;

public class ClassAndMethods {
    int id;
    String name;


    public void  setAttributes(){
        id=1;
        name="yuvaraj";
        System.out.println(id+" "+name);

    }
    //this keyword  and instance method
    public void setAttributesViaParameter(int id, String name){
        this.id=id;
        this.name=name;
        System.out.println(id+" "+name);
    }
    // static method
    public static void setStaticAttribute(String name){//parameter

        System.out.println(name);
    }
    // variable arity  or varargs
    public void addition(String sum,int... args){

        for (int a: args){
            System.out.println(sum + " a"+ a);
        }
    }


}

class some {

    public static void main(String[] args){
        //creating object
        ClassAndMethods classAndMethods = new ClassAndMethods();
        classAndMethods.setAttributes();
        classAndMethods.setAttributesViaParameter(10,"something");//arguments
        ClassAndMethods.setStaticAttribute("Syed");

        classAndMethods.addition("Deepan",new int[]{10,20,30,40});
    }


}
