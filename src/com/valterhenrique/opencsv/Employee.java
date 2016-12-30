package com.valterhenrique.opencsv;

public class Employee {

    private int empId;
    private String firstName;
    private String lastName;
    private float salary;

    public Employee() {}

    public Employee(int empId, String firstName, String lastName, float salary) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
