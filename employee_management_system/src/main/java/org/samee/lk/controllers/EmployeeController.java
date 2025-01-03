package org.samee.lk.controllers;


import org.samee.lk.dto.EmployeeDTO;
import org.samee.lk.entity.Department;
import org.samee.lk.entity.Employee;
import org.samee.lk.model.EmployeeModel;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static org.samee.lk.model.EmployeeModel.saveEmployee;


public class EmployeeController {
    private static Scanner scanner = new Scanner(System.in);

    public static void createEmployee() {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee email: ");
        String email = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        Double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter department name: ");
        String departmentName = scanner.nextLine();

        EmployeeDTO employeeDTO = new EmployeeDTO(name, email, salary, departmentName);
        EmployeeModel.saveEmployee(employeeDTO);

        System.out.println("Employee created successfully!");
    }

    public static void getAllEmployees() {
        List<Employee> employees = EmployeeModel.getAllEmployees();
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            employees.forEach(System.out::println);
        }
    }

    public static void updateEmployee() {
        System.out.print("Enter employee ID to update: ");
        Long id = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Enter new employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter new employee email: ");
        String email = scanner.nextLine();

        System.out.print("Enter new employee salary: ");
        Double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter new department name: ");
        String departmentName = scanner.nextLine();

        EmployeeDTO employeeDTO = new EmployeeDTO(name, email, salary, departmentName);
        EmployeeModel.updateEmployee(id, employeeDTO);

        System.out.println("Employee updated successfully!");
    }

    public static void deleteEmployee() {
        System.out.print("Enter employee ID to delete: ");
        Long id = scanner.nextLong();
        scanner.nextLine();

        EmployeeModel.deleteEmployee(id);
        System.out.println("Employee deleted successfully!");
    }
}
