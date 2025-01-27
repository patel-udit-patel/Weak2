package com.employee_management_system;

//Employee is an abstract class with one abstract method
public abstract class Employee  {
    protected int employeeId;
    protected String name;
    protected int baseSalary;
    protected String department;

    //method further overridden in child classes
    abstract void calculateSalary();

    //method displays basic information about Employee
    void displayDetails(){
        System.out.println("Employee Id "+this.employeeId);
        System.out.println("Name of Employee "+this.name);
        System.out.println("Base Salary "+this.baseSalary);
        System.out.println("Department "+this.department);
    }
}
