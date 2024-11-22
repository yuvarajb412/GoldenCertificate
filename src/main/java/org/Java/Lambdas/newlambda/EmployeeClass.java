package org.Java.Lambdas.newlambda;

import io.cucumber.java.be.I;
import io.cucumber.java.it.Ma;
import io.cucumber.java.sl.In;

import java.security.PublicKey;
import java.util.*;
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

       Map<Integer,String> byId= employees.stream()
                .collect(Collectors.toMap(
                        Employee::getId,
                        Employee::getName,
                        (e1,e2)->e2
                ));
        System.out.println(byId);
        System.out.println("-----------------------------");

            Map<String,List<String>> byDepartment=
                employees.stream()
                        .collect(Collectors.groupingBy(
                             Employee::getDepartment,
                                LinkedHashMap::new,
                             Collectors.mapping(
                                     Employee::getName,
                                     Collectors.toList()
                             )

                        ));

        System.out.println(byDepartment);
        System.out.println("-------------------------------");

    Map<String,Double> byAverage= employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                LinkedHashMap::new,
                                Collectors.averagingDouble(Employee::getSalary)
                        )
                );
        System.out.println(byAverage);
        System.out.println("---------------------------------");


     Map<String,List<String>> group=   employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(

                                Collectors.toList(),
                                list-> {
                                    System.out.println("Employees in Department: " + list);
                                    return list.stream()
                                            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                            .limit(2).
                                            map(
                                                    e -> e.getName() + " " + e.getSalary())
                                            .toList();
                                }
                        )
                ));

        System.out.println(group);
        System.out.println("----------------");

        List<Employee> e = Arrays.asList(
                new Employee(1, "Alice", "IT", 80000.0),
                new Employee(2, "Bob", "HR", 60000.0),
                new Employee(3, "Charlie", "IT", 90000.0),
                new Employee(4, "David", "Finance", 70000.0),
                new Employee(5, "Eve", "HR", 75000.0),
                new Employee(6, "Frank", "IT", 85000.0),
                new Employee(7, "Grace", "Finance", 110000.0)
        );

     Map<String,Double> cc=  e.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)


                        )
                );

        System.out.println(cc);
        System.out.println("-----------------");

        List<Employee> emp = Arrays.asList(
                new Employee(1, "Alice", "IT", 85.0),
                new Employee(2, "Bob", "HR", 55.0),
                new Employee(3, "Charlie", "IT", 92.0),
                new Employee(4, "David", "Finance", 48.0),
                new Employee(5, "Eve", "IT", 75.0),
                new Employee(6, "Frank", "HR", 60.0),
                new Employee(7, "Grace", "Finance", 92.0)
        );

       List<String> x= emp.stream()
                .filter(q->q.getSalary()>75)
                .map(s->s.getName()+"("+s.getSalary()+")")
                .toList();
        System.out.println(x);
        System.out.println("-------------------");
        List<Employee> employees1 = Arrays.asList(
                new Employee(1, "Alice", "IT", 80000.0),
                new Employee(2, "Bob", "HR", 60000.0),
                new Employee(3, "Charlie", "IT", 90000.0),
                new Employee(4, "David", "Finance", 70000.0),
                new Employee(5, "Eve", "HR", 75000.0)
        );

       Map<String,List<String>>   xx= employees1.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.mapping(
                                        Employee::getName,
                                        Collectors.toList()
                                )
                        )
                );

        System.out.println(xx);
        System.out.println("---------");

        List<Employee> employees2 = Arrays.asList(
                new Employee(1, "Alice", "IT", 80000.0),
                new Employee(2, "Bob", "HR", 60000.0),
                new Employee(3, "Charlie", "IT", 90000.0),
                new Employee(4, "David", "Finance", 110000.0),
                new Employee(5, "Eve", "HR", 75000.0)
        );

     List<Employee>  x1=  employees2
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
            //    .findFirst();

        System.out.println(x1);
        System.out.println("-------------------------------------");


        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Alice", "IT", 80000.0),
                new Employee(2, "Bob", "HR", 60000.0),
                new Employee(3, "Charlie", "IT", 90000.0),
                new Employee(4, "David", "Finance", 70000.0),
                new Employee(5, "Eve", "HR", 75000.0)
        );

      Map<String,Long>  a=  employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.counting()
                        )
                );

        System.out.println(a);
        System.out.println("--------------");

        List<Employee> employee = Arrays.asList(
                new Employee(1, "Alice", "IT", 85.0),
                new Employee(2, "Bob", "HR", 55.0),
                new Employee(3, "Charlie", "IT", 92.0),
                new Employee(4, "David", "Finance", 48.0),
                new Employee(5, "Eve", "IT", 75.0),
                new Employee(6, "Frank", "HR", 60.0),
                new Employee(7, "Grace", "Finance", 92.0)
        );
       Map<String,Double> z= employee.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        )
                );

        List<Employee> empl = Arrays.asList(
                new Employee(1, "Alice", "IT", 80000.0),
                new Employee(2, "Bob", "HR", 60000.0),
                new Employee(3, "Charlie", "IT", 90000.0),
                new Employee(4, "David", "Finance", 70000.0),
                new Employee(5, "Eve", "HR", 75000.0)
        );

       List<String> h= empl.stream()
                .filter(em->em.getSalary()>75000.0)
               .map(s-> s.getName()+" "+s.getSalary())
                .toList();
        System.out.println(h);
        System.out.println("-----------------");




        List<Employee> list = Arrays.asList(
                new Employee(1, "Alice", "IT", 80000.0),
                new Employee(2, "Bob", "HR", 60000.0),
                new Employee(3, "Charlie", "IT", 95000.0),
                new Employee(4, "David", "Finance", 120000.0),
                new Employee(5, "Eve", "HR", 75000.0)
        );
   Optional<Employee> Z=list.stream()
           .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
           .findFirst();

        System.out.println(Z);
        System.out.println("------------------");













    }

}

class Employee{

    private int id;
    private String name;
    private String department;
    private double salary;


    public Employee(int id, String name,String department,double salary){
        this.id =id;
        this.name= name;
        this.department= department;
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

    public String toString(){
        return  id+ " "+" "+name+" "+department+" "+salary;
    }

}
