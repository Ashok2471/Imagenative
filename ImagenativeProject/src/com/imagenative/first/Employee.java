package com.imagenative.first;
import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            
            // Taking user input for employee details
            System.out.println("Enter Employee ID: ");
            String employeeId = scanner.nextLine();

            System.out.println("Enter First Name: ");
            String firstName = scanner.nextLine();

            System.out.println("Enter Last Name: ");
            String lastName = scanner.nextLine();

            System.out.println("Enter Email: ");
            String email = scanner.nextLine();

            System.out.println("Enter Phone Number: ");
            String phoneNumber = scanner.nextLine();

            System.out.println("Enter Date of Joining (YYYY-MM-DD): ");
            LocalDate doj = LocalDate.parse(scanner.nextLine());

            System.out.println("Enter Monthly Salary: ");
            double monthlySalary = Double.parseDouble(scanner.nextLine());

            // Establishing database connection (using an in-memory H2 database for demonstration)
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mine", "root", "Lnani@22");

            // Inserting user-provided employee data into the database
            String insertQuery = "INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, doj, salary) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
            insertStatement.setString(1, employeeId);
            insertStatement.setString(2, firstName);
            insertStatement.setString(3, lastName);
            insertStatement.setString(4, email);
            insertStatement.setString(5, phoneNumber);
            insertStatement.setDate(6, java.sql.Date.valueOf(doj));
            insertStatement.setDouble(7, monthlySalary);
            insertStatement.executeUpdate();

            // Calculating and displaying tax deduction
            double yearlySalary = calculateYearlySalary(doj, monthlySalary);
            double taxAmount = calculateTaxAmount(yearlySalary);
            double cessAmount = calculateCessAmount(yearlySalary);

            System.out.println("Employee Code: " + employeeId);
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Yearly Salary: " + yearlySalary);
            System.out.println("Tax Amount: " + taxAmount);
            System.out.println("Cess Amount: " + cessAmount);

            // Closing resources
            insertStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static double calculateYearlySalary(LocalDate doj, double monthlySalary) {
        LocalDate currentDate = LocalDate.now();
        int monthsWorked = (currentDate.getYear() - doj.getYear()) * 12 + currentDate.getMonthValue() - doj.getMonthValue();
        return monthsWorked >= 12 ? monthlySalary * monthsWorked : 0;
    }

    private static double calculateTaxAmount(double yearlySalary) {
        double taxAmount = 0.0;
        if (yearlySalary > 1000000) {
            taxAmount = yearlySalary * 0.2;
        } else if (yearlySalary > 500000) {
            taxAmount = 25000 + (yearlySalary - 500000) * 0.1;
        } else if (yearlySalary > 250000) {
            taxAmount = (yearlySalary - 250000) * 0.05;
        }
        return taxAmount;
    }

    private static double calculateCessAmount(double yearlySalary) {
        return yearlySalary > 2500000 ? yearlySalary * 0.02 : 0;
    }
}
