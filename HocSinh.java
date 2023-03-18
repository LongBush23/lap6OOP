package lap6;

public class HocSinh {
    private String hoTen;
    private String lop;
    private double toan;
    private double ly;
    private double hoa;

    public HocSinh(String hoTen, String lop, double toan, double ly, double hoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public double tinhDiemTrungBinh() {
        return (toan + ly + hoa) / 3.0;
    }

    public void inThongTin() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Lop: " + lop);
        System.out.println("Toan: " + toan);
        System.out.println("Ly: " + ly);
        System.out.println("Hoa: " + hoa);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }
}

class HocSinhChuyenToan extends HocSinh {
    public HocSinhChuyenToan(String hoTen, String lop, double toan, double ly, double hoa) {
        super(hoTen, lop, toan, ly, hoa);
    }

    @Override
    public double tinhDiemTrungBinh() {
        return (2 * getToan() + getLy() + getHoa()) / 4.0;
    }
}

class Main {
    public static void main(String[] args) {
        // Tạo đối tượng HocSinh
        HocSinh hocSinh = new HocSinh("Nguyen Van A", "10A", 8.5, 7.5, 9.0);
        // In thông tin học sinh và điểm trung bình
        System.out.println("Thong tin hoc sinh:");
        hocSinh.inThongTin();
        System.out.println("Diem trung binh: " + hocSinh.tinhDiemTrungBinh());

        // Tạo đối tượng HocSinhChuyenToan
        HocSinhChuyenToan hocSinhChuyenToan = new HocSinhChuyenToan("Nguyen Van B", "10B", 9.0, 8.0, 7.5);
        // In thông tin học sinh chuyên toán và điểm trung bình
        System.out.println("Thong tin hoc sinh chuyen toan:");
        hocSinhChuyenToan.inThongTin();
        System.out.println("Diem trung binh: " + hocSinhChuyenToan.tinhDiemTrungBinh());
    }
}


