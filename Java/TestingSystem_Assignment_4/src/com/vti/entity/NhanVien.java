package com.vti.entity;

import java.util.Scanner;

public class NhanVien extends CanBo {

    private String congviec;

    public String getCongViec() {
        return congviec;
    }

    @Override
    public void inputInfor() {
        super.inputInfor();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập công việc: ");
        congviec = scanner.nextLine();
    }

    @Override
    public void getInfor() {
        super.getInfor();
        System.out.println("Công việc  : " + getCongViec());
    }

}
