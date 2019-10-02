/*
 * File:    Executive.java
 * Author:  Anthony Smith
 * Date:    04 November 2018
 * Purpose: Subclass of Employee adding in characteristics of how an executive's salary is calculated
 */
public class Executive extends Employee {
    private double currentStockPrice;
    //constructor for subclass
    public Executive(String employeeName, int monthlySalary, int currentStockPrice) {
        super(employeeName, monthlySalary);
        this.currentStockPrice = currentStockPrice;
    }
    //overridden annual salary method for Executive subclass
    @Override
    public double annualSalary(){
        int bonus = 0;
        if(currentStockPrice > 50){
            bonus = 30000;
        }
        double totalSalary =  super.annualSalary() + bonus;
        return totalSalary;
    }
    //overridden toString method
    @Override
    public String toString() {
        return  "Employee Name: " + getEmployeeName() + "\n" +
                "Monthly Salary: " + getMonthlySalary() + "\n"+
                "Annual Salary: " + annualSalary() + "\n" +

                "Employee type: Executive\n" + "Stock Price: " + getCurrentStockPrice() + "\n";
    }

    public double getCurrentStockPrice() {
        return currentStockPrice;
    }
}
