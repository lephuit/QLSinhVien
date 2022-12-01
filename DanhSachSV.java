package QLSinhVien;
import QLSinhVien.model.SinhVien;

import java.util.ArrayList;


public class DanhSachSV {
    private ArrayList<SinhVien> danhSachSV;
    public DanhSachSV(){
        this.danhSachSV= new ArrayList<SinhVien>();
    }
    public DanhSachSV(ArrayList<SinhVien> danhSachSV){
        super();
        this.danhSachSV=danhSachSV;
    }
    public void themSinhVien(SinhVien sinhVien){
        this.danhSachSV.add(sinhVien);
    }
    public void suaSinhVien(SinhVien sinhVien){
        System.out.println("Cập nhật thông tin sinh viên");
    }
    public void inDanhSachSV(){
        for (SinhVien sinhVien:danhSachSV){
            System.out.println(sinhVien);
        }
    }
    public boolean xoaSinhVien(SinhVien sinhVien) {
        return this.danhSachSV.remove(sinhVien);
    }

    //Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
    public void timSinhVien(String ten) {
        for (SinhVien sinhVien : danhSachSV) {
            if(sinhVien.getTenSV().indexOf(ten)>=0) {
                System.out.println(sinhVien);
            }
        }
    }
}
