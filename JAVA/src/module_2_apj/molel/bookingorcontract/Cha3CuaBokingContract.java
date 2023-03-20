package module_2_apj.molel.bookingorcontract;

public  abstract class Cha3CuaBokingContract {
    String maBooking;
    String maKhhachHang;

    public Cha3CuaBokingContract() {
    }

    public Cha3CuaBokingContract(String maBooking, String maKhhachHang) {
        this.maBooking = maBooking;
        this.maKhhachHang = maKhhachHang;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public String getMaKhhachHang() {
        return maKhhachHang;
    }

    public void setMaKhhachHang(String maKhhachHang) {
        this.maKhhachHang = maKhhachHang;
    }

    @Override
    public String toString() {
        return "Cha3CuaBokingContract{" +
                "maBooking='" + maBooking + '\'' +
                ", maKhhachHang='" + maKhhachHang + '\'' +
                '}';
    }
}
