package org.Java.Collection;

import java.util.*;

public class TreeMapC {
    public static void main(String[] args) {

//        TreeMap<String,Integer> integerTreeMap= new TreeMap<>();
//
//        integerTreeMap.put("yuvaraj",40);
//        integerTreeMap.put("venu",77);
//        integerTreeMap.put("deepan",20);
//
//
//        int value=0;
//        String key="";
//        for (Map.Entry<String,Integer> integerEntry: integerTreeMap.entrySet()){
//            if(value<integerEntry.getValue()){
//                value=integerEntry.getValue();
//                key=integerEntry.getKey();
//            }
//        }
//
//        System.out.println(key+ " "+value);

        HashMap<Student,Integer> studentIntegerTreeMap= new HashMap<>();
        studentIntegerTreeMap.put(new Student(1,"yuvaraj"),20);
        studentIntegerTreeMap.put(new Student(1,"yuvaraj"),30);
        studentIntegerTreeMap.put(new Student(1,"yuvarajqq"),30);

        System.out.println(studentIntegerTreeMap.size());

    }
}

class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public int compareTo(Student student){

       return Integer.compare(student.id,this.id);
    }


}
