/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vti.entity;

import java.util.Scanner;

public class TapChi extends TaiLieu {

    private int soPhatHanh;
    private byte thangPhatHanh;

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public byte getThangPhatHanh() {
        return thangPhatHanh;
    }

    @Override
    public void input() {
        super.input();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số phát hành: ");
        soPhatHanh = scanner.nextInt();

        System.out.println("Nhập tháng phát hành: ");
        thangPhatHanh = scanner.nextByte();
    }

    @Override
    public void getInfor() {
        super.getInfor();

        System.out.println("Số phát hành: " + soPhatHanh);
        System.out.println("Tháng phát hành: " + thangPhatHanh);
    }
}
