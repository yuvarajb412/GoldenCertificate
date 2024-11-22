package org.Java.oops;

public class DeepCopy {
    public static  void  main(String[] args) throws CloneNotSupportedException{

        Person person = new Person("Tiruvannamalai");
        PersonDetails personDetails = new PersonDetails(1,"Surya",person);
        PersonDetails personDetails1 = personDetails;

        System.out.println(personDetails==personDetails1);

        PersonDetails personDetails2 = (PersonDetails) personDetails.clone();

        System.out.println(personDetails == personDetails2);

        person.address = " Vellore";

        System.out.println(personDetails.person.address);
        System.out.println(personDetails2.person.address);

        personDetails2.person.address="Marusur";

        System.out.println(personDetails.person.address);
        System.out.println(personDetails2.person.address);


    }
}

class  Person implements  Cloneable{

    String address;

    Person(String address){
        this.address=address;
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}

class PersonDetails implements  Cloneable{

    int id;
    String name;
    Person person;

    PersonDetails(int id,String name,Person person){
        this.id=id;
        this.name=name;
        this.person=person;
    }

    protected Object clone() throws CloneNotSupportedException {

        PersonDetails personDetails = (PersonDetails) super.clone();
       personDetails.person = (Person) personDetails.person.clone();
        return personDetails;
    }

}
