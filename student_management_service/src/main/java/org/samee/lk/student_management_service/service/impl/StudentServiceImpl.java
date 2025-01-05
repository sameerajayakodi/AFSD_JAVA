package org.samee.lk.student_management_service.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.samee.lk.student_management_service.dto.StudentDto;
import org.samee.lk.student_management_service.entity.Student;
import org.samee.lk.student_management_service.service.StudentService;
import org.samee.lk.student_management_service.util.GetSessionFactory;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    private final GetSessionFactory getSessionFactory;

    public StudentServiceImpl() {
        this.getSessionFactory = new GetSessionFactory();
    }

    @Override
    public StudentDto addStudent(StudentDto studentDto) {
        SessionFactory sessionFactory = getSessionFactory.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            Student student = new Student();
            student.setId(studentDto.getId());
            student.setName(studentDto.getName());
            student.setAge(studentDto.getAge());

            session.persist(student);
            session.getTransaction().commit();
        }

        return studentDto;
    }

    @Override
    public StudentDto updateStudent(StudentDto studentDto) {
        SessionFactory sessionFactory = getSessionFactory.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            Student currentStudent = session.createQuery("FROM Student WHERE id = :id", Student.class)
                    .setParameter("id", studentDto.getId())
                    .uniqueResult();

            if (currentStudent == null) {
                throw new IllegalArgumentException("Student with ID " + studentDto.getId() + " not found.");
            }

            currentStudent.setName(studentDto.getName());
            currentStudent.setAge(studentDto.getAge());
            session.update(currentStudent);

            session.getTransaction().commit();

            studentDto.setName(currentStudent.getName());
            studentDto.setAge(currentStudent.getAge());
        } catch (Exception e) {
            throw new RuntimeException("Failed to update student: " + e.getMessage(), e);
        }

        return studentDto;
    }

    @Override
    public boolean deleteStudent(Integer id) {
        boolean status;
        SessionFactory sessionFactory = getSessionFactory.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            Student student = session.get(Student.class, id);
            if (student != null) {
                session.remove(student);
                session.getTransaction().commit();
                status = true;
            } else {
                throw new IllegalArgumentException("Student with ID " + id + " not found.");
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to delete student: " + e.getMessage(), e);
        }

        return status;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<StudentDto> studentDtoList = new ArrayList<>();
        SessionFactory sessionFactory = getSessionFactory.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            List<Student> studentList = session.createQuery("FROM Student", Student.class).list();
            for (Student student : studentList) {
                studentDtoList.add(new StudentDto(student.getId(), student.getName(), student.getAge()));
            }

            session.getTransaction().commit();
        }

        return studentDtoList;
    }

    @Override
    public StudentDto getStudentById(int id) {
        StudentDto studentDto;
        SessionFactory sessionFactory = getSessionFactory.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            Student student = session.get(Student.class, id);
            if (student == null) {
                throw new IllegalArgumentException("Student with ID " + id + " not found.");
            }

            studentDto = new StudentDto(student.getId(), student.getName(), student.getAge());
            session.getTransaction().commit();
        }

        return studentDto;
    }
}
