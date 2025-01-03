package org.samee.lk;

import jakarta.persistence.Embeddable;
import org.samee.lk.controllers.DepartmentController;
import org.samee.lk.controllers.EmployeeController;
import org.samee.lk.dto.DepartmentDTO;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DepartmentController.createDepartment();
        EmployeeController.createEmployee();
    }
}