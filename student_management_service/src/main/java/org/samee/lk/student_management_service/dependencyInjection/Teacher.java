package org.samee.lk.student_management_service.dependencyInjection;


public class Teacher {
    Student student;

    public Teacher(Student student){
        this.student = student;

    }

    public  void printStudent(){
        student.play();
    }
}
