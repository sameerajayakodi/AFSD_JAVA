package org.samee.lk.student_management_service.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.samee.lk.student_management_service.dto.StudentDto;
import org.samee.lk.student_management_service.service.StudentService;
import org.samee.lk.student_management_service.service.impl.StudentServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@WebServlet(name="studentApi", value = "/student/*")

public class StudentServlet extends HttpServlet {

    private StudentServiceImpl studentService;
    private ObjectMapper objectMapper;
    public StudentServlet() {
        this.objectMapper = new ObjectMapper();
        this.studentService = new StudentServiceImpl();
    }


    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        String pathInfo = req.getPathInfo();

        switch (pathInfo) {
            case "/get-all-student" :
                List<StudentDto> allStudents = studentService.getAllStudents();
                resp.getWriter().write("all Students");
                objectMapper.writeValue(resp.getWriter(), allStudents);
                resp.setStatus(200);

            case "/get-student-by-id" :
                int id = Integer.parseInt(req.getParameter("id"));
                StudentDto studentDto = studentService.getStudentById(id);
                resp.getWriter().write("student founded!");
                objectMapper.writeValue(resp.getWriter(), studentDto);
                System.out.println("get-student-by-id");
                resp.setStatus(200);


            default:
                resp.getWriter().write("unknown path");
                resp.setStatus(404);
        }
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Student doPost Running!");
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        StudentDto studentDto = new StudentDto();
        studentDto.setId(id);
        studentDto.setName(name);
        studentDto.setAge(age);
        studentService.addStudent(studentDto);
        objectMapper.writeValue(resp.getWriter(), studentDto );
        resp.setStatus(201);
        System.out.println("student created");

    }
    public void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        StudentDto studentDto = new StudentDto();
        studentDto.setId(id);
        studentDto.setName(name);
        studentDto.setAge(age);
        StudentDto updatedStudentDto = studentService.updateStudent(studentDto);
        objectMapper.writeValue(resp.getWriter(), updatedStudentDto);
        resp.getWriter().write("student update successful");
        resp.setStatus(204);
        System.out.println("student update Successfull");

    }
    public void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        boolean status = studentService.deleteStudent(id);
        if (status) {
            resp.getWriter().write("student delete successful");
            resp.setStatus(202);
        }else {
            resp.getWriter().write("student delete failed!");
            resp.setStatus(404);
        }
    }
}
