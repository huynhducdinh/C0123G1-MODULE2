package module_2_apj.molel;
// Room được kế thừ từ Facility và có thêm các chức năng khác :bao gồm Dịch vụ miễn phí đi kèm.
public class Room extends  Facility{
    String freeService;


    public Room() {
    }

    public Room(String villa, String house, String room, String serviceName, String usableArea, String rentalCosts, String maximumPerson, String mentalPeriod, String freeService) {
        super(villa, house, room, serviceName, usableArea, rentalCosts, maximumPerson, mentalPeriod);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
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
