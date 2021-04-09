/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.util.List;

import entity.MyMath;
import entity.MyNumber;
import entity.Salary;

public class WildcardGeneric {

    public void question1() {
        // Integer
        Salary<Integer> salary = new Salary<Integer>(69000);
        System.out.println(salary);
    }

    public void question2() {
        // Double
        MyNumber<Double> number = new MyNumber<Double>(6900.900);
        System.out.println(number);
    }

    public void question3() {

        MyMath<Integer> math = new MyMath<>();

        // Integer
        int maxInt = math.maximum(1, 10, 8);
        System.out.println(maxInt);

        // float
        float maxFloat = math.maximum(1.5f, 10.3f, 10.2f);
        System.out.println(maxFloat);
    }

    public void question4() {

        MyMath<Integer> mathInt = new MyMath<>();
        MyMath<Float> mathFloat = new MyMath<>();

        // add
        Integer sumInt1 = mathInt.add(1, 10);
        System.out.println(sumInt1);

        int sumInt2 = mathInt.add(1, 10, 8);
        System.out.println(sumInt2);

        Float sumFloat = mathFloat.add(1.5f, 10.3f, 10.2f);
        System.out.println(sumFloat);

        // subtract
        int subInt1 = mathInt.subtract(10, 1);
        System.out.println(subInt1);

        float subFloat2 = mathFloat.subtract(10f, 5f);
        System.out.println(subFloat2);
    }

    public void question5() {
        List<Object> inforCustomers = new ArrayList<>();
        inforCustomers.add("Nguyễn Văn A");
        inforCustomers.add(30);
        inforCustomers.add("Hà đông, Hà nội");

        for (Object object : inforCustomers) {
            System.out.println(object);
        }
    }
}
