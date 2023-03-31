package module_2_apj.molel.furama;

public  class Facility {
    String tenDichVu;
    double dienTich;
    double chiPhiThue;
    int soNguoiToiDa;
    String kieuThue;

    public Facility() {
    }

    public Facility(String tenDichVu, double dienTich, double chiPhiThue, int soNguoiToiDa, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiToiDa = soNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(int soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Furama1{" +
                "tenDichVu='" + tenDichVu + '\'' +
                ", dienTich='" + dienTich + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soNguoiToiDa='" + soNguoiToiDa + '\'' +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
    public String convertLine3() {
        String COMMA = ",";
        return getTenDichVu() + COMMA + getDienTich() + COMMA + getChiPhiThue()+ COMMA + getSoNguoiToiDa()+ COMMA + getKieuThue();
    }
}
