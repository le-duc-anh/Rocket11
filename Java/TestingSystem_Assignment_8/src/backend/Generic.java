/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import entity.Employee;
import entity.Phone;
import entity.Staff;
import entity.Student_ex3;

public class Generic {

    public void question1_2_3() {
        // khởi tạo student có id là int
        Student_ex3<Integer> student1 = new Student_ex3<Integer>(1, "Nguyễn Văn A");

        // khởi tạo student có id là float
        Student_ex3<Float> student2 = new Student_ex3<Float>(2.0f, "Nguyễn Văn B");

        // khởi tạo student có id là double
        Student_ex3<Double> student3 = new Student_ex3<Double>(3.0, "Nguyễn Văn X");

        // Question 2: T generic method print object
        print(student1);
        print(student2);
        print(student3);

        // print number
        print(1);
        print(2f);
        print(3d);
    }

    public void question4() {
        // init array
        Integer[] arrInt = {5, 10, 15};
        Float[] arrFloat = {5f, 10f, 15f};
        Double[] arrDouble = {5.5, 10.2, 15.016547};

        // print array
        printArray(arrInt);
        printArray(arrFloat);
        printArray(arrDouble);
    }

    public void question5() {
        // khởi tạo employee có salaries datatype là int
        Integer[] salaryEmployee1 = {1000, 1200, 1200};
        Employee<Integer> employee1 = new Employee<Integer>(1, "Nguyễn Văn A", salaryEmployee1);

        System.out.println("Employee vừa khởi tạo: ");
        print(employee1);
        System.out.println("Tháng lương cuối cùng của employee 1: " + salaryEmployee1[salaryEmployee1.length - 1]);

        // khởi tạo employee có salaries datatype là Float
        Float[] salaryEmployee2 = {1000f, 1200f, 1200f, 3000f};
        Employee<Float> employee2 = new Employee<Float>(1, "Nguyễn Văn B", salaryEmployee2);

        System.out.println("Employee vừa khởi tạo: ");
        print(employee2);
        System.out.println("Tháng lương cuối cùng của employee 2: " + salaryEmployee2[salaryEmployee2.length - 1]);

        // khởi tạo employee có salaries datatype là double
        Double[] salaryEmployee3 = {1000d, 1200d, 1200d, 6900d, 9600d, 12000d};
        Employee<Double> employee3 = new Employee<Double>(1, "Nguyễn Văn C", salaryEmployee3);

        System.out.println("Employee vừa khởi tạo: ");
        print(employee3);
        System.out.println("Tháng lương cuối cùng của employee1: " + salaryEmployee3[salaryEmployee3.length - 1]);
    }

    public void question7() {
        // <email, phone number>
        Phone<String, String> email = new Phone<String, String>("anh2606@gmail.com", "0123456789");
        System.out.println("Email: " + email.getKey() + " / " + "Phone Number: " + email.getPhoneNumber());

        // <id, phone number>
        Phone<Integer, String> id = new Phone<Integer, String>(1, "0123456789");
        System.out.println("id: " + id.getKey() + " / " + "Phone Number: " + id.getPhoneNumber());

        // <name, phone number>
        Phone<String, String> name = new Phone<String, String>("Nguyễn Văn A", "0123456789");
        System.out.println("Name: " + name.getKey() + " / " + "Phone Number: " + name.getPhoneNumber());
    }

    public void question8() {
        // Integer
        Staff<Integer> staff1 = new Staff<Integer>(1, "Nguyễn Văn A");
        System.out.println("ID: " + staff1.getId() + " / " + "Name: " + staff1.getName());

        // Float
        Staff<Float> staff2 = new Staff<Float>(1.5f, "Nguyễn Văn A");
        System.out.println("ID: " + staff2.getId() + " / " + "Name: " + staff2.getName());
    }

    private <T> void print(T a) {
        System.out.println(a);
    }

    private <T> void printArray(T[] arr) {
        for (T x : arr) {
            System.out.println(x);
        }
    }

}
