package org.Java.Lambdas.hard;

import io.cucumber.java.an.E;
import io.cucumber.java.bs.A;
import io.cucumber.java.it.Ma;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeClass {

    public static void main(String[] args) {

        List<Employee>
                employeeList
                = Arrays.asList(new Employee("yuvara",67),
              new Employee("Hemanth",89),
                new Employee("syed",78),
                new Employee("pradeep",90),
                new Employee("deepan",89));


       List<String> v= employeeList.stream().filter(employee -> employee.getPercentage() > 80)
               .map(Employee::getName).collect(Collectors.toList());

        System.out.println(v);


    }
}


class Employee{
    private  String name;
    private int percentage;


    public Employee(String name,int percentage){
        this.name=name;
        this.percentage = percentage;
    }

    public String getName(){
        return  name;
    }
    public int getPercentage()
    {
        return percentage;
    }



}
