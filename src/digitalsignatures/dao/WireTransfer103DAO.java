package digitalsignatures.dao;

import digitalsignatures.model.WireTransfer103;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class WireTransfer103DAO {
    public static WireTransfer103 getData(Connection conn){
        PreparedStatement ptmt = null;
        WireTransfer103 wireTransfer103 = null;
        String sql = "select * from wire_transfer_103 where id=1";
        try{
            ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                int version = rs.getInt("version");
                String thongTinNguoiChuyen = rs.getString("thongTinNguoiChuyen");
                String maDien = rs.getString("maDien");
                String hachToanTuDong = rs.getString("hachToanTuDong");
                Double soTienPhi = rs.getDouble("soTienPhi");
                String soGiaoDich = rs.getString("soGiaoDich");
                String nguoiKiemSoat = rs.getString("nguoiKiemSoat");
                String xacThucGiaoDich = rs.getString("xacThucGiaoDich");
                String kyHieuMatKeToan = rs.getString("kyHieuMatKeToan");
                Boolean deleted = rs.getBoolean("deleted");
                Date ngayGiaTri = rs.getDate("ngayGiaTri");
                String nganHangTrungGian = rs.getString("nganHangTrungGian");
                String tenNguoiThuHuong = rs.getString("tenNguoiThuHuong");
                String taiKhoanThuHuong = rs.getString("taiKhoanThuHuong");
                String soThamChieuGiaoDich = rs.getString("soThamChieuGiaoDich");
                String loaiTien = rs.getString("loaiTien");
                Date ngayGioTaoLenh = rs.getDate("ngayGioTaoLenh");
                Date ngayGiaoDich = rs.getDate("ngayGiaoDich");
                Double soTienGiaoDich = rs.getDouble("soTienGiaoDich");
                String tenNguoiChuyen = rs.getString("tenNguoiChuyen");
                String taiKhoanNguoiChuyen = rs.getString("taiKhoanNguoiChuyen");
                String donViGui = rs.getString("donViGui");
                String noiDungThanhToan = rs.getString("noiDungThanhToan");
                Double vat = rs.getDouble("vat");

                wireTransfer103 = new WireTransfer103
                        (id, version, thongTinNguoiChuyen, maDien, hachToanTuDong, soTienPhi, soGiaoDich, nguoiKiemSoat, xacThucGiaoDich,
                            kyHieuMatKeToan, deleted, ngayGiaTri, nganHangTrungGian, tenNguoiThuHuong, taiKhoanThuHuong, soThamChieuGiaoDich,
                            loaiTien, ngayGioTaoLenh, ngayGiaoDich, soTienGiaoDich, tenNguoiChuyen, taiKhoanNguoiChuyen, donViGui, noiDungThanhToan, vat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return wireTransfer103;
    }
}
