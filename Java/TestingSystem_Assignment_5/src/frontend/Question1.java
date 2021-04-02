/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.MyNews;
import java.util.Scanner;

/**
 *
 * @author my pc
 */
public class Question1 {

    public static void main(String[] args) {

        MyNews myNews = new MyNews();
        Scanner scanner = new Scanner(System.in);

        int choose;
        do {
            loadmenu();
            choose = scanner.nextInt();

            switch (choose) {

                case 1:
                    myNews.insertNews();
                    break;

                case 2:
                    myNews.viewListNews();
                    break;

                case 3:
                    myNews.averageRate();
                    myNews.viewListNews();
                    break;

                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("Nhập sai ! Vui lòng nhập lại !");
                    break;
            }
        } while (choose != 4);
    }

    private static void loadmenu() {

        System.out.println("1. Insert news ");
        System.out.println("2. View list news");
        System.out.println("3. Average rate");
        System.out.println("4. Exit");

    }
}
