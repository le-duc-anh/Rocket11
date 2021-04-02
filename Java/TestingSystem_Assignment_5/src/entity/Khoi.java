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
public class Khoi {

	private String khoi;
	private String monThi;

	public String getMonThi() {
		if (khoi.equals("A")) {
			monThi = "Toán, Lý, Hoá";

		} else if (khoi.equals("B")) {
			monThi = "Toán, Hoá, Sinh";

		} else if (khoi.equals("C")) {
			monThi = "Văn, Sử, Địa";

		} else {
			monThi = "Không xác định";
		}

		return monThi;

	}

	public String getKhoi() {
		return khoi;
	}

	public void setKhoi(String khoi) {
		this.khoi = khoi;
	}
}
