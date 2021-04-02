/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import entity.News;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author my pc
 */
public class MyNews {

	private List<News> newsList;

	public MyNews() {
		newsList = new ArrayList<>();
	}

	public void insertNews() {
		News news = new News();
		int[] rates = new int[3];

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập Title: ");
		news.setTitle(scanner.nextLine());

		System.out.println("Nhập Publish Date: ");
		news.setPublishDate(scanner.nextLine());

		System.out.println("Nhập Author: ");
		news.setAuthor(scanner.nextLine());

		System.out.println("Nhập Content: ");
		news.setContent(scanner.nextLine());

		System.out.println("Nhập 3 đánh giá: ");
		for (int i = 0; i < 3; i++) {
			System.out.println("Đánh giá " + (i + 1) + ": ");
			rates[i] = scanner.nextInt();
		}
		news.setRates(rates);

		newsList.add(news);
	}

	public void viewListNews() {
		for (News news : newsList) {
			news.display();
		}
	}

	public void averageRate() {
		for (News news : newsList) {
			System.out.println("Title: " + news.getTitle() + " / Average Rate: " + news.calculate());
		}
	}

}
