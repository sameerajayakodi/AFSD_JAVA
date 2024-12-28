package org.samee.lk.controllers;


import org.samee.lk.entity.Employee;
import org.samee.lk.model.EmployeeModel;


public class EmployeeController {
    private EmployeeModel employeeModel = new EmployeeModel();

    public void createEmployee(Employee employee) {
        employeeModel.saveEmployee(employee);
        System.out.println("Employee created successfully: " + employee);
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
