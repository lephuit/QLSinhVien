package QLSinhVien;

import QLSinhVien.model.DoAn;
import QLSinhVien.model.MonHoc;
import QLSinhVien.model.SinhVien;

import java.util.Scanner;
public class QLSinhVien {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachSV danhSachSV=new DanhSachSV();
        int chon;
        do {
            System.out.println("-----------menu------------");
            System.out.println("1. Thêm sinh viên.");
            System.out.println("2. Xoá sinh viên.");
            System.out.println("3. Sửa sinh viên .");
            System.out.println("4. Tìm kiếm sinh viên theo tên.");
            System.out.println("5. Hiện thị danh sách sinh viên.");
            System.out.println("6. Hiện thị xếp loại đồ án.");
            System.out.println("7. Điểm môn học cũa sinh viên.");
            System.out.println("8. Xắp xếp danh sách theo điểm môn học.");
            System.out.println("0. Thoát.");
            System.out.println("---------------------------");
            System.out.print("Hãy lựa chọn : ");
            chon = scanner.nextInt();
            if(chon==1){
                System.out.println("1. Thêm sinh viên.");
                System.out.print("Nhập mã Sinh viên: "); int maSV=scanner.nextInt();
                System.out.print("Nhập tên sinh viên: ");
                scanner.nextLine();
                String tenSV=scanner.nextLine();
                System.out.print("Nhập giới tính: "); String gioiTinh=scanner.nextLine();
                System.out.print("Nhập ngày sinh: "); String ngaySinh=scanner.nextLine();
                System.out.print("Nhập SDT: "); String SDT=scanner.nextLine();
                SinhVien sinhVien = new SinhVien(maSV,tenSV,gioiTinh,ngaySinh,SDT);
                danhSachSV.themSinhVien(sinhVien);

            }else if (chon==2){
                System.out.print("Nhập mã sinh viên: "); int maSV = scanner.nextInt();
                SinhVien sinhVien = new SinhVien(maSV);
                System.out.println("Xóa sinh viên trong danh sách: "+danhSachSV.xoaSinhVien(sinhVien));
            }
            else if (chon==3){
                int maSV = scanner.nextInt();
                SinhVien sinhVien = new SinhVien(maSV);
                danhSachSV.suaSinhVien(sinhVien);
            }
            else if (chon==4){
                System.out.print("Nhập họ và tên: "); String tenSV = scanner.nextLine();
                System.out.println("Kết quả tìm kiếm: ");
                danhSachSV.timSinhVien(tenSV);
            }else if (chon==5){
                System.out.println("Danh sách sinh viên là: ");
                danhSachSV.inDanhSachSV();
            }else if (chon==6){
                System.out.println("6. Hiện thị xếp loại đồ án.");
                DoAn doAn=new DoAn();
                double diemDoAn = scanner.nextDouble();
                doAn.diemDoAn=diemDoAn;
                doAn.XepLoaiDoAn(doAn.diemDoAn);
            }else if (chon==7){
                System.out.println("7. Điểm môn học cũa sinh viên.");
                System.out.print("Nhập mã sinh viên: "); int maSV = scanner.nextInt();
                SinhVien sinhVien = new SinhVien(maSV);
                MonHoc monHoc = new MonHoc();
                monHoc.diemMonHoc(maSV);
            }else if (chon==8){
                System.out.println("8. Xắp xếp danh sách theo điểm môn học.");
                MonHoc monHoc = new MonHoc();
                monHoc.sapXepThemDiem();
            }else {
                System.out.println("Vui lòng chọn theo menu");
            }
        }while (chon!=0);
    }

}
