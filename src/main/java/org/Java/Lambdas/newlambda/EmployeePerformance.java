package org.Java.Lambdas.newlambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeePerformance {
    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
                new Employees(1, "Alice", "IT", 85.0, 90000.0),
                new Employees(2, "Bob", "HR", 55.0, 60000.0),
                new Employees(3, "Charlie", "IT", 92.0, 95000.0),
                new Employees(4, "David", "Finance", 48.0, 70000.0),
                new Employees(5, "Eve", "IT", 75.0, 85000.0),
                new Employees(6, "Frank", "HR", 60.0, 65000.0),
                new Employees(7, "Grace", "Finance", 92.0, 110000.0)
        );

   Map<String,List<String>>  ss= employees
                .stream()
                .filter(e->e.getPerformanceScore() >= 50.0)
                .sorted(Comparator.comparingDouble(Employees::getPerformanceScore).reversed())
                .limit(3)
                .collect(Collectors.groupingBy(
                        Employees::getDepartment,
                       Collectors.mapping(
                               e->e.getName()+"="+e.getPerformanceScore(),
                               Collectors.toList()
                               )
                ));


        System.out.println(ss);





    }
}



class Employees{

    private int id;
    private String name;
    private String department;
    private  double performanceScore;
    private double salary;


    public Employees(int id, String name,String department,double performanceScore,double salary){
        this.id =id;
        this.name= name;
        this.department= department;
        this.performanceScore=performanceScore;
        this.salary=salary;

    }

    public int getId(){
        return  id;
    }

    public String getName(){
        return  name;
    }
    public String getDepartment(){
        return  department;
    }
    public double getSalary(){
        return salary;
    }

    public double getPerformanceScore(){
        return performanceScore;
    }

    public String toString(){
        return  id+ " "+" "+name+" "+department+" "+salary;
    }

    }



