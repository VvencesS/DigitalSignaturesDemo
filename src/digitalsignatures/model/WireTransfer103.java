package digitalsignatures.model;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement(name = "wiretransfer103")
@XmlAccessorType(XmlAccessType.FIELD)
public class WireTransfer103 {
    @XmlAttribute(name = "id")
    private int id;
    @XmlElement(name = "version")
    private int version;
    @XmlElement(name = "thongTinNguoiChuyen")
    private String thongTinNguoiChuyen;
    @XmlElement(name = "maDien")
    private String maDien;
    @XmlElement(name = "hachToanTuDong")
    private String hachToanTuDong;
    @XmlElement(name = "soTienPhi")
    private Double soTienPhi;
    @XmlElement(name = "soGiaoDich")
    private String soGiaoDich;
    @XmlElement(name = "nguoiKiemSoat")
    private String nguoiKiemSoat;
    @XmlElement(name = "xacThucGiaoDich")
    private String xacThucGiaoDich;
    @XmlElement(name = "kyHieuMatKeToan")
    private String kyHieuMatKeToan;
    @XmlElement(name = "deleted")
    private Boolean deleted;
    @XmlElement(name = "ngayGiaTri")
    private Date ngayGiaTri;
    @XmlElement(name = "ngayGiaTri")
    private String nganHangTrungGian;
    @XmlElement(name = "tenNguoiThuHuong")
    private String tenNguoiThuHuong;
    @XmlElement(name = "taiKhoanThuHuong")
    private String taiKhoanThuHuong;
    @XmlElement(name = "soThamChieuGiaoDich")
    private String soThamChieuGiaoDich;
    @XmlElement(name = "loaiTien")
    private String loaiTien;
    @XmlElement(name = "ngayGioTaoLenh")
    private Date ngayGioTaoLenh;
    @XmlElement(name = "ngayGiaoDich")
    private Date ngayGiaoDich;
    @XmlElement(name = "soTienGiaoDich")
    private Double soTienGiaoDich;
    @XmlElement(name = "tenNguoiChuyen")
    private String tenNguoiChuyen;
    @XmlElement(name = "taiKhoanNguoiChuyen")
    private String taiKhoanNguoiChuyen;
    @XmlElement(name = "donViGui")
    private String donViGui;
    @XmlElement(name = "noiDungThanhToan")
    private String noiDungThanhToan;
    @XmlElement(name = "vat")
    private Double vat;

    public WireTransfer103() {
    }

