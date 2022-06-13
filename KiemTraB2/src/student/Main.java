package student;

import java.util.Arrays;
import java.util.Date;

    class Nguoi {
        private String ten;
        private String ho;
        private String gioiTinh;
        private Date ngaySinh;
        public Nguoi() {}
        public Nguoi(String ten, String ho, String gioiTinh, Date ngaySinh) {
            this.ten = ten;
            this.ho = ho;
            this.gioiTinh = gioiTinh;
            this.ngaySinh = ngaySinh;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getHo() {
            return ho;
        }

        public void setHo(String ho) {
            this.ho = ho;
        }

        public String getGioiTinh() {
            return gioiTinh;
        }

        public void setGioiTinh(String gioiTinh) {
            this.gioiTinh = gioiTinh;
        }

        public Date getNgaySinh() {
            return ngaySinh;
        }

        public void setNgaySinh(Date ngaySinh) {
            this.ngaySinh = ngaySinh;
        }

        @Override
        public String toString() {
            return  "Ten = " + ten + '\'' +
                    "Ho = " + ho + '\'' +
                    "GioiTinh ='" + gioiTinh + '\'' +
                    "NgaySinh =" + ngaySinh ;

        }
    }

    class GiangVien extends Nguoi {
        private String khoa;
        private String[] danhSachMon;
        private double heSoLuong;
        private double luongCoBan;
        public GiangVien() {}
        public GiangVien(String ten, String ho, String gioiTinh, Date ngaySinh, String khoa, String[] danhSachMon, double heSoLuong, double luongCoBan) {
            super(ten, ho, gioiTinh, ngaySinh);
            this.khoa = khoa;
            this.danhSachMon = danhSachMon;
            this.heSoLuong = heSoLuong;
            this.luongCoBan = luongCoBan;
        }

        public String getKhoa() {
            return khoa;
        }

        public void setKhoa(String khoa) {
            this.khoa = khoa;
        }

        public String[] getDanhSachMon() {
            return danhSachMon;
        }

        public void setDanhSachMon(String[] danhSachMon) {
            this.danhSachMon = danhSachMon;
        }

        public double getHeSoLuong() {
            return heSoLuong;
        }

        public void setHeSoLuong(double heSoLuong) {
            this.heSoLuong = heSoLuong;
        }

        public double getLuongCoBan() {
            return luongCoBan;
        }

        public void setLuongCoBan(double luongCoBan) {
            this.luongCoBan = luongCoBan;
        }

        public double Luong(){
            return luongCoBan*heSoLuong;
        }

        public String toString() {
            return super.toString()+
                    "Khoa = " + khoa + '\'' +
                    "Danh Sach Mon = " + Arrays.toString(danhSachMon) +
                    "He So Luong = " + heSoLuong +
                    "Luong Co Ban = " + luongCoBan +
                    "Luong Nhan Duoc = " + Luong();

        }
    }


    class NhanVien extends Nguoi {
        private String phongBan;
        private String chucVu;
        private double luongCoBan;
        private double heSoLuong;

        public NhanVien(String ten, String ho, String gioiTinh, Date ngaySinh, String phongBan, String chucVu, double luongCoBan, double heSoLuong) {
            super(ten, ho, gioiTinh, ngaySinh);
            this.phongBan = phongBan;
            this.chucVu = chucVu;
            this.luongCoBan = luongCoBan;
            this.heSoLuong = heSoLuong;
        }

        public String getPhongBan() {
            return phongBan;
        }

        public void setPhongBan(String phongBan) {
            this.phongBan = phongBan;
        }

        public String getChucVu() {
            return chucVu;
        }

        public void setChucVu(String chucVu) {
            this.chucVu = chucVu;
        }

        public double getLuongCoBan() {
            return luongCoBan;
        }

        public void setLuongCoBan(double luongCoBan) {
            this.luongCoBan = luongCoBan;
        }

        public double getHeSoLuong() {
            return heSoLuong;
        }

        public void setHeSoLuong(double heSoLuong) {
            this.heSoLuong = heSoLuong;
        }

        public double Luong() {
            return luongCoBan * heSoLuong;
        }

        @Override
        public String toString() {
            return super.toString() +
                    "Phong Ban = " + phongBan + '\'' +
                    "Chuc Vu = " + chucVu + '\'' +
                    "Luong Co Ban = " + luongCoBan +
                    "He So Luong = " + heSoLuong +
                    "Luong Nhan Duoc = " + Luong();
        }
    }

class Main {
    public  static  void sapXepGV(GiangVien []gv) {
        for(int i = 0; i <= 2; i++) {        //
            for(int j = 0; j <= 2; j++) {
                if(gv[j].Luong() > gv[i + 1].Luong()) {
                    GiangVien tmp = new GiangVien();
                    tmp = gv[j];
                    gv[j] = gv[j + 1];
                    gv[j + 1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        NhanVien [] nv = new NhanVien[4];
        GiangVien [] gv = new GiangVien[4];
        String []ds = {"toan roi rac", "ly", "giai tich"};
        nv[0] = new NhanVien("A", "Van", "Nam", new Date(2000,11,12), "Ke toan", "nhan vien", 12000000, 1.2);
        nv[1] = new NhanVien("B", "Van", "Nam", new Date(1996,6,3), "Ke Toan", "Truong phong", 20000000, 1.5);
        nv[2] = new NhanVien("C", "Van", "Nu", new Date(2001,1,31), "Marketing", "nhan vien", 15000000, 1.2);
        nv[3] = new NhanVien("D", "Van", "Nu", new Date(1990,6,16), "Bao ve", "nhan vien", 9000000, 1.0);

        gv[0] = new GiangVien("E", "Nguyen", "Nam", new Date(1998,12,11), "CNTT", ds, 1.2, 12000000);
        gv[1] = new GiangVien("F", "Nguyen", "Nu", new Date(1996,6,11), "CNTT", ds, 1.5, 20000000);
        gv[2] = new GiangVien("G", "Nguyen", "Nam", new Date(1973,3,2), "CNTT", ds, 1.3, 15000000);
        gv[3] = new GiangVien("H", "Nguyen", "Nam", new Date(2002,9,19), "CNTT", ds, 1.2, 12000000);

        for(NhanVien i : nv) {
            System.out.println(i.toString());
        }

        for(GiangVien i : gv) {
            System.out.println(i.toString());
        }

        System.out.println("Sap xep giang vien theo luong:");
        sapXepGV(gv);
        for(GiangVien i : gv) {
            System.out.println(i.toString());
        }
    }
}


