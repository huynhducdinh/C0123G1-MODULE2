package module_2_apj.molel.furama;

// House được kế thừ từ Facility và có thêm các chức năng khác :Tiêu chuẩn phòng, Số tầng
public class House extends Facility {
    String tieuChuanPhong;

    int soTang;

    public House() {

    }

    public House(String tenDichVu, double dienTich, double chiPhiThue, int soNguoiToiDa, String kieuThue, String tieuChuanPhong, int soTang) {
        super(tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;

        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }



    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" +
                "  tenDichVu='" + tenDichVu + '\'' +
                ", dienTich='" + dienTich + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soNguoiToiDa='" + soNguoiToiDa + '\'' +
                ", kieuThue='" + kieuThue + '\'' +
                ", tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang='" + soTang + '\'' +
                '}';
    }
    public String convertLine6() {
        String COMMA = ",";
        return getTenDichVu() + COMMA + getDienTich() + COMMA + getChiPhiThue()+ COMMA + getSoNguoiToiDa()+ COMMA + getKieuThue()+ COMMA + getTieuChuanPhong()+COMMA + getSoTang();
    }
}
