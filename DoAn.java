package QLSinhVien.model;

public class DoAn extends SinhVien{
    protected int maDoAn;
    protected String tenDoAn;
    public double diemDoAn;
    public DoAn(){

    }
    public DoAn(int maSV,String tenSV, String ngaySinh, String gioiTinh, String SDT,int maDoAn,String tenDoAn,double diemDoAn){
        super(maSV,tenSV,ngaySinh,gioiTinh,SDT);
        this.diemDoAn=diemDoAn;
        this.tenDoAn=tenDoAn;
        this.maDoAn=maDoAn;
    }
    public static void XepLoaiDoAn(double diemDoAn){
        if(diemDoAn>8){
            System.out.println("Xuất sắc");
        }else if(diemDoAn>=7){
            System.out.println("Giỏi");
        }else if(diemDoAn>=5){
            System.out.println("Trung Bình");
        }else {
            System.out.println("Trược");
        }
    }
}
