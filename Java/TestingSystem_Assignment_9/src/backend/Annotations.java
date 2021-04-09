/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import entity.Student;

/**
 *
 * @author my pc
 */
public class Annotations {

    @SuppressWarnings("deprecation")
    public void question2() {
        Student student = new Student(1, "Nguyễn Văn A");
        System.out.println(student.getId());
        System.out.println(student.getName());

        System.out.println(student.getIdV2());

    }
}
