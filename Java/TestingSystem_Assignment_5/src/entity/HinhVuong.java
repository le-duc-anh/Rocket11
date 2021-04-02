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
public class HinhVuong extends HinhChuNhat {

	public float tinhChuVi(float a) {
		return super.tinhChuVi(a, a);
	}

	public float tinhDienTich(float a) {
		return this.tinhDienTich(a, a);
	}
}