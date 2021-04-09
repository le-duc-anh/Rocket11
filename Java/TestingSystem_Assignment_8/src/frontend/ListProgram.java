/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.List_Q1;

public class ListProgram {

    public static void main(String[] args) {
        question1();
    }

    public static void question1() {

        List_Q1 list = new List_Q1();

        list.getAmountOfStudent();

        list.getIndex4OfStudent();

        list.printFirstAndLastStudent();

        list.addStudentIntoFirstStudents();

        list.addStudentIntoLastStudents();

        list.reverseStudents();

        list.findStudentById();

        list.findStudentByName();

        list.findDuplicateStudent();

        list.deleteNameStudentId2();
    }
}
