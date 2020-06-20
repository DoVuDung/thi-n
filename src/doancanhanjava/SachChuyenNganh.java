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
public class SachChuyenNganh extends SACH {

    private  String  tensach,trangthai;

    public SachChuyenNganh() {
    }

    public SachChuyenNganh(String tensach, String trangthai) {
        this.tensach = tensach;
        this.trangthai = trangthai;
    }

    public SachChuyenNganh(String ten, String trangthai, String masach, String nhaxuatban, Date ngaynhap, int soluong, double dongia, String loai) {
        super(masach, nhaxuatban, ten, loai, ngaynhap, soluong, dongia);
        this.tensach = tensach;
        this.trangthai = trangthai;
    }

    SachChuyenNganh(String ten, String xuatban, String ma, String xuatban0, Date ngayNhap, double sl, double dG) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    @Override
    public double TinhThanhTien() {
        if (trangthai.equalsIgnoreCase("moi")) {
            return (getSoluong() * getDongia()) - (getSoluong() * getDongia() * 10 / 100);
        }
        else
             return (getSoluong() * getDongia()) - (getSoluong() * getDongia() * 50 / 100);
        
    }

    @Override
    public String toString() {
        return "SachChuyenNganh{" + "tensach=" + tensach + ", trangthai=" + trangthai + '}';
    }

    
}
