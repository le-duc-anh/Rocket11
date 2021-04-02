/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;


import entity.Student2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonManagement {

	private List<Student2> students;
	private Scanner scanner;

	public PersonManagement() {
		students = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	public void input() {
		System.out.println("Nhập số sinh viên muốn nhập : ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Nhập sinh viên thứ : " + i);
			students.add(new Student2());
		}

	}

	public void showInforStudents() {
		for (Student2 student : students) {
			student.showInfo();
		}
	}

	public void xetHocBong() {
		System.out.println("Nhập tên sinh viên muốn xét:");
		String name = scanner.nextLine();

		for (Student2 student : students) {
			if (student.getName().equals(name)) {
				if (student.isStudentGetScholarship()) {
					System.out.println("Sinh viên này được học bổng !");
				} else {
					System.out.println("Không được học bổng !");
				}
				break;
			}
		}
	}
}
