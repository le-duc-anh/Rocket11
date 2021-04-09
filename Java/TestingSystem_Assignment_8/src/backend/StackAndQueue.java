/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import entity.Student_ex1;

public class StackAndQueue {

    public void question2() {

        System.out.println("Thứ tự tới pv của các học sinh từ muộn nhất tới sớm nhất: ");
        printStudentComeEarly();

        System.out.println("Thứ tự tới pv của các học sinh từ sớm nhất tới muộn nhất: ");
        printStudentComeLate();
    }

    public void printStudentComeEarly() {

        Stack<Student_ex1> students = new Stack<>();
        students.push(new Student_ex1("Nguyễn Văn A"));
        students.push(new Student_ex1("Trần Văn Nam"));
        students.push(new Student_ex1("Nguyễn Văn Huyên"));
        students.push(new Student_ex1("Nguyễn Văn Nam"));

        System.out.println(students.pop());
        System.out.println(students.pop());
        System.out.println(students.pop());
        System.out.println(students.pop());
    }

    public void printStudentComeLate() {
        Queue<Student_ex1> students = new LinkedList<>();
        students.add(new Student_ex1("Nguyễn Văn A"));
        students.add(new Student_ex1("Trần Văn Nam"));
        students.add(new Student_ex1("Nguyễn Văn Huyên"));
        students.add(new Student_ex1("Nguyễn Văn Nam"));

        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());

    }
}
