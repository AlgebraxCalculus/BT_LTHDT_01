public class OrderManagement2 {

    public static void main(String[] args) {
        MatHang itemX = new MatHang(100000, 1, 10, "X");
        MatHang itemY = new MatHang(120000, 2, 20, "Y");
        MatHang itemZ = new MatHang(150000, 3, 30, "Z");
        MatHang.ThemMatHangVaoKho(itemX);
        MatHang.ThemMatHangVaoKho(itemY);
        MatHang.ThemMatHangVaoKho(itemZ);

        KhachHang khachHang = new KhachHang("Hanoi", "Nguyen Van A", 1);

        HoaDon hoaDon = new HoaDon(1001, khachHang, "2024-11-12", 0);
        hoaDon.ThemHoaDon(hoaDon);

        MatHangMua matHangMuaX = new MatHangMua(hoaDon, 1, itemX, 2); 
        MatHangMua matHangMuaY = new MatHangMua(hoaDon, 2, itemY, 3); 
        matHangMuaX.ThemMatHangMuaCuaHoaDon();
        matHangMuaY.ThemMatHangMuaCuaHoaDon();

        hoaDon.setTongTien((itemX.getGia() * 2) + (itemY.getGia() * 3));

        hoaDon.InHoaDon();
        System.out.println("Mat Hang Da Mua:");
        for (MatHangMua mh : MatHangMua.getMatHangMua()) {  
            if (mh.getHd() == hoaDon) {  
                System.out.println("Mat Hang: " + mh.getMh().getTenMatHang() + ", So Luong: " + mh.getSoLuong() + ", Gia: " + mh.getMh().getGia());
            }
        }
    }
}
