package org.Java.oops;



public class ShallowCopy {

    public static void main(String[] args) throws CloneNotSupportedException{

        Address address = new Address("Chennai");
        Students student = new Students(1,"Deepan",address);
        Students student1 = (Students) student.clone();
        student1.address.city="chittor";
        student.name="Yuvaraj";

        System.out.println(student1==student);
        System.out.println(student.address.city);
        System.out.println(student1.address.city);
        System.out.println(student1.name);
        System.out.println(student.name);


    }
}

class Address{

    String city;

    Address(String city){
        this.city=city;
    }
}

class Students implements Cloneable{
    int id ;
    String name;
    Address address;

    Students(int id, String name, Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    protected Object clone() throws CloneNotSupportedException{
        return  super.clone();
    }

}
