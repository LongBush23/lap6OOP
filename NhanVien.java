package lap6;

/**
 *
 * @author VQ
 */
public class NhanVien {
    public String ten;
    public long luong;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }
    
    public NhanVien() {
        // Khởi tạo mặc định
    }
    
    public NhanVien(String ten) {
        this.ten = ten;
    }
    
    public void loaiNhanVien(String loaiNhanVien){
        // Phương thức trừu tượng, sẽ được cài đặt ở các lớp con
    }
    
    public void tinhLuong(){
        // Phương thức trừu tượng, sẽ được cài đặt ở các lớp con
    }
    
    public void xuatThongTin(){
        System.out.println("ten nhan vien: " + ten);
        System.out.println("luong: " + luong);
    }
    
    public class NhanVienFullTime extends NhanVien{
        public int loaiChucVu;
        public int lamThem;

        public int getLoaiChucVu() {
            return loaiChucVu;
        }

        public void setLoaiChucVu(int loaiChucVu) {
            this.loaiChucVu = loaiChucVu;
        }

        public int getLamThem() {
            return lamThem;
        }

        public void setLamThem(int lamThem) {
            this.lamThem = lamThem;
        }
        
        public NhanVienFullTime(String ten, int lamThem, int loaiChucVu){
            super(ten);
            this.lamThem = lamThem;
            this.loaiChucVu = loaiChucVu;
        }
        
        public void loaiNhanVien(String loaiNhanVien){
            System.out.println("Nhân viên full-time");
        }
        
        public void tinhLuong(){
            if (loaiChucVu == 1) {
                luong = 20000000 + lamThem * 100000;
            } else if (loaiChucVu == 2) {
                luong = 10000000 + lamThem * 50000;
            }
        }
    }
    
    public class NhanVienPartTime extends NhanVien{
    public int gioLamViec;

    public int getGioLamViec() {
        return gioLamViec;
    }

    public void setGioLamViec(int gioLamViec){
        this.gioLamViec = gioLamViec;
    }
        
    public NhanVienPartTime(String ten, int gioLamViec){
        super(ten);
        this.gioLamViec = gioLamViec;
    }
    
    public void loaiNhanVien(String loaiNhanVien){
        System.out.println("Nhân viên part-time");
    }
    
    public void tinhLuong(){
        // Tính lương cho nhân viên part-time
        luong = gioLamViec * 100000;
    }
    
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println("Gio lam viec: " + gioLamViec);
    }
    }
    public static void main(String[] args) {
    NhanVien.NhanVienFullTime nv1 = new NhanVien().new NhanVienFullTime("Nguyen Van A", 5, 1);
    nv1.tinhLuong(); 
    nv1.xuatThongTin(); 

    NhanVien.NhanVienPartTime nv2 = new NhanVien().new NhanVienPartTime("Tran Thi B", 40);
    nv2.tinhLuong(); 
    nv2.xuatThongTin(); 
}

}



