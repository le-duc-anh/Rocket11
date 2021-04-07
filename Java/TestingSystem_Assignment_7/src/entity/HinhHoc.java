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
public abstract class HinhHoc implements IHinhHoc {

    private static int counter = 0;

    private float a;
    private float b;

    public HinhHoc(float a, float b) throws Exception {
        if (counter > Configs.SO_LUONG_HINH_TOI_DA) {
            throw new Exception("Số lượng hình tối đa là: " + Configs.SO_LUONG_HINH_TOI_DA);
        }

        this.a = a;
        this.b = b;
    }
}
