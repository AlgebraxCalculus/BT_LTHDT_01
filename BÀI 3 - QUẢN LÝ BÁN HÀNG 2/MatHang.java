import java.util.ArrayList;

public class MatHang {
    private float gia;
    private int matHangID, soLuong;
    private String tenMatHang;
    private static ArrayList<MatHang> kho = new ArrayList<>();

    public MatHang(float gia, int matHangID, int soLuong, String tenMatHang) {
        this.gia = gia;
        this.matHangID = matHangID;
        this.soLuong = soLuong;
        this.tenMatHang = tenMatHang;
    }

    public float getGia() {
        return gia;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public static void ThemMatHangVaoKho(MatHang matHang) {
        kho.add(matHang);
    }
}
