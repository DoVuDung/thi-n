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
public abstract class SACH implements ISACH{
    protected String masach, nhaxuatban, ten, loai;
    protected Date ngaynhap;
    protected double  dongia;
    protected int soluong;

    public SACH() {
    }

    public SACH(String masach, String nhaxuatban, String ten, String loai, Date ngaynhap, int soluong, double dongia) {
        this.masach = masach;
        this.nhaxuatban = nhaxuatban;
        this.ten = ten;
        this.loai = loai;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public Date getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    

    @Override
    public String toString() {
        return "SACH{" + "masach=" + masach + ", nhaxuatban=" + nhaxuatban + ", ngaynhap=" + ngaynhap + ", soluong=" + soluong + ", dongia=" + dongia + '}';
    }
    
    @Override
    public abstract double TinhThanhTien();
    
}
