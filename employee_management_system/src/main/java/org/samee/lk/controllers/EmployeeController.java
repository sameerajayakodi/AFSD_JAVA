package org.samee.lk.controllers;


import org.samee.lk.dto.EmployeeDTO;
import org.samee.lk.entity.Department;
import org.samee.lk.entity.Employee;
import org.samee.lk.model.EmployeeModel;

import java.util.Date;
import java.util.Scanner;

import static org.samee.lk.model.EmployeeModel.saveEmployee;


public class EmployeeController {
    private EmployeeModel employeeModel = new EmployeeModel();

    public static void createEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee email: ");
        String email = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        Double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume the remaining newline

        System.out.print("Enter department name: ");
        String departmentName = scanner.nextLine();

        // Create EmployeeDTO
        EmployeeDTO employeeDTO = new EmployeeDTO(name, email, salary, departmentName);

        // Send DTO to the model for processing
        EmployeeModel.saveEmployee(employeeDTO);

        System.out.println("Employee created successfully: " + employeeDTO);
    }



    public Employee getEmployeeById(Long id) {
        Employee employee = employeeModel.getEmployeeById(id);
        if (employee != null) {
            System.out.println("Retrieved Employee: " + employee);
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
        return employee;
    }

    public void updateEmployee(Employee employee) {
        employeeModel.updateEmployee(employee);
        System.out.println("Employee updated successfully: " + employee);
    }

    public void deleteEmployee(Long id) {
        employeeModel.deleteEmployee(id);
        System.out.println("Employee with ID " + id + " deleted successfully.");
    }

    // Uncomment if needed
//    public List<Employee> getAllEmployees() {
//        List<Employee> employees = employeeModel.getAllEmployees();
//        System.out.println("Retrieved all employees: " + employees);
//        return employees;
//    }
}
