/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

import entity.Student_ex1;
import java.util.Collections;

public class Comparing {

    private List<Student_ex1> students;

    public Comparing() {
        students = new ArrayList<>();
        inputStudents();
    }

    private void inputStudents() {
        students.add(new Student_ex1("A", LocalDate.parse("2020-05-29"), 8));
        students.add(new Student_ex1("B", LocalDate.parse("2020-05-29"), 10));
        students.add(new Student_ex1("D", LocalDate.parse("2015-05-04"), 6));
        students.add(new Student_ex1("C", LocalDate.parse("2020-01-29"), 5));
        students.add(new Student_ex1("E", LocalDate.parse("2020-04-29"), 8));
        students.add(new Student_ex1("F", LocalDate.parse("2020-02-29"), 3));

        System.out.println("List student vừa khởi tạo: ");
        printStudent();
    }

    private void printStudent() {
        for (Student_ex1 st : students) {
            System.out.println(st);
        }
    }

    public void question1() {
        Collections.sort(students);

        System.out.println("List sau khi sắp xếp theo tên/ ngày sinh/ điểm: ");
        printStudent();
    }

}
