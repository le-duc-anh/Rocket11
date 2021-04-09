/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import entity.Student_ex1;

public class Set_Q1 {

    private Set<Student_ex1> students;
    private Scanner scanner;

    public Set_Q1() {
        scanner = new Scanner(System.in);
        students = new HashSet<>();
        inputStudents();
    }

    private void inputStudents() {
        // Input list students by scanner
//		System.out.println("Nhập số lượng student muốn nhập: ");
//		int n = ScannerUtils.inputIntWithString(scanner);
//
//		for (int i = 0; i < n; i++) {
//			students.add(new Student());
//		}

        // fix list students for testing
        students.add(new Student_ex1("A"));
        students.add(new Student_ex1("B"));
        students.add(new Student_ex1("C"));
        students.add(new Student_ex1("D"));
        students.add(new Student_ex1("E"));
        students.add(new Student_ex1("F"));
    }

    public void printStudent() {
        Iterator<Student_ex1> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }
    }

    // a) In ra tổng số phần tử của students
    public void getAmountOfStudent() {
        System.out.println("Student Amount: " + students.size());
    }

    // b) Lấy phần tử thứ 4 của students
    public void getIndex4OfStudent() {
        Iterator<Student_ex1> studentIterator = students.iterator();
        for (int i = 0; i < 2; i++) {
            studentIterator.next();
        }

        System.out.println("Student thứ 4: ");
        System.out.println(studentIterator.next());
    }

    // c) In ra phần tử đầu và phần tử cuối của students
    public void printFirstAndLastStudent() {
        Iterator<Student_ex1> studentIterator = students.iterator();
        System.out.println("Student đầu tiên:");
        System.out.println(studentIterator.next());

        for (int i = 0; i < students.size() - 2; i++) {
            studentIterator.next();
        }

        System.out.println("Student cuối cùng: ");
        System.out.println(studentIterator.next());
    }

}
