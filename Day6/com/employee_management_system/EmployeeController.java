package com.employee_management_system;

import java.util.ArrayList;

public class EmployeeController {
    public static void main(String[] args) {
        //initialising List of Employee object
        ArrayList<Employee>employees=new ArrayList<>();

        FullTimeEmployee vinay = new FullTimeEmployee();
        vinay.setFullTimeEmployee(123,"Vinay Jadaun",12000);

        FullTimeEmployee udit=new FullTimeEmployee();
        udit.setFullTimeEmployee(234,"Udit",13000);

        PartTimeEmployee utkarsh=new PartTimeEmployee();
        utkarsh.setPartTimeEmployee(345,"Utkarsh",4,100);

        vinay.assignDepartment("Marketing");
        udit.assignDepartment("Management");
        utkarsh.assignDepartment("HR");

        employees.add(vinay);
        employees.add(udit);
        employees.add(utkarsh);
        for(int i=0;i< employees.size();i++){
            employees.get(i).displayDetails();
            System.out.println();
        }

    }
}