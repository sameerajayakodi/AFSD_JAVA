package org.samee.lk.model;

import jakarta.persistence.Query;
import org.samee.lk.entity.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.samee.lk.entity.Employee;
import org.samee.lk.util.GetSessionFactory;
public class EmployeeModel {
    private static SessionFactory sessionFactory = GetSessionFactory.getSessionFactory();

    public static void saveEmployee(Employee employee) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.persist(employee);
            session.getTransaction().commit();
        }
    }

    public static Employee getEmployeeById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Employee.class, id);
        }
    }

    public static void updateEmployee(Employee employee) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.merge(employee);
            session.getTransaction().commit();
        }
    }

    public static void deleteEmployee(Long id) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Employee employee = session.get(Employee.class, id);
            if (employee != null) {
                session.remove(employee);
            }
            session.getTransaction().commit();
        }
    }

//    public List<Employee> getAllEmployees() {
//        try (Session session = sessionFactory.openSession()) {
//            Query<Employee> query = session.createQuery("from Employee", Employee.class);
//            return query.list();
//        }
//    }
}
