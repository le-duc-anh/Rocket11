package com.vti.entity;

import java.util.Scanner;

public class CongNhan extends CanBo {

    private int bac;

    public int getBac() {
        return bac;
    }

    @Override
    public void inputInfor() {
        super.inputInfor();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập bậc của công nhân: ");
        bac = scanner.nextInt();
    }

    @Override
    public void getInfor() {
        super.getInfor();
        System.out.println("Bậc  : " + bac);
    }

}
