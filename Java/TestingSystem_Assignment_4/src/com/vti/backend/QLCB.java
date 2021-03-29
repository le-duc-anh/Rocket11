package com.vti.backend;

import com.vti.entity.*;
import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {

    private ArrayList<CanBo> canbos;

    public QLCB() {
        canbos = new ArrayList<>();
    }

    public void themCanBo() {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số cán bộ muốn nhập:  ");
        n = scanner.nextInt();

        int choose;
        CanBo canbo = new CanBo();
        for (int i = 0; i < n; i++) {
            System.out.println("Bạn muốn nhập cán bộ nào? (1:Công nhân, 2: Kỹ sư, 3: Nhân Viên) ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    canbo = new CongNhan();
                    break;
                case 2:
                    canbo = new KySu();
                    break;
                case 3:
                    canbo = new NhanVien();
                    break;
                default:
                    System.out.println("Nhập sai !");
                    i--;
                    break;
            }

            canbo.inputInfor();
            canbos.add(canbo);

            scanner.close();
        }
    }

    public void timCanBo() {
        Scanner scanner = new Scanner(System.in);

        String hoten;
        System.out.println("Nhập họ tên cần tìm: ");
        hoten = scanner.nextLine();

        for (CanBo canbo : canbos) {
            if (hoten.equals(canbo.getHoTen())) {
                canbo.getInfor();
            }
        }
    }

    public void hienCanBo() {
        for (CanBo canBo : canbos) {
            canBo.getInfor();
        }
    }

    public void xoaCanBo() {
        Scanner scanner = new Scanner(System.in);

        String hoTen;
        System.out.println("Nhập họ tên cần xóa: ");
        hoTen = scanner.nextLine();

        canbos.removeIf(canbo -> hoTen.equals(canbo.getHoTen()));
    }
}
