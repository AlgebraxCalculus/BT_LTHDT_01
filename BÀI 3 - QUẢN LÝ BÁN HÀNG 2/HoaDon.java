import java.util.ArrayList;

public class HoaDon {
    private int hoaDonID;
    private KhachHang kh;
    private String ngayBan;
    private float tongTien;
    private static ArrayList<HoaDon> hoaDon = new ArrayList<>();

    public HoaDon(int hoaDonID, KhachHang kh, String ngayBan, float tongTien) {
        this.hoaDonID = hoaDonID;
        this.kh = kh;
        this.ngayBan = ngayBan;
        this.tongTien = tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public float getTongTien() {
        return tongTien;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void InHoaDon() {
        System.out.println("Hoa Don ID: " + hoaDonID);
        System.out.println("Khach Hang: " + kh.getTenKH());
        System.out.println("Ngay Ban: " + ngayBan);
        System.out.println("Tong Tien: " + tongTien);
    }

    public void ThemHoaDon(HoaDon hd) {
        hoaDon.add(hd);
    }
}