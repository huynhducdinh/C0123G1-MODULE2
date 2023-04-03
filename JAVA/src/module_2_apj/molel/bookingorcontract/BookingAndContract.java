package module_2_apj.molel.bookingorcontract;

public  abstract class BookingAndContract {
    String codeBooking;
    String codeClient;

    public BookingAndContract() {
    }

    public BookingAndContract(String codeBooking, String codeClient) {
        this.codeBooking = codeBooking;
        this.codeClient = codeClient;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getMaKhachHang() {
        return codeClient;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.codeClient = maKhachHang;
    }

    @Override
    public String toString() {
        return "BokingContract{" +
                "codeBooking='" + codeBooking + '\'' +
                ", codeClient='" + codeClient + '\'' +
                '}';
    }
}
