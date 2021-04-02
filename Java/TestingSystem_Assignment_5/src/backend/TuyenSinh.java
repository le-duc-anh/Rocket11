/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import entity.Examinee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {

    private Scanner scanner;

    private List<Examinee> examinees;

    public TuyenSinh() {
        examinees = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    @Override
    public void themThiSinh() {
        System.out.println("Nhập số thí sinh muốn nhập: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            Examinee examinee = new Examinee();
            examinee.nhap();
            examinees.add(examinee);
        }
    }

    @Override
    public void hienThiSinh() {
        for (Examinee examinee : examinees) {
            System.out.println(examinee);
        }
    }

    @Override
    public void timThiSinh() {

        System.out.println("Nhập sbd cần tìm: ");
        String sbd = scanner.nextLine();
        scanner.nextLine();

        for (Examinee examinee : examinees) {
            if (examinee.getSbd().equals(sbd)) {
                System.out.println(examinee);
            }
        }
    }
}
