/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author my pc
 */
public class Student2 extends Person {

	private int maSV;
	private float diemTB;
	private String email;

	public Student2() {
		inputInfo();
	}

	public Student2(String name, Gender gender, LocalDate birthday, String address, int maSV, float diemTB,
			String email) {
		super(name, gender, birthday, address);
		this.maSV = maSV;
		this.diemTB = diemTB;
		this.email = email;
	}

	public int getMaSV() {
		return maSV;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public String getEmail() {
		return email;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	protected void inputInfo() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập mã sinh viên: ");
		maSV = scanner.nextInt();

		super.inputInfo();

		System.out.println("Nhập điểm trung bình: ");
		diemTB = scanner.nextFloat();

		System.out.println("Nhập email: ");
		email = scanner.nextLine();

	}

	@Override
	public void showInfo() {
		System.out.println("Mã sinh viên: " + maSV);
		super.showInfo();
		System.out.println("Điểm trung bình: " + diemTB);
		System.out.println("Email: " + diemTB);
	}

	public boolean isStudentGetScholarship() {
		return diemTB >= 8;
	}
}
