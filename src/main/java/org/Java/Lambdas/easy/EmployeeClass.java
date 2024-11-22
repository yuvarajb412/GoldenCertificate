package org.Java.Lambdas.easy;

import io.cucumber.java.sl.In;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeClass {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "IT", 80000.0),
                new Employee(2, "Bob", "HR", 60000.0),
                new Employee(3, "Charlie", "IT", 90000.0),
                new Employee(4, "David", "Finance", 70000.0),
                new Employee(5, "Eve", "HR", 75000.0)


        );

        Map<Integer,String> output = employees.stream()
                .collect(Collectors.toMap(
                        e->e.getId(),
                        e->e.getName(),
                          (e1,e2)-> e2
                ));

        System.out.println(output);

        Map<String,List<String>> byDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee-> Employee.getDepartment(),
                        Collectors.mapping(
                                e->e.getName(),
                                Collectors.toList()
                        )));

        System.out.println(byDepartment);
        Map<String,List<String>>
                v1 = employees.stream()
                .collect(Collectors.groupingBy(
                       Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list->list.stream()
                                        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                        .map(a-> a.getSalary()+" "+a.getName())
                                        .limit(2).toList()
                        )
                       ));
        System.out.println(v1);


    }
}

class Employee{

    private  int id;
    private  String name;
    private String department;
    private double salary;


    public Employee(int id, String name,String department,double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary =salary;
    }

    public  int getId(){
        return   id;
    }
    public  String getName(){
        return  name;
    }
    public  String getDepartment(){
        return  department;
    }

    public double getSalary(){
        return  salary;
    }

}
