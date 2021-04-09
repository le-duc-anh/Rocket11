/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.time.LocalDate;
import java.util.Scanner;

import utils.ScannerUtils;

public class Student_ex1 implements Comparable<Student_ex1> {

    private static int counter = 0;

    private int id;
    private String name;
    private LocalDate birthDay;
    private int score;

    public Student_ex1() {
        inputStudent();
        setId(++counter);
    }

    public Student_ex1(String name) {
        this.name = name;
        setId(++counter);
    }

    public Student_ex1(String name, LocalDate birthDay, int score) {
        this.name = name;
        this.birthDay = birthDay;
        this.score = score;
        setId(++counter);
    }

    private void inputStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên student: ");
        name = ScannerUtils.inputString(scanner, "Please input a name as String...");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", birthDay=" + birthDay + ", score=" + score + '}';
    }

    @Override
    public int compareTo(Student_ex1 student) {
        if (name.compareTo(student.name) > 0) {
            return 1;
        }

        if (name.compareTo(student.name) < 0) {
            return -1;
        }

        return 0;
    }
}
