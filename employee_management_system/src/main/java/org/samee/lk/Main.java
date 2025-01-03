package org.samee.lk;

import org.samee.lk.controllers.DepartmentController;
import org.samee.lk.controllers.EmployeeController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Department Operations");
            System.out.println("2. Employee Operations");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int mainChoice = scanner.nextInt();
            scanner.nextLine();

            switch (mainChoice) {
                case 1 -> departmentMenu();
                case 2 -> employeeMenu();
                case 0 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void departmentMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Department Operations ---");
            System.out.println("1. Create Department");
            System.out.println("2. Get All Departments");
            System.out.println("3. Update Department");
            System.out.println("4. Delete Department");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> DepartmentController.createDepartment();
                case 2 -> DepartmentController.getAllDepartments();
                case 3 -> DepartmentController.updateDepartment();
                case 4 -> DepartmentController.deleteDepartment();
                case 0 -> {
                    System.out.println("Returning to Main Menu...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void employeeMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Employee Operations ---");
            System.out.println("1. Create Employee");
            System.out.println("2. Get All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> EmployeeController.createEmployee();
                case 2 -> EmployeeController.getAllEmployees();
                case 3 -> EmployeeController.updateEmployee();
                case 4 -> EmployeeController.deleteEmployee();
                case 0 -> {
                    System.out.println("Returning to Main Menu...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
