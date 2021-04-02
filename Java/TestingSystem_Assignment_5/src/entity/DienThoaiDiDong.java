/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author my pc
 */
public abstract class DienThoaiDiDong implements ITanCong {

	public void nghe() {
		System.out.println("Đang nghe...");
	}

	public void goi() {
		System.out.println("Đang gọi...");
	}

	public void guiTinNhan() {
		System.out.println("Đang gửi tin nhắn...");
	}

	public void nhanTinNhan() {
		System.out.println("Đã nhận tin nhắn...");
	}
}
