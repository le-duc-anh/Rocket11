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
public class DienThoaiThongMinh extends DienThoaiDiDong {

	@Override
	public void tanCong() {
		System.out.println("Ném là vỡ màn ...");
	}

	public void suDung3G() {
		System.out.println("Sử dụng 3G ...");
	}

	public void chupHinh() {
		System.out.println("Chup hinh ...");
	}
}

