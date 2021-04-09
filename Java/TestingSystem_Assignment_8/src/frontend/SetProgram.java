/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Set_Q1;

public class SetProgram {

    public static void main(String[] args) {
        question3();
    }

    private static void question3() {
        Set_Q1 set = new Set_Q1();

        // a
        set.getAmountOfStudent();

        // b
        set.getIndex4OfStudent();

        // c
        set.printFirstAndLastStudent();

    }
}
