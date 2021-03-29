package com.vti.entity;

import java.util.Scanner;

public class KySu extends CanBo {

    private String nganhdaotao;

    public String getNganhDaoTao() {
        return nganhdaotao;
    }

    @Override
    public void inputInfor() {
        super.inputInfor();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập ngành đào tạo: ");
        nganhdaotao = scanner.nextLine();
    }

    @Override
    public void getInfor() {
        super.getInfor();
        System.out.println("Ngành đào tạo  : " + nganhdaotao);
    }
}
