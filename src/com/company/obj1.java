package com.company;

public class obj1 {
    public static void main(String[] args) {

        Employee sita = new Employee();
        Employee ram = new Employee();

        ram.id = 2;
        ram.name = "ram";
        ram.salary=2000;

        sita.name= "sita";
        sita.id= 1;
        sita.salary=1000;

        sita.printDetails();



        int salary=ram.getSalary();
        System.out.println(salary);
        System.out.println(ram.salary);






    }
}


class Employee{
    int id;
    String name;
    int salary;

    public int getSalary() {
        return salary;
    }
    public void printDetails(){
        System.out.println("The name of employee is " + name);
        System.out.println("The id of employee is " + id);
    }
}