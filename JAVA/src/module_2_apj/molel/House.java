package module_2_apj.molel;
// House được kế thừ từ Facility và có thêm các chức năng khác :Tiêu chuẩn phòng, Số tầng
public class House extends Facility{
    String roomStandard;
    String numberOfFloors;

    public House() {
    }

    public House(String villa, String house, String room, String serviceName, String usableArea, String rentalCosts, String maximumPerson, String mentalPeriod, String roomStandard, String numberOfFloors) {
        super(villa, house, room, serviceName, usableArea, rentalCosts, maximumPerson, mentalPeriod);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
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