    public WireTransfer103(int id, int version, String thongTinNguoiChuyen, String maDien, String hachToanTuDong, Double soTienPhi, String soGiaoDich, String nguoiKiemSoat, String xacThucGiaoDich, String kyHieuMatKeToan, Boolean deleted, Date ngayGiaTri, String nganHangTrungGian, String tenNguoiThuHuong, String taiKhoanThuHuong, String soThamChieuGiaoDich, String loaiTien, Date ngayGioTaoLenh, Date ngayGiaoDich, Double soTienGiaoDich, String tenNguoiChuyen, String taiKhoanNguoiChuyen, String donViGui, String noiDungThanhToan, Double vat) {
        this.id = id;
        this.version = version;
        this.thongTinNguoiChuyen = thongTinNguoiChuyen;
        this.maDien = maDien;
        this.hachToanTuDong = hachToanTuDong;
        this.soTienPhi = soTienPhi;
        this.soGiaoDich = soGiaoDich;
        this.nguoiKiemSoat = nguoiKiemSoat;
        this.xacThucGiaoDich = xacThucGiaoDich;
        this.kyHieuMatKeToan = kyHieuMatKeToan;
        this.deleted = deleted;
        this.ngayGiaTri = ngayGiaTri;
        this.nganHangTrungGian = nganHangTrungGian;
        this.tenNguoiThuHuong = tenNguoiThuHuong;
        this.taiKhoanThuHuong = taiKhoanThuHuong;
        this.soThamChieuGiaoDich = soThamChieuGiaoDich;
        this.loaiTien = loaiTien;
        this.ngayGioTaoLenh = ngayGioTaoLenh;
        this.ngayGiaoDich = ngayGiaoDich;
        this.soTienGiaoDich = soTienGiaoDich;
        this.tenNguoiChuyen = tenNguoiChuyen;
        this.taiKhoanNguoiChuyen = taiKhoanNguoiChuyen;
        this.donViGui = donViGui;
        this.noiDungThanhToan = noiDungThanhToan;
        this.vat = vat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getThongTinNguoiChuyen() {
        return thongTinNguoiChuyen;
    }

    public void setThongTinNguoiChuyen(String thongTinNguoiChuyen) {
        this.thongTinNguoiChuyen = thongTinNguoiChuyen;
    }

    public String getMaDien() {
        return maDien;
    }

    public void setMaDien(String maDien) {
        this.maDien = maDien;
    }

    public String getHachToanTuDong() {
        return hachToanTuDong;
    }

    public void setHachToanTuDong(String hachToanTuDong) {
        this.hachToanTuDong = hachToanTuDong;
    }

    public Double getSoTienPhi() {
        return soTienPhi;
    }

    public void setSoTienPhi(Double soTienPhi) {
        this.soTienPhi = soTienPhi;
    }

    public String getSoGiaoDich() {
        return soGiaoDich;
    }

    public void setSoGiaoDich(String soGiaoDich) {
        this.soGiaoDich = soGiaoDich;
    }

    public String getNguoiKiemSoat() {
        return nguoiKiemSoat;
    }

    public void setNguoiKiemSoat(String nguoiKiemSoat) {
        this.nguoiKiemSoat = nguoiKiemSoat;
    }

    public String getXacThucGiaoDich() {
        return xacThucGiaoDich;
    }

    public void setXacThucGiaoDich(String xacThucGiaoDich) {
        this.xacThucGiaoDich = xacThucGiaoDich;
    }

    public String getKyHieuMatKeToan() {
        return kyHieuMatKeToan;
    }

    public void setKyHieuMatKeToan(String kyHieuMatKeToan) {
        this.kyHieuMatKeToan = kyHieuMatKeToan;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Date getNgayGiaTri() {
        return ngayGiaTri;
    }

    public void setNgayGiaTri(Date ngayGiaTri) {
        this.ngayGiaTri = ngayGiaTri;
    }

    public String getNganHangTrungGian() {
        return nganHangTrungGian;
    }

    public void setNganHangTrungGian(String nganHangTrungGian) {
        this.nganHangTrungGian = nganHangTrungGian;
    }

    public String getTenNguoiThuHuong() {
        return tenNguoiThuHuong;
    }

    public void setTenNguoiThuHuong(String tenNguoiThuHuong) {
        this.tenNguoiThuHuong = tenNguoiThuHuong;
    }

    public String getTaiKhoanThuHuong() {
        return taiKhoanThuHuong;
    }

    public void setTaiKhoanThuHuong(String taiKhoanThuHuong) {
        this.taiKhoanThuHuong = taiKhoanThuHuong;
    }

    public String getSoThamChieuGiaoDich() {
        return soThamChieuGiaoDich;
    }

    public void setSoThamChieuGiaoDich(String soThamChieuGiaoDich) {
        this.soThamChieuGiaoDich = soThamChieuGiaoDich;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }

    public Date getNgayGioTaoLenh() {
        return ngayGioTaoLenh;
    }

    public void setNgayGioTaoLenh(Date ngayGioTaoLenh) {
        this.ngayGioTaoLenh = ngayGioTaoLenh;
    }

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public Double getSoTienGiaoDich() {
        return soTienGiaoDich;
    }

    public void setSoTienGiaoDich(Double soTienGiaoDich) {
        this.soTienGiaoDich = soTienGiaoDich;
    }

    public String getTenNguoiChuyen() {
        return tenNguoiChuyen;
    }

    public void setTenNguoiChuyen(String tenNguoiChuyen) {
        this.tenNguoiChuyen = tenNguoiChuyen;
    }

    public String getTaiKhoanNguoiChuyen() {
        return taiKhoanNguoiChuyen;
    }

    public void setTaiKhoanNguoiChuyen(String taiKhoanNguoiChuyen) {
        this.taiKhoanNguoiChuyen = taiKhoanNguoiChuyen;
    }

    public String getDonViGui() {
        return donViGui;
    }

    public void setDonViGui(String donViGui) {
        this.donViGui = donViGui;
    }

    public String getNoiDungThanhToan() {
        return noiDungThanhToan;
    }

    public void setNoiDungThanhToan(String noiDungThanhToan) {
        this.noiDungThanhToan = noiDungThanhToan;
    }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }
}
