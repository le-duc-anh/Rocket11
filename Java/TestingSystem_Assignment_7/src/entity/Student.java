/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import utils.ScannerUtils;

/**
 *
 * @author my pc
 */
public class Student {

    public static String college;
    private static int moneyGroup = 0;
    public static int counter = 0;
    public static final int maxStudent = 7;

    private final int id;
    private String name;

    public Student(int id, String name) throws Exception {

        if (counter > maxStudent) {
            throw new Exception("Không thể tạo quá 7 sinh viên");
        }

        this.id = ++counter;
        this.name = name;
        moneyGroup += 100;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static int getMoneyGroup() {
        return moneyGroup;
    }

    public static void spend(int money) {
        Student.moneyGroup -= money;
    }

    public void fund() {
        moneyGroup += 50;
    }

    public static void changecollege(String college) {
        Student.college = college;
    }

    public static String getCollege() {
        return college;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", college= " + college + '\'' + '}';
    }

    public static void study() {
        System.out.println("Đang học bài…");
    }
}
