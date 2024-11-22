package org.Java.oops;

import java.util.Arrays;

public class classAndConstructor {

    int id ;
    String name;
    String[] skills;
   //default constructor
   classAndConstructor(){
        id=1;
        name="yuvaraj";
        skills = new String[]{
               "java","junit","selenium","RestApi"
        };
    }
    //parameterised constructor
    classAndConstructor(int id,String name,String[] skills){
        this.id=id;
        this.name=name;
        this.skills=skills;
    }


    public void studentValues(){

        System.out.println("The student id is"+id);
        System.out.println("The student name is"+name);
        System.out.println("The student skills are "+ Arrays.toString(skills));

    }

}

class s {

    public static void main(String[] args){
        classAndConstructor classAndConstructor = new classAndConstructor();
        classAndConstructor.studentValues();
        classAndConstructor classAndConstructor1 = new classAndConstructor(2,"Dinakaran", new String[]{"java","selenium","junit","testng"});
        classAndConstructor1.studentValues();

    }
}


