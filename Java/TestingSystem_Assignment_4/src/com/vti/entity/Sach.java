/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vti.entity;

import java.util.Scanner;

public class Sach extends TaiLieu {

    private String tenTacGia;
    private int soTrang;

    public String getTenTacGia() {
        return tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    @Override
    public void input() {
        super.input();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên tác giả: ");
        tenTacGia = scanner.nextLine();

        System.out.println("Nhập số trang: ");
        soTrang = scanner.nextInt();
    }

    @Override
    public void getInfor() {
        super.getInfor();

        System.out.println("Tên tác giả: " + tenTacGia);
        System.out.println("Số trang: " + soTrang);
    }

}
