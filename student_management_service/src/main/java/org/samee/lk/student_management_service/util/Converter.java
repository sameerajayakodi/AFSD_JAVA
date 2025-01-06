package org.samee.lk.student_management_service.util;

import org.modelmapper.ModelMapper;
import org.samee.lk.student_management_service.dto.StudentDto;
import org.samee.lk.student_management_service.entity.Student;

public class Converter {
    private ModelMapper modelMapper;

    public Converter() {
        this.modelMapper = new ModelMapper();
    }

    public Student studentDtoToStudent(StudentDto studentDto) {
        return modelMapper.map(studentDto, Student.class);
    }

    public StudentDto studentToStudentDto(Student student) {
        return modelMapper.map(student, StudentDto.class);
    }
}
