package module_2_apj.molel.furama;


public class Villa extends Facility {

    String tieuChuanPhong;
    String dienTichHoBoi;
    String soTang;
    public Villa() {
    }


    public Villa(String tenDichVu, double dienTich, double chiPhiThue, int soNguoiToiDa, String kieuThue, String tieuChuanPhong, String dienTichHoBoi, String soTang) {
        super(tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(String dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa{" +
                " tenDichVu='" + tenDichVu + '\'' +
                ", dienTich='" + dienTich + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soNguoiToiDa='" + soNguoiToiDa + '\'' +
                ", kieuThue='" + kieuThue + '\'' +
                ",tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi='" + dienTichHoBoi + '\'' +
                ", soTang='" + soTang + '\'' +
                '}';
    }

    public String convertLine4() {
        String COMMA = ",";
        return getTenDichVu() + COMMA + getDienTich() + COMMA + getChiPhiThue()+ COMMA + getSoNguoiToiDa()+ COMMA + getKieuThue()+ COMMA + getTieuChuanPhong()+ COMMA + getDienTichHoBoi()+ COMMA + getSoTang();
    }
}
