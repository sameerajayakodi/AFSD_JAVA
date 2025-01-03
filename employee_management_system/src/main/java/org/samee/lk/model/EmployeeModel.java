package org.samee.lk.model;

import jakarta.persistence.Query;
import org.samee.lk.dto.EmployeeDTO;
import org.samee.lk.entity.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.samee.lk.entity.Employee;
import org.samee.lk.util.GetSessionFactory;

import java.util.Date;

public class EmployeeModel {
    private static SessionFactory sessionFactory = GetSessionFactory.getSessionFactory();

    public static void saveEmployee(EmployeeDTO employeeDTO) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            // Fetch the department by name
            Department department = session.createQuery("FROM Department WHERE name = :name", Department.class)
                    .setParameter("name", employeeDTO.getDepartmentName())
                    .uniqueResult();

            if (department == null) {
                System.out.println("Department not found. Please create the department first.");
                session.getTransaction().rollback();
                return;
            }

            // Create Employee entity and map fields
            Employee employee = new Employee();
            employee.setName(employeeDTO.getName());
            employee.setEmail(employeeDTO.getEmail());
            employee.setSalary(employeeDTO.getSalary());
            employee.setStartDate(new Date()); // Set the current date for the start date
            employee.setDepartment(department);

            // Save the employee
            session.persist(employee);
            session.getTransaction().commit();

            System.out.println("Employee saved successfully: " + employee);
        } catch (Exception e) {
            e.printStackTrace();
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
