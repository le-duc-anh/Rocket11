
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author my pc
 */
public class SystemOutPrintf {

    public static void main(String[] args) {

        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Java Fresher";
        group1.createdate = new Date(2020, 04, 21);

        Group group2 = new Group();
        group2.id = 2;
        group2.name = "DB Fresher";
        group2.createdate = new Date(2020, 04, 21);

        Group group3 = new Group();
        group3.id = 3;
        group3.name = "C++ Fresher";
        group3.createdate = new Date(2020, 04, 16);

        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Sale";

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Marketting";

        Department department3 = new Department();
        department3.id = 3;
        department3.name = "HR";

        Position position1 = new Position();
        position1.id = 1;
        position1.name = "Manager";

        Position position2 = new Position();
        position2.id = 2;
        position2.name = "Team Leader";

        Position position3 = new Position();
        position3.id = 3;
        position3.name = "Trainee";

        Account account1 = new Account();
        account1.id = 1;
        account1.createdate = new Date(2020, 03, 17);
        account1.department = department1;
        account1.email = "An@gmail.com";
        account1.fullname = "Nguyen Van An";
        account1.position = position1;
        account1.username = "an.nguyenvan";

        Account account2 = new Account();
        account2.id = 2;
        account2.createdate = new Date(2020, 01, 9);
        account2.department = department1;
        account2.email = "Linh@gmail.com";
        account2.fullname = "Nguyen Hoai Linh";
        account2.position = position3;
        account2.username = "Linh.nguyenhoai";

        Account account3 = new Account();
        account3.id = 3;
        account3.createdate = new Date(2020, 03, 19);
        account3.department = department2;
        account3.email = "ha@gmail.com";
        account3.fullname = "Pham Hai Ha";
        account3.position = position1;
        account3.username = "Ha.phamhai";

        // Q1
        int a = 5;

        System.out.printf(
                "%d%n", a);

        // Q2
        int b = 100000000;

        System.out.printf(Locale.US, "%,d%n", b);

        // Q3
        float c = 5.567098f;

        System.out.printf(
                "%5.4f%n", c);

        // Q4
        String s = "Nguyen Van A";

        System.out.printf(
                "Tên tôi là \"" + s + "\" và tôi đang độc thân \n");

        // Q5.
        String pattern = "dd/MM/yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());

        System.out.println(date);

    }

}
