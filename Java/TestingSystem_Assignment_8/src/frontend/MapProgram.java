/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "A");
        students.put(2, "B");
        students.put(3, "C");
        students.put(4, "D");
        students.put(5, "E");

        System.out.println(students.keySet());

        System.out.println(students.values());

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " / " + "Name: " + entry.getValue());
        }
    }
}
