package com.vti.backend;

import com.vti.entity.Student;

public class Encapsulation {

    public void question1() {
        Student student1 = new Student("Đăng", "Bắc Giang");
        student1.setScore(8);

        Student student2 = new Student("Quang Anh", "Bắc Giang");
        student2.setScore(10);

        Student student3 = new Student("Chiến", "Bắc Giang");
        student3.setScore(4);

        student3.plusScore(3);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}


