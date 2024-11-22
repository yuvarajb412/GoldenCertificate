package org.Java.Lambdas;

public class Main {

    public static void main(String[] args) {

        Employee employee= new Employee("Yuvaraj",7000);
        Employee employee1= new Employee("Surya",6000);
        Employee employee2= new Employee("Deepan",9000);

        SalaryCalculator<Employee,Double,Double> salaryCalculator=
                (emp,bon)-> emp.getSalary()+bon;

       double finalSalary1=     salaryCalculator.addingBonus(employee,300.0);
       double finalSalary2=     salaryCalculator.addingBonus(employee1,400.0);
       double finalSalary3=     salaryCalculator.addingBonus(employee2,700.0);


        System.out.println(employee1.getName()+ " "+ finalSalary1);
    }
}
class Employee{

    private String name;
    private double salary;


    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

}

@FunctionalInterface
interface SalaryCalculator<T,V,U>{
    public U addingBonus(T employee,V bonus);
}


