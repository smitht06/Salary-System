/*
 * File:    Executive.java
 * Author:  Anthony Smith
 * Date:    04 November 2018
 * Purpose: Main class designed to test Employee and all subclasses by reading items from a file
 * and constructing appropriate objects. Program prints out a summary of the information in the file provided
 */
import java.util.*;
import java.io.*;
public class Main{
    //scanner to scan for file
    private Scanner x;
    //arrays for each year
    private ArrayList<Employee> Employees2014 = new ArrayList<>();
    private ArrayList<Employee> Employees2015 = new ArrayList<>();
    public static void main(String[] args) {
        Main employeeInformation = new Main();
        employeeInformation.openFile();
        employeeInformation.readFile();
        employeeInformation.summary();
    }
    //open file method to print error is file is not found
    public void openFile(){
        try{
            x = new Scanner(new File("file.txt"));
        }
        catch (Exception e){
            System.out.println("file not found");
        }
    }
    //moethod to read input from file
    public void readFile(){
        //while loop to execute reading of file
        while(x.hasNext()){
            //create variables and assign them to a value in the file
            int year = x.nextInt();
            String type = x.next();
            String name = x.next();
            int monthlySalary = x.nextInt();
            //if statement to separate out employees by year and store them in respective arrays
            if(year == 2014) {
                //if statements to differentiate type of employee
                if (type.equalsIgnoreCase("Salesman")) {
                    int annualSales = x.nextInt();
                    Employees2014.add(new Salesman(name, monthlySalary, annualSales));
                } else if (type.equalsIgnoreCase("Executive")) {
                    int stockPrice = x.nextInt();
                    Employees2014.add(new Executive(name, monthlySalary, stockPrice));
                } else {
                    Employees2014.add(new Employee(name, monthlySalary));
                }
            //if statement to separate out employees by year and store them in respective arrays
            }else if(year == 2015){
                if (type.equalsIgnoreCase("Salesman")) {
                    int annualSales = x.nextInt();
                    Employees2015.add(new Salesman(name, monthlySalary, annualSales));
                } else if (type.equalsIgnoreCase("Executive")) {
                    int stockPrice = x.nextInt();
                    Employees2015.add(new Executive(name, monthlySalary, stockPrice));
                } else {
                    Employees2015.add(new Employee(name, monthlySalary));
                    }
                }
            }
        }
    //method ot output a summary of information read into the program from file
    public void summary(){
        //variables to store average salary
        int averageSalary2014 = 0;
        int averageSalary2015 = 0;
        System.out.println("2014 Records\n");
        //print out information stored in array
        for(Employee employee2014 : Employees2014){
            System.out.println(employee2014.toString());
            //add all employee salary together
            averageSalary2014 += employee2014.annualSalary();
        }
        //calculate average salary
        averageSalary2014 = averageSalary2014/Employees2014.size();

        System.out.println("\nAverage Salary for 2014 is: " + "$" + averageSalary2014);
        System.out.println("_____________");
        System.out.println("\n2015 Records \n");
        //print out information stored in array
        for (Employee employee2015 : Employees2015){
            System.out.println(employee2015.toString());
            //add all employee salary together
            averageSalary2015 += employee2015.annualSalary();
        }
        //calculate average salary
        averageSalary2015 = averageSalary2015/Employees2015.size();
        System.out.println("Average Salary for 2015 is: " + averageSalary2015);
    }

}


