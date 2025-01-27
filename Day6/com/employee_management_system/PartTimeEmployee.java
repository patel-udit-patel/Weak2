package com.employee_management_system;

public class PartTimeEmployee extends Employee implements Department{
    private int workingHours;
    private int paidPerHour;

    //method overriding calculateSalary of Employee class
    @Override
    void calculateSalary() {
        this.baseSalary=this.paidPerHour*this.workingHours;
    }
    //method overriding assignDepartment of Department interface
    @Override
    public void assignDepartment(String department) {
        this.department=department;
    }
    //method overriding getDepartmentDetail of Department interface
    @Override
    public void getDepartmentDetails() {
        System.out.println("Department "+this.department);
    }
    //method sets information of fullTimeEmployee
    public void setPartTimeEmployee(int employeeId,String name,int workingHours,int paidPerHour) {
        this.employeeId=employeeId;
        this.name=name;
        this.workingHours = workingHours;
        this.paidPerHour=paidPerHour;
        this.calculateSalary();
    }
    //method displays information of fullTimeEmployee
    public void getPartTimeEmployee(){
        System.out.println("Id of Employee "+this.employeeId);
        System.out.println("Name of Employee "+this.name);
        System.out.println("Salary "+this.baseSalary);
        this.getDepartmentDetails();
    }
}
