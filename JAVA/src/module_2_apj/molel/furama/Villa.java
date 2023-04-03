package module_2_apj.molel.furama;


public class Villa extends Facility {

    String roomStandard;
    double poolArea;
    int numberOfFloors;
    public Villa() {
    }

    public Villa(String codeService, String nameService, double acreage, double rentalCosts, int manyPeople, String rentalType, String roomStandard, double poolArea, int numberOfFloors) {
        super(codeService, nameService, acreage, rentalCosts, manyPeople, rentalType);
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

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                " codeService='" + codeService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", acreage='" + acreage + '\'' +
                ", rentalCosts='" + rentalCosts + '\'' +
                ", manyPeople='" + manyPeople + '\'' +
                ", rentalType='" + rentalType + '\'' +
                ",roomStandard='" + roomStandard + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                '}';
    }

    public String convertLine4() {
        String COMMA = ",";
        return getCodeService()+COMMA+getNameService() + COMMA + getAcreage() + COMMA + getRentalCosts()+ COMMA + getManyPeople()+ COMMA + getRentalType()+ COMMA + getRoomStandard()+ COMMA + getPoolArea()+ COMMA + getNumberOfFloors();
    }
}
