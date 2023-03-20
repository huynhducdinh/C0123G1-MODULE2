package module_2_apj.molel.bookingorcontract;

import module_2_apj.molel.person.PersonCha;

public  class HopDongThue3 extends Cha3CuaBokingContract {

    String soHopDong;
    int tenDatCoc;
    int tongTien;

    public HopDongThue3() {
    }
    public HopDongThue3(String maBooking, String maKhhachHang, String soHopDong, int tenDatCoc, int tongTien) {
        super(maBooking, maKhhachHang);
        this.soHopDong = soHopDong;
        this.tenDatCoc = tenDatCoc;
        this.tongTien = tongTien;
    }

    public String getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(String soHopDong) {
        this.soHopDong = soHopDong;
    }

    public int getTenDatCoc() {
        return tenDatCoc;
    }

    public void setTenDatCoc(int tenDatCoc) {
        this.tenDatCoc = tenDatCoc;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "HopDongThue3{" +
                "soHopDong='" + soHopDong + '\'' +
                ", maBooking='" + maBooking + '\'' +
                ", tenDatCoc=" + tenDatCoc +
                ", tongTien=" + tongTien +
                ", maKhhachHang='" + maKhhachHang + '\'' +
                '}';
    }
}
