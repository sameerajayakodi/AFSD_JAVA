package org.samee.lk.student_management_service.dependencyInjection;

public class Demo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(new Student());
        teacher.student.play();
    }

}
