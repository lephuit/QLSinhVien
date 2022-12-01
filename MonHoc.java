package QLSinhVien.model;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class MonHoc extends SinhVien {
    public int maMonHoc;
    public double diemChuyenCan;
    public double diemThiLan1;
    public double diemThiLan2;
    public MonHoc(){
    }
    public MonHoc(int maSV,String tenSV, String ngaySinh, String gioiTinh, String SDT,int maMonHoc, double diemChuyenCan,double diemThiLan1,double diemThiLan2){
        super(maSV,tenSV,ngaySinh,gioiTinh,SDT);
        this.maMonHoc=maMonHoc;
        this.diemThiLan1=diemThiLan1;
        this.diemThiLan2=diemThiLan2;
        this.diemChuyenCan=diemChuyenCan;
    }

    public void sapXepThemDiem(){
        System.out.println("Sắp xếp danh sách sinh viên theo điểm môn học");
    }

    public double diemMonHoc(int maSV){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập điểm chuyên cần");
        double diemChuyenCan=scanner.nextDouble();
        System.out.println("Nhập điểm thi lần 1");
        double diemThiLan1=scanner.nextDouble();
        System.out.println("Nhập điểm thi lần 2");
        double diemThiLan2=scanner.nextDouble();

        double diemMonHoc=(diemChuyenCan+diemThiLan1+diemThiLan2)/3;
        return diemMonHoc;
    }
    public int getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(int maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public double getDiemChuyenCan() {
        return diemChuyenCan;
    }

    public void setDiemChuyenCan(double diemChuyenCan) {
        this.diemChuyenCan = diemChuyenCan;
    }

    public double getDiemThiLan1() {
        return diemThiLan1;
    }

    public void setDiemThiLan1(double diemThiLan1) {
        this.diemThiLan1 = diemThiLan1;
    }

    public double getDiemThiLan2() {
        return diemThiLan2;
    }

    public void setDiemThiLan2(double diemThiLan2) {
        this.diemThiLan2 = diemThiLan2;
    }

}
