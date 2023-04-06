package module_2_apj.molel.furama;

// House được kế thừ từ Facility và có thêm các chức năng khác :Tiêu chuẩn phòng, Số tầng
public class House extends Facility {
  private   String roomStandard;

   private int NumberOfFloors;

    public House() {

    }

    public House(String codeService, String nameService, double acreage, double rentalCosts, int manyPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(codeService, nameService, acreage, rentalCosts, manyPeople, rentalType);
        this.roomStandard = roomStandard;
        NumberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }



    public int getNumberOfFloors() {
        return NumberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.NumberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "  codeService='" + codeService + '\'' +
                "  nameService='" + nameService + '\'' +
                ", acreage='" + acreage + '\'' +
                ", rentalCosts='" + rentalCosts + '\'' +
                ", manyPeople='" + manyPeople + '\'' +
                ", rentalType='" + rentalType + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", NumberOfFloors='" + NumberOfFloors + '\'' +
                '}';
    }
    public String convertLine6() {
        String COMMA = ",";
        return getCodeService()+COMMA+getNameService() + COMMA + getAcreage() + COMMA + getRentalCosts()+ COMMA + getManyPeople()+ COMMA + getRentalType()+ COMMA + getRoomStandard()+COMMA + getNumberOfFloors();
    }
}
