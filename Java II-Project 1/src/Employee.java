/*
 * File:    Employee.java
 * Author:  Anthony Smith
 * Date:    November 11 2018
 * Purpose: Super class allowing the construction of an
 * Employee object
 */
public class Employee {
    //declare private instance variables
    private String employeeName;
    private int monthlySalary;
    //constructor
    public Employee(String employeeName, int monthlySalary) {
        this.employeeName = employeeName;
        this.monthlySalary = monthlySalary;
    }
    //calculate annual salary method
    public double annualSalary(){
        int annualSalary = monthlySalary *12;
        return annualSalary;
    }
    //toString method
    @Override
    public String toString() {
        return
                "Employee Name: " + employeeName + "\n" +
                "Monthly Salary: " + monthlySalary + "\n" +
                "Annual Salary: " + annualSalary() + "\n" +
                "Employee Type: Employee\n";

    }
    //getter methods
    public String getEmployeeName() {
        return employeeName;
    }
    public int getMonthlySalary() {
        return monthlySalary;
    }

}
