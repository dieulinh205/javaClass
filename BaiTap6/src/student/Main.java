package student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai bao doi tuong
        Complex sp1 = new Complex();
        Complex sp2 = new Complex();
        Complex spCong = new Complex();
        Complex spTru = new Complex();
        Complex spNhan = new Complex();
        Complex spThuong = new Complex();

        // Nhap
        System.out.println("Nhap vao so phuc 1:");
        sp1.nhap(sc);
        System.out.println("Nhap vao so phuc 2:");
        sp2.nhap(sc);

        // Hien thi
        System.out.println("So phuc 1 la:");
        sp1.hienThi();
        System.out.println("So phuc 2 la:");
        sp2.hienThi();

        System.out.println("Ket qua cua phep cong sp1 cho sp2 la:");
        spCong = sp1.congSP(sp2);
        spCong.hienThi();

        System.out.println("Ket qua cua phep tru sp1 cho sp2 la:");
        spTru = sp1.truSP(sp2);
        spTru.hienThi();

        System.out.println("Ket qua cua phep nhan sp1 cho sp2 la:");
        spNhan = sp1.nhanSP(sp2);
        spNhan.hienThi();

        // Chia sp1 cho sp2
        spThuong = sp1.chiaSP(sp2);

        // Hien thi
        System.out.println("Ket qua cua phep chia sp1 cho sp2 la:");
        spThuong.hienThi();

        sc.close();
    }
}
