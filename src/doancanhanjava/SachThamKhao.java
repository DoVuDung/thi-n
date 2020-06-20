/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doancanhanjava;

import java.util.Date;

/**
 *
 * @author anonymous
 */
public class SachThamKhao extends SACH{
    private String loai;

    public SachThamKhao(String loaisach) {
        this.loai = loaisach;
    }

    public SachThamKhao(String masach, String ten, String nhaxuatban, Date ngaynhap, int soluong, double dongia, String loai) {
        super(masach, nhaxuatban, ten, loai, ngaynhap, soluong, dongia);
        this.loai = loai;
    }

    SachThamKhao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double TinhThanhTien() {
        return getDongia()*getSoluong();
        
    }

    @Override
    public String toString() {
        return "SachThamKhao{" + "loaisach=" + loai + '}';
    }
    
    
    
}
