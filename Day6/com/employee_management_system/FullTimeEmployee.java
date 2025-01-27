package com.employee_management_system;

//FullTimeEmployee is extending Employee class and implementing Department interface
public class FullTimeEmployee extends Employee implements Department{
    private int fixedSalary;

    //method overriding calculateSalary of Employee class
    @Override
    void calculateSalary(){
        this.baseSalary= this.fixedSalary;
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
    void setFullTimeEmployee(int employeeId,String name,int fixedSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.fixedSalary=fixedSalary;
        this.calculateSalary();
    }
    //method displays information of fullTimeEmployee
    void getFullTimeEmployee(){
        System.out.println("Id of Employee "+this.employeeId);
        System.out.println("Name of Employee "+this.name);
        System.out.println("Salary "+this.baseSalary);
        this.getDepartmentDetails();
    }

}
