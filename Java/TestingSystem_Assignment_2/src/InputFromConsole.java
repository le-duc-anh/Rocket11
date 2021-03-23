
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author my pc
 */
public class InputFromConsole {

    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        // Q1.
        System.out.println("Moi ban nhap vao 3 so nguyen ");
        for (int i = 0; i < 3; i++) {
            int x = scan.nextInt();
            System.out.println("Ban da nhap: " + x + "\n");
        }

        // Q2.
        System.out.println("Moi ban nhap vao 2 so thuc");
        for (int i = 0; i < 2; i++) {
            double y = scan.nextDouble();
            System.out.println("Ban da nhap: " + y + "\n");
        }

        // Q3.
        System.out.println("Moi ban nhap vao ho");
        String s1 = scan.next();

        System.out.println("Moi ban nhap vao ten");
        String s2 = scan.next();

        System.out.println("Ten ban da nhap: " + s1 + " " + s2 + "\n");

        // Q4.
        System.out.println("Moi nhap vao ngay sinh");
        String dob = scan.next();
        String pattern = "yyyy/MM/dd";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        Date date = dateFormat.parse(dob);

        System.out.println("Input: " + date);
        // Q7.

        System.out.println("Moi ban nhap vao 1 so chan");
        int number = scan.nextInt();
        if (number
                % 2 == 0) {
            System.out.println("Input: " + number);
        } else {
            System.out.println("Nhap sai");
        }

        // Q8.
        while (true) {
            System.out
                    .println("Mời bạn nhập vào chức năng muốn sử dụng (1: tao account or 2: tao department");
            int methodNumber = scan.nextInt();

            switch (methodNumber) {
                case 1:
                    inputAccount();
                    break;
                case 2:
                    inputDepartment();
                    break;
                default:
                    System.out.println("Mời bạn nhập lại");
            }
        }
    }
    // Q5.

    public static void inputAccount() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nhap vao Account ID:");
        int id = scan.nextInt();

        scan.nextLine();
        System.out.print("Nhap vao username:");
        String userName = scan.nextLine();

        System.out.print("Nhap vao Department:");
        String department = scan.nextLine();

        System.out.print("Nhap vao Position ID (tu 1 -> 5):");
        int position = scan.nextInt(6);
        switch (position) {
            case 1:
                System.out.print("Dev");
                break;
            case 2:
                System.out.print("Test");
                break;
            case 3:
                System.out.print("ScrumMaster");
                break;
            case 4:
                System.out.print("PM");
                break;
            default:
                System.out.print("SA");
        }

        System.out.print("\nNhap vao group:");
        scan.nextLine();
        String groups = scan.nextLine();

        System.out.print("\nNhap vao ngay:");
        String date = scan.nextLine();
    }

    // Q6.
    public static void inputDepartment() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi ban nhap ten department muon tao");
        String department = scan.nextLine();
    }
}
