package org.samee.lk.controllers;

import org.samee.lk.dto.DepartmentDTO;
import org.samee.lk.entity.Department;
import org.samee.lk.model.DepartmentModel;

import java.util.List;
import java.util.Scanner;

public class DepartmentController {


        public static void createDepartment() {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter department name: ");
            String name = scanner.nextLine();

            System.out.print("Enter department location: ");
            String location = scanner.nextLine();

            System.out.print("Enter department manager: ");
            String manager = scanner.nextLine();

            System.out.print("Enter department budget: ");
            Double budget = scanner.nextDouble();
            DepartmentDTO departmentDTO = new DepartmentDTO(name, location, manager, budget);
            DepartmentModel.saveDepartment(departmentDTO);
        }

    // Get All Departments
    public static void getAllDepartments() {
        List<Department> departments = DepartmentModel.getAllDepartments();
        departments.forEach(System.out::println);
    }

    // Update Department
    public static void updateDepartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter department ID to update: ");
        Long id = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Enter updated name: ");
        String name = scanner.nextLine();

        System.out.print("Enter updated location: ");
        String location = scanner.nextLine();

        System.out.print("Enter updated manager: ");
        String manager = scanner.nextLine();

        System.out.print("Enter updated budget: ");
        Double budget = scanner.nextDouble();

        DepartmentDTO updatedData = new DepartmentDTO(name, location, manager, budget);
        DepartmentModel.updateDepartment(id, updatedData);
    }

    // Delete Department
    public static void deleteDepartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter department ID to delete: ");
        Long id = scanner.nextLong();
        DepartmentModel.deleteDepartment(id);
    }
}
