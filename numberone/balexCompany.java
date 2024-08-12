/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numberone;
import java.util.Scanner;

/**
 *
 * @author dudi
 */


public class balexCompany {
    // Constants
    private static final double MINIMUM_WAGE = 8.00;
    private static final int REGULAR_HOURS = 40;
    private static final int MAX_HOURS = 60;
    private static final double OVERTIME_RATE = 1.5;

    // Method to calculate and print total pay or an error
    public static void calculatePay(double basePay, int hoursWorked) {
        if (basePay < MINIMUM_WAGE) {
            System.out.println("Error: Hourly wage must be at least $" + MINIMUM_WAGE);
            return;
        }

        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Employees cannot work more than " + MAX_HOURS + " hours a week.");
            return;
        }

        double totalPay = 0.0;
        if (hoursWorked > REGULAR_HOURS) {
            int overtimeHours = hoursWorked - REGULAR_HOURS;
            totalPay = (REGULAR_HOURS * basePay) + (overtimeHours * basePay * OVERTIME_RATE);
        } else {
            totalPay = hoursWorked * basePay;
        }

        System.out.println("Total pay for the week: $" + totalPay);
    }

    // Method to get input from the user
    public static void getEmployeeDataAndCalculatePay(int employeeNumber) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base pay for Employee " + employeeNumber + ": ");
        double basePay = scanner.nextDouble();

        System.out.println("Enter hours worked by Employee " + employeeNumber + ": ");
        int hoursWorked = scanner.nextInt();

        System.out.print("Employee " + employeeNumber + ": ");
        calculatePay(basePay, hoursWorked);
    }

    public static void main(String[] args) {
        // Get data and calculate pay for Employee 1
        getEmployeeDataAndCalculatePay(1);

        // Get data and calculate pay for Employee 2
        getEmployeeDataAndCalculatePay(2);

        // Get data and calculate pay for Employee 3
        getEmployeeDataAndCalculatePay(3);
    }
}
