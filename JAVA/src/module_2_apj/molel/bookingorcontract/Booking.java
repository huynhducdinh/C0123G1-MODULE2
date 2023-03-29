package module_2_apj.molel.bookingorcontract;

//mã bookingtxt, ngày bắt đầu, ngày kết thúc, mã khách hàng, tên dịch vụ, loại dịch vụ.//
//của customer ( khách hàng)
public class Booking extends BokingAndContract {

String startDate;
String endDate;
String serviceName;
String serviceType;

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
                ", maBooking='" + maBooking + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", maKhhachHang='" + maKhachHang + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }
    public String convertLine3(){
        String COMMA= ",";
        return getMaBooking()+COMMA+getStartDate()+COMMA+getEndDate()+COMMA+ getMaKhachHang()+COMMA+getServiceName()+COMMA+getServiceType();

    }
}
