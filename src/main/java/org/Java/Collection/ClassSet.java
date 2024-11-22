package org.Java.Collection;

import java.util.*;

public class ClassSet {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();

        people.add(new Person(1,"yuvaraj"));
        people.add(new Person(1,"yuvaraj"));

        System.out.println(people.size());
        System.out.println(people);

    }
}

class Person implements Comparable<Person> {
    private int age;
   private String name;

   public Person(int age,String name){
       this.age=age;
       this.name=name;
   }

   public void setAge(int age){
       this.age=age;
   }
   public int getAge(){
       return age;
   }

   public void setName(String name){
       this.name=name;
   }
   public String getName(){
       return name;
   }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(o.age,this.age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
