/*
 * File:    Salesman.java
 * Author:  Anthony Smith
 * Date:    04 November 2018
 * Purpose: Subclass of Employee adding in characteristics of how an salesman's salary is calculated
 */
public class Salesman extends Employee {
    private int annualSales;
    //constructor for subclass
    public Salesman(String employeeName, int monthlySalary, int annualSales) {
        super(employeeName, monthlySalary);
        this.annualSales = annualSales;
    }
    //overridden annual salary method for Salesman subclass
    @Override
    public double annualSalary(){

          double totalSalary;
          double commission = annualSales * .2;
          if (commission > 20000){
            commission = 20000;
        }
        totalSalary = commission + super.annualSalary();
        Math.round(totalSalary);
        return totalSalary;
    }
    //overridden toString method
    @Override
    public String toString() {
                return
                "Employee Name: " + getEmployeeName() + "\n" +
                "Monthly Salary: " + getMonthlySalary() + "\n"+
                "Annual Salary: " + annualSalary() + "\n" + "Employee type: Salesman\n" + "Annual Sales: " + annualSales + "\n";
    }
}
