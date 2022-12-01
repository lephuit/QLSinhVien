package QLSinhVien.model;
import java.util.Scanner;
public class SinhVien {
    public int maSV;
    public String tenSV;
    public String ngaySinh;
    public String gioiTinh;
    public String SDT;

    public SinhVien(int maSV) {
        this.maSV=maSV;
    }
    public SinhVien() {
    }

    public SinhVien(int maSV, String tenSV, String ngaySinh, String gioiTinh, String SDT) {
        this.maSV=maSV;
        this.tenSV = tenSV;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.SDT = SDT;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    @Override
    public String toString() {
        return "Sinh viên {" +
                "Mã sinh viên : " + maSV +
                ", Tên Sinh viên : '" + tenSV + '\'' +
                ", Ngày sinh : '" + ngaySinh + '\'' +
                ", Giới tính : '" + gioiTinh + '\'' +
                ", SĐT: '" + SDT + '\'' +
                '}';
    }
}
