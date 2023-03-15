package module_2_apj.molel;
//Số hợp đồng, mã booking, Số tiền cọc trước, Tổng số tiền thanh toán, mã khách hàng.
//  hợp đồng của khách hàng.
public class Contract {
    String contractNumber;
    String reservationNumber;
    String reservationAmount;
    String totalPaymentAmount;
    String customerCode;

    public Contract() {
    }

    public Contract(String contractNumber, String reservationNumber, String reservationAmount, String totalPaymentAmount, String customerCode) {
        this.contractNumber = contractNumber;
        this.reservationNumber = reservationNumber;
        this.reservationAmount = reservationAmount;
        this.totalPaymentAmount = totalPaymentAmount;
        this.customerCode = customerCode;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public String getReservationAmount() {
        return reservationAmount;
    }

    public void setReservationAmount(String reservationAmount) {
        this.reservationAmount = reservationAmount;
    }

    public String getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(String totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "contractNumber='" + contractNumber + '\'' +
                ", reservationNumber='" + reservationNumber + '\'' +
                ", reservationAmount='" + reservationAmount + '\'' +
                ", totalPaymentAmount='" + totalPaymentAmount + '\'' +
                ", customerCode='" + customerCode + '\'' +
                '}';
    }
}
