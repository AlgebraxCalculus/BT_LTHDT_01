public class KhachHang {
    private String diaChi, tenKH;
    private int KhachHangID;

    public KhachHang(String diaChi, String tenKH, int KhachHangID) {
        this.diaChi = diaChi;
        this.tenKH = tenKH;
        this.KhachHangID = KhachHangID;
    }

    public String getTenKH() {
        return tenKH;
    }
}
