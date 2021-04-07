/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import entity.MyMathFinal;
import entity.PrimaryStudent;
import entity.SecondaryStudent;
import entity.Student;

/**
 *
 * @author my pc
 */
public class Final {

    public void question1() {
        System.out.println(MyMathFinal.sum(6));
    }

    public void question2() throws Exception {
        Student student1 = new Student(1, "Nguyễn Văn A");
        System.out.println(student1);
        Student student2 = new Student(2, "Nguyễn Văn B");
        System.out.println(student2);
        Student student3 = new Student(3, "Nguyễn Văn C");
        System.out.println(student3);
    }

    public void question3() {
        PrimaryStudent.study();
        SecondaryStudent.study();
    }
}
