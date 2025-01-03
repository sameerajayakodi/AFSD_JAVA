package org.samee.lk.model;

import org.hibernate.query.Query;
import org.samee.lk.dto.DepartmentDTO;
import org.samee.lk.entity.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.samee.lk.util.GetSessionFactory;

import java.util.List;

public class DepartmentModel {

    private static SessionFactory sessionFactory = GetSessionFactory.getSessionFactory();

    public static void saveDepartment(DepartmentDTO department1) {
        Department department = new Department();
        department.setName(department1.getName());
        department.setLocation(department1.getLocation());
        department.setManager(department1.getManager());
        department.setBudget(department1.getBudget());

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.persist(department);
            session.getTransaction().commit();
        }
    }

    // Get All Departments
    public static List<Department> getAllDepartments() {
        try (Session session = sessionFactory.openSession()) {
            Query<Department> query = session.createQuery("FROM Department", Department.class);
            return query.getResultList();
        }
    }

    // Update Department
    public static void updateDepartment(Long id, DepartmentDTO updatedData) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Department department = session.get(Department.class, id);
            if (department != null) {
                department.setName(updatedData.getName());
                department.setLocation(updatedData.getLocation());
                department.setManager(updatedData.getManager());
                department.setBudget(updatedData.getBudget());
                session.update(department);
                session.getTransaction().commit();
            } else {
                System.out.println("Department not found with ID: " + id);
            }
        }
    }
    // Delete Department
    public static void deleteDepartment(Long id) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Department department = session.get(Department.class, id);
            if (department != null) {
                session.remove(department);
                session.getTransaction().commit();
            } else {
                System.out.println("Department not found with ID: " + id);
            }
        }
    }

}
