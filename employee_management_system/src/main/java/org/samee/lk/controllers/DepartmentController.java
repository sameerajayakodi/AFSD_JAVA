package org.samee.lk.controllers;

import org.samee.lk.dto.DepartmentDTO;
import org.samee.lk.entity.Department;
import org.samee.lk.model.DepartmentModel;

import java.util.List;
import java.util.Scanner;

public class DepartmentController {


        public static void createDepartment() {
            // Use Scanner to get input from the user
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

        public Department getDepartmentById(Long id) {
            Department department = DepartmentModel.getDepartmentById(id);
            if (department != null) {
                System.out.println("Retrieved Department: " + department);
            } else {
                System.out.println("Department with ID " + id + " not found.");
            }
            return department;
        }

        public void updateDepartment(Department department) {
            DepartmentModel.updateDepartment(department);
            System.out.println("Department updated successfully: " + department);
        }

        public void deleteDepartment(Long id) {
            DepartmentModel.deleteDepartment(id);
            System.out.println("Department with ID " + id + " deleted successfully.");
        }

        // Uncomment if needed
//    public List<Department> getAllDepartments() {
//        List<Department> departments = departmentModel.getAllDepartments();
//        System.out.println("Retrieved all departments: " + departments);
//        return departments;
//    }
}
