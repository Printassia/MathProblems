package Horsy.com.company;

import java.util.Scanner;

/*
The program prompts the user to input either their monthly salary or annual salary and display the results
 */

public class Salary {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter '1' to compute the monthly salary or '2' to compute the annual salary: ");
        int selection = input.nextInt();

        if (selection == 1)
            getMonthlySalary();

        else if (selection == 2)
            getAnnualSalary();

        else {
            System.out.println("Input either '1' for the monthly salary or '2' for the annual salary");
            System.exit(0);
        }

        input.close();
    }
    /** Compute the monthly salary */
    public static void getMonthlySalary(){
        System.out.print("What is your annual salary: ");
        Scanner input = new Scanner(System.in);
        double annualSalary = input.nextDouble();

        //Annual Salary Formula
        double monthlySalary = annualSalary / 12;

        //Display output
        System.out.printf("Annual Salary of $%.2f is $%.2f p/m" , annualSalary, monthlySalary);

        input.close();
    }
    /** Compute the annual salary */
    public static void getAnnualSalary(){
        System.out.print("What is your monthly salary: ");
        Scanner input = new Scanner(System.in);
        double monthlySalary = input.nextDouble();

        //Annual Salary Formula
        double annualSalary = monthlySalary * 12;

        //Display output
        System.out.printf("Monthly Salary of $%.2f is $%.2f p/y" , monthlySalary, annualSalary);

        input.close();
    }
}
