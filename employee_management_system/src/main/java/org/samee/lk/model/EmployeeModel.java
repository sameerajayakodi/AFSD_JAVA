package org.samee.lk.model;

import jakarta.persistence.Query;
import org.samee.lk.dto.EmployeeDTO;
import org.samee.lk.entity.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.samee.lk.entity.Employee;
import org.samee.lk.util.GetSessionFactory;

import java.util.Date;
import java.util.List;

public class EmployeeModel {
    private static SessionFactory sessionFactory = GetSessionFactory.getSessionFactory();

    public static void saveEmployee(EmployeeDTO employeeDTO) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            Department department = session.createQuery("FROM Department WHERE name = :name", Department.class)
                    .setParameter("name", employeeDTO.getDepartmentName())
                    .uniqueResult();

            if (department == null) {
                System.out.println("Department not found. Please create the department first.");
                session.getTransaction().rollback();
                return;
            }

            Employee employee = new Employee();
            employee.setName(employeeDTO.getName());
            employee.setEmail(employeeDTO.getEmail());
            employee.setSalary(employeeDTO.getSalary());
            employee.setDepartment(department);

            session.persist(employee);
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> getAllEmployees() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Employee", Employee.class).list();
        }
    }

    public static void updateEmployee(Long id, EmployeeDTO employeeDTO) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            Employee employee = session.get(Employee.class, id);
            if (employee == null) {
                System.out.println("Employee not found.");
                session.getTransaction().rollback();
                return;
            }

            Department department = session.createQuery("FROM Department WHERE name = :name", Department.class)
                    .setParameter("name", employeeDTO.getDepartmentName())
                    .uniqueResult();

            if (department == null) {
                System.out.println("Department not found. Please create the department first.");
                session.getTransaction().rollback();
                return;
            }

            employee.setName(employeeDTO.getName());
            employee.setEmail(employeeDTO.getEmail());
            employee.setSalary(employeeDTO.getSalary());
            employee.setDepartment(department);

            session.update(employee);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteEmployee(Long id) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            Employee employee = session.get(Employee.class, id);
            if (employee == null) {
                System.out.println("Employee not found.");
                session.getTransaction().rollback();
                return;
            }

            session.remove(employee);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
