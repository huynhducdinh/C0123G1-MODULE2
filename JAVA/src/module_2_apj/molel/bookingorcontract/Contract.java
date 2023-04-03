package module_2_apj.molel.bookingorcontract;

public  class Contract extends BookingAndContract {

    String someContracts;
    String setMoney;
    String sumMoney;

    public Contract() {
    }
    public Contract(String codeBooking, String codeClient, String someContracts, String setMoney, String sumMoney) {
        super(codeBooking, codeClient);
        this.someContracts = someContracts;
        this.setMoney = setMoney;
        this.sumMoney = sumMoney;
    }

    public String getSoHopDong() {
        return someContracts;
    }

    public void setSoHopDong(String soHopDong) {
        this.someContracts = soHopDong;
    }

    public String getTienDatCoc() {
        return setMoney;
    }

    public void setTienDatCoc(String tienDatCoc) {
        this.setMoney = tienDatCoc;
    }

    public String getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(String sumMoney) {
        this.sumMoney = sumMoney;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "someContracts='" + someContracts + '\'' +
                ", codeBooking='" + codeBooking + '\'' +
                ", codeClient='" + codeClient + '\'' +
                ", setMoney=" + setMoney +
                ", sumMoney=" + sumMoney +
                '}';
    }
    public String convertLine5() {
        String COMMA = ",";
        return getSoHopDong() + COMMA + getCodeBooking() + COMMA + getMaKhachHang()+COMMA+ getSumMoney()+COMMA+ getTienDatCoc();
    }
}
