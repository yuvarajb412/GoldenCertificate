package org.Java.Collection;

import java.util.*;
import java.util.function.Consumer;

public class ComparableC {
    public static void main(String[] args) {

        List<Students> list= new ArrayList<>();

        list.add(new Students("yuvaraj",20));
        list.add(new Students("sss",30));
        list.add(new Students("yuvaraj",20));
//        System.out.println(list);
//
//       TreeSet<Students> list1=new TreeSet<>();
//        list1.add(new Students("yuvaraj",20));
//        list1.add(new Students("sss",30));
//        list1.add(new Students("yuvaraj",20));
//        System.out.println(list1);
//
//        HashSet<Students> list2=new HashSet<>();
//        list2.add(new Students("yuvaraj",20));
//        list2.add(new Students("sss",30));
//        list2.add(new Students("yuvaraj",20));
        System.out.println(list.toString());

        Comparator<Students> studentsComparator= new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return Integer.compare(o2.getGrade(),o1.getGrade());
            }
        };
        Collections.sort(list,studentsComparator);

        System.out.println(list.toString());






    }
}

class Students implements Comparable<Students>{
    private String name;
    private int grade;

    Students(String name,int grade){
        this.name=name;
        this.grade=grade;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }

    public String getName(){
        return this.name;
    }
    public int getGrade(){
        return this.grade;
    }

    public int compareTo(Students students){
        return Integer.compare(this.grade,students.grade);
    }

    public String toString(){
        return this.name+" "+this.grade;
    }

}
