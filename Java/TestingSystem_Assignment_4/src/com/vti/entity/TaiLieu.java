/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vti.entity;

import java.util.Scanner;

public class TaiLieu {

    private static int counter = 1000;

    private int maTaiLieu;
    private String tenNXB;
    private int soBanPhatHanh;

    public TaiLieu() {
        maTaiLieu = ++counter;
    }

    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mã tài liệu: " + maTaiLieu);

        System.out.println("Nhập tên NXB: ");
        tenNXB = scanner.nextLine();

        System.out.println("Nhập số bản phán hành: ");
        soBanPhatHanh = scanner.nextInt();
    }

    public void getInfor() {
        System.out.println("Mã tài liệu: " + maTaiLieu);
        System.out.println("Tên NXB: " + tenNXB);
        System.out.println("Số bản phán hành: " + soBanPhatHanh);
    }

}
