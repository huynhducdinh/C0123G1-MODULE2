package module_2_apj.molel.bookingorcontract;

public  class Contract extends BokingAndContract {

    String soHopDong;
    String tienDatCoc;
    String tongTien;

    public Contract() {
    }
    public Contract(String maBooking, String maKhachHang, String soHopDong, String tenDatCoc, String tongTien) {
        super(maBooking, maKhachHang);
        this.soHopDong = soHopDong;
        this.tienDatCoc = tenDatCoc;
        this.tongTien = tongTien;
    }

    public String getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(String soHopDong) {
        this.soHopDong = soHopDong;
    }

    public String getTienDatCoc() {
        return tienDatCoc;
    }

    public void setTienDatCoc(String tienDatCoc) {
        this.tienDatCoc = tienDatCoc;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "HopDongThue3{" +
                "soHopDong='" + soHopDong + '\'' +
                ", maBooking='" + maBooking + '\'' +
                ", maKhhachHang='" + maKhachHang + '\'' +
                ", tongTien=" + tongTien +
                ", tenDatCoc=" + tienDatCoc +
                '}';
    }
    public String convertLine5() {
        String COMMA = ",";
        return getSoHopDong() + COMMA + getMaBooking() + COMMA + getMaKhachHang()+COMMA+getTongTien()+COMMA+ getTienDatCoc();
    }
}
