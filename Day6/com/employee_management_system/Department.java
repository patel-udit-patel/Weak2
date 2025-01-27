package com.employee_management_system;

//Department is an interface with two abstract methods
public interface Department {
    //methods further implemented int child classes
    void assignDepartment(String department);
    void getDepartmentDetails();
}
