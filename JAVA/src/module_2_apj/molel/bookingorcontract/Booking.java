package module_2_apj.molel.bookingorcontract;

import org.jetbrains.annotations.NotNull;

//mã bookingtxt, ngày bắt đầu, ngày kết thúc, mã khách hàng, tên dịch vụ, loại dịch vụ.//
//của customer ( khách hàng)
public class Booking extends BookingAndContract implements Comparable<Booking> {
    private String startDate;
    private String endDate;
    private String serviceName;
    private String serviceType;

    public Booking() {
    }

    public Booking(String maBooking, String maKhhachHang, String startDate, String endDate, String serviceName, String serviceType) {
        super(maBooking, maKhhachHang);
        this.startDate = startDate;
        this.endDate = endDate;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Booking3{" +
                ", codeClient='" + codeClient + '\'' +
                ", codeBooking='" + codeBooking + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }

    public String convertLine3() {
        String COMMA = ",";
        return getMaKhachHang() + COMMA + getCodeBooking() + COMMA + getStartDate() + COMMA + getEndDate() + COMMA + getServiceName() + COMMA + getServiceType();

    }

    @Override
    public int compareTo(@NotNull Booking o) {
//        o là tăng dần , this. là giảm dầm
        return o.getStartDate().compareTo(this.getStartDate());
    }
}
