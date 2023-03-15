package module_2_apj.molel;
// Facility (cơ sở vật chất) bao gồm các thông tin chung của tất cả dịch vụ cho thuê Villa, House, Room.Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.
public class Facility {
    String villa;
    String house;
    String room;
    String serviceName;
    String usableArea;
    String rentalCosts;
    String maximumPerson;
    String mentalPeriod;
    public Facility() {
    }

    public Facility(String villa, String house, String room, String serviceName, String usableArea, String rentalCosts, String maximumPerson, String mentalPeriod) {
        this.villa = villa;
        this.house = house;
        this.room = room;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumPerson = maximumPerson;
        this.mentalPeriod = mentalPeriod;
    }

    public String getVilla() {
        return villa;
    }

    public void setVilla(String villa) {
        this.villa = villa;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getMaximumPerson() {
        return maximumPerson;
    }

    public void setMaximumPerson(String maximumPerson) {
        this.maximumPerson = maximumPerson;
    }

    public String getMentalPeriod() {
        return mentalPeriod;
    }

    public void setMentalPeriod(String mentalPeriod) {
        this.mentalPeriod = mentalPeriod;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "villa='" + villa + '\'' +
                ", house='" + house + '\'' +
                ", room='" + room + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", rentalCosts='" + rentalCosts + '\'' +
                ", maximumPerson='" + maximumPerson + '\'' +
                ", mentalPeriod='" + mentalPeriod + '\'' +
                '}';
    }
}
