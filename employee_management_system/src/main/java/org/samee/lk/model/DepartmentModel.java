package org.samee.lk.model;

import jakarta.persistence.Query;
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

    public static Department getDepartmentById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Department.class, id);
        }
    }

    public static void updateDepartment(Department department) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.merge(department);
            session.getTransaction().commit();
        }
    }

    public static void deleteDepartment(Long id) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Department department = session.get(Department.class, id);
            if (department != null) {
                session.remove(department);
            }
            session.getTransaction().commit();
        }
    }

//    public List<Department> getAllDepartments() {
//        try (Session session = sessionFactory.openSession()) {
//            Query<Department> query = session.createQuery("from Department", Department.class);
//            return query.list();
//        }
//    }
}
