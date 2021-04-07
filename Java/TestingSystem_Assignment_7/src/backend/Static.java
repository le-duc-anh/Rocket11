/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import entity.MyMathStatic;
import entity.PrimaryStudent;
import entity.SecondaryStudent;
import entity.Student;

/**
 *
 * @author my pc
 */
public class Static {

    private Student[] students;

    public void question1() throws Exception {
        students = new Student[3];
        students[0] = new Student(1, "Nguyễn Văn A");
        students[1] = new Student(2, "Nguyễn Văn B");
        students[2] = new Student(3, "Nguyễn Văn C");

        Student.college = "Đại học bách khoa";
        for (Student student : students) {
            System.out.println(student);
        }

        Student.college = "Đại học công nghệ";
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void question2() {

        System.out.println("Số tiền của nhóm trước khi tiêu: ");
        System.out.println(Student.getMoneyGroup());

        students[0].spend(50);
        System.out.println("Số tiền sau khi student 1 tiêu: ");
        System.out.println(Student.getMoneyGroup());

        System.out.println("Số tiền của student 2 trước khi tiêu: ");
        System.out.println(Student.getMoneyGroup());

        students[1].spend(20);
        System.out.println("Số tiền sau khi student 2 tiêu: ");
        System.out.println(Student.getMoneyGroup());

        System.out.println("Số tiền của student 3 trước khi tiêu: ");
        System.out.println(Student.getMoneyGroup());

        students[2].spend(150);
        System.out.println("Số tiền sau khi student 3 tiêu: ");
        System.out.println(Student.getMoneyGroup());

        for (Student student : students) {
            student.fund();
        }

        System.out.println("Số tiền sau khi đóng quỹ: ");
        System.out.println(Student.getMoneyGroup());
    }

    public void question3() {
        System.out.println(MyMathStatic.max(6, 9));
        System.out.println(MyMathStatic.min(6, 9));
        System.out.println(MyMathStatic.sum(6, 9));
    }

    public void question4() {
        Student.changecollege("Đại học Mở hà Nội");

        System.out.println("Sau khi gọi method changeCollege: ");
        for (Student student : students) {
            System.out.println(student.getCollege());
        }
    }

    public void question5() {
        System.out.println("Số sinh viên được tạo: ");
        System.out.println(Student.counter);
    }

    public void question6() throws Exception {
        Student student1 = new PrimaryStudent(1, "Nguyễn Văn A");
        Student student2 = new PrimaryStudent(2, "Nguyễn Văn B");
        Student student3 = new SecondaryStudent(3, "Nguyễn Văn C");
        Student student4 = new SecondaryStudent(4, "Nguyễn Văn D");
        Student student5 = new SecondaryStudent(5, "Nguyễn Văn E");
        Student student6 = new SecondaryStudent(6, "Nguyễn Văn F");

        System.out.println("Couter of Student: " + Student.counter);
        System.out.println("Couter of Primary Student: " + PrimaryStudent.counterPrimary);
        System.out.println("Couter of Secondary Student: " + SecondaryStudent.counterSecondary);
    }

    public void question7() throws Exception {
        Student student1 = new PrimaryStudent(1, "Nguyễn Văn A");
        Student student2 = new PrimaryStudent(2, "Nguyễn Văn B");
        Student student3 = new SecondaryStudent(3, "Nguyễn Văn C");
        Student student4 = new SecondaryStudent(4, "Nguyễn Văn D");
        Student student5 = new SecondaryStudent(5, "Nguyễn Văn E");
        Student student6 = new SecondaryStudent(6, "Nguyễn Văn F");
        Student student7 = new SecondaryStudent(7, "Nguyễn Văn G");
        Student student8 = new SecondaryStudent(8, "Nguyễn Văn H");
        Student student9 = new SecondaryStudent(9, "Nguyễn Văn I");
    }

}
