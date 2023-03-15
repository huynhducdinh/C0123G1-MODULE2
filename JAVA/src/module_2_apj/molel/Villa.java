package module_2_apj.molel;
// Villa  được kế thừ từ Facility và có thêm các chức năng khác :bao gồm Tiêu chuẩn phòng, Diện tích hồ bơi, Số tầng.;
public class Villa extends Facility{
    String roomStandard;
    String poolArea;
    String numberOfFloors;

    public Villa() {
    }

    public Villa(String villa, String house, String room, String serviceName, String usableArea, String rentalCosts, String maximumPerson, String mentalPeriod, String roomStandard, String poolArea, String numberOfFloors) {
        super(villa, house, room, serviceName, usableArea, rentalCosts, maximumPerson, mentalPeriod);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                ", villa='" + villa + '\'' +
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
