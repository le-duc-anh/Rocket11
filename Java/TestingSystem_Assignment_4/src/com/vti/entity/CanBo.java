/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vti.entity;

import java.util.Scanner;

/**
 *
 * @author my pc
 */
public class CanBo {

    private String hoten;
    private int tuoi;
    private Gender gioitinh;
    private String diachi;

    public CanBo() {
    }

    public String getHoTen() {
        return hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public Gender getGioiTinh() {
        return gioitinh;
    }

    private void setGioiTinh(int gioiTinh) {
        if (gioiTinh == 0) {
            this.gioitinh = Gender.valueOf("MALE");
        } else if (gioiTinh == 1) {
            this.gioitinh = Gender.valueOf("FEMALE");
        } else {
            this.gioitinh = Gender.valueOf("UNKNOWN");
        }
    }

    public String getDiachi() {
        return diachi;
    }

    public void inputInfor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập họ tên: ");
        hoten = scanner.nextLine();

        System.out.println("Nhập tuổi: ");
        tuoi = scanner.nextInt();

        System.out.println("Nhập giới tính (0:Nam, 1:Nữ, khác: Unknown): ");
        setGioiTinh(scanner.nextInt());

        System.out.println("Nhập địa chỉ: ");
        diachi = scanner.nextLine();
        scanner.nextLine();
    }

    public void getInfor() {
        System.out.println("Họ tên      : " + hoten);
        System.out.println("Tuổi        : " + tuoi);
        System.out.println("Giới tính   : " + gioitinh);
        System.out.println("Địa chỉ     : " + diachi);
    }

    @Override
    public String toString() {
        return "CanBo{" + "hoten='" + hoten + '\'' + ", tuoi=" + tuoi + ", gt=" + gioitinh + ", diachi='" + diachi
                + '\'' + '}';
    }

}
