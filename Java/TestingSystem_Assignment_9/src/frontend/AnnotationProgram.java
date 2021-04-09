/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Annotations;
import java.util.Date;

public class AnnotationProgram {

    public static void main(String[] args) {
        Annotations annotations = new Annotations();

        quesiton1();
        annotations.question2();
    }

    @SuppressWarnings("deprecation")
    public static void quesiton1() {
        Date date = new Date(2020, 4, 29);
        System.out.println(date);
    }
}
