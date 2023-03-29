package module_2_apj.molel.bookingorcontract;

public  abstract class BokingAndContract {
    String maBooking;
    String maKhachHang;

    public BokingAndContract() {
    }

    public BokingAndContract(String maBooking, String maKhhachHang) {
        this.maBooking = maBooking;
        this.maKhachHang = maKhhachHang;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    @Override
    public String toString() {
        return "Cha3CuaBokingContract{" +
                "maBooking='" + maBooking + '\'' +
                ", maKhhachHang='" + maKhachHang + '\'' +
                '}';
    }
}
