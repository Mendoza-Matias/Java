package com.mmendoza;

import com.mmendoza.domain.Student;
import com.mmendoza.domain.Teacher;

public class ExampleInheritance {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Juan");
        student.setLastName("Perez");

        Teacher teacher = new Teacher();
        teacher.setName("Pedro");
        teacher.setLastName("Lopez");
        teacher.setSubject("Mat");

        System.out.println(
                "Teacher :" + "\n" +
                        teacher.getName() + "\n"
                        + teacher.getLastName() + "\n"
                        + teacher.getSubject()
        );
    }
}
