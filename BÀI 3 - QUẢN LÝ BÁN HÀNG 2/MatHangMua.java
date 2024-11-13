import java.util.ArrayList;

public class MatHangMua {
    private HoaDon hd;
    private int matHangMuaID;
    private MatHang mh;
    private int soLuong;
    private static ArrayList<MatHangMua> matHangMua = new ArrayList<>();

    public MatHangMua(HoaDon hd, int matHangMuaID, MatHang mh, int soLuong) {
        this.hd = hd;
        this.matHangMuaID = matHangMuaID;
        this.mh = mh;
        this.soLuong = soLuong;
    }

    public HoaDon getHd() {
        return hd;
    }

    public MatHang getMh() {
        return mh;
    }

    public int getSoLuong() {
        return soLuong;
    }
    
    public static ArrayList<MatHangMua> getMatHangMua() {
        return matHangMua;
    }
 
    public void ThemMatHangMuaCuaHoaDon() {
        matHangMua.add(new MatHangMua(hd, matHangMuaID, mh, soLuong));
    }
}
