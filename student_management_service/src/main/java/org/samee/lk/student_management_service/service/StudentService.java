package org.samee.lk.student_management_service.service;

import org.samee.lk.student_management_service.dto.StudentDto;

import java.util.List;

public interface StudentService {
StudentDto addStudent(StudentDto studentDto);
StudentDto updateStudent(StudentDto studentDto);
boolean deleteStudent(Integer id);
List<StudentDto> getAllStudents();
StudentDto getStudentById(int id);
}
