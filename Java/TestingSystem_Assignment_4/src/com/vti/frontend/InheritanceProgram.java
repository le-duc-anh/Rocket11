/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vti.frontend;

import com.vti.backend.QLCB;
import com.vti.backend.QLTV;
import java.util.Scanner;

/**
 *
 * @author my pc
 */
public class InheritanceProgram {

    public static void main(String[] args) {

        question2();
        question4();
    }

    private static void menuQuesion2() {

        System.out.println("1. Thêm cán bộ");
        System.out.println("2. Tìm cán bộ");
        System.out.println("3. Hiện cán bộ");
        System.out.println("4. Xóa cán bộ ");
        System.out.println("5. Thoát");

    }

    public static void question2() {
        QLCB qlcb = new QLCB();

        int choose;
        do {
            Scanner scanner = new Scanner(System.in);
            menuQuesion2();
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    qlcb.themCanBo();
                    break;
                case 2:
                    qlcb.timCanBo();
                    break;
                case 3:
                    qlcb.hienCanBo();
                    break;
                case 4:
                    qlcb.xoaCanBo();
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("Nhập sai ! Nhập lại !");
                    break;
            }
        } while (choose != 0);

    }

    private static void menuQuestion4() {
       
        System.out.println("1. Thêm tài liệu");
        System.out.println("2. Xóa tài liệu");
        System.out.println("3. Hiện tài liệu");
        System.out.println("4. Tìm tài liệu");
        System.out.println("5. Thoát");
        
    }

    public static void question4() {
        QLTV qltv = new QLTV();

        byte choose;
        do {
            menuQuestion4();
            Scanner scanner = new Scanner(System.in);

            choose = scanner.nextByte();
            switch (choose) {
                case 1:
                    qltv.themTaiLieu();
                    break;
                case 2:
                    qltv.xoaTaiLieu();
                    break;
                case 3:
                    qltv.hienTaiLieu();
                    break;
                case 4:
                    qltv.timTaiLieu();
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("Nhập sai ! Nhập lại !");
                    break;
            }
        } while (choose != 0);
    }

}
