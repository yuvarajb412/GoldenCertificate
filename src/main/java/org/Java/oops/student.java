package org.Java.oops;


import java.util.Arrays;

/*
  Encapsulation is one of the main principle in oops concepts and it will bind the code and data. it restricting
  some  access to some components, this achieved through access modifiers
  Access Modifier - public  with in the whole project,
  private - with in class ,
   default  - with i package,
  protected  - with in package and it's subclass
 */
class Encapsulation {

    public static void main(String[] args){

        student std = new student(1,"yuvaraj",new String[]{"java","aws","testng"});

        System.out.println(std.getId()+" "+ std.getName()+" "+ std.getSkills());
        std.setId(2);
        System.out.println(std.getId()+" "+ std.getName()+" "+std.getSkills());




    }
}

public class student {

    private int id;
    private String name;
    private String[] skills;

    public student(int id,String name,String[] skills){
        this.id = id;
        this.name= name;
        this.skills=skills;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSkills(){
        return Arrays.toString(skills);
    }

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name= name;
    }
    public void setSkills(String[] skills){
        this.skills=skills;
    }



}
