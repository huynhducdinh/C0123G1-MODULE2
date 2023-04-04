package module_2_apj.molel.furama;

public class Room extends Facility {
   String privateService;

    public Room() {

    }

    public Room(String codeService, String nameService, double acreage, double rentalCosts, int manyPeople, String rentalType, String privateService) {
        super(codeService, nameService, acreage, rentalCosts, manyPeople, rentalType);
        this.privateService = privateService;
    }

    public String getPrivateService() {
        return privateService;
    }

    public void setPrivateService(String privateService) {
        this.privateService = privateService;
    }

    @Override
    public String toString() {
        return "Room{" +
                " codeService='" + codeService + '\'' +
                "  nameService='" + nameService + '\'' +
                ", acreage='" + acreage + '\'' +
                ", rentalCosts='" + rentalCosts + '\'' +
                ", manyPeople='" + manyPeople + '\'' +
                ", rentalType='" + rentalType + '\'' +
                ",privateService='" + privateService + '\'' +
                '}';
    }
    public String convertLin5() {
        String COMMA = ",";
        return getCodeService()+COMMA+getNameService() + COMMA + getAcreage() + COMMA + getRentalCosts()+ COMMA + getManyPeople()+ COMMA + getRentalType()+COMMA+ getPrivateService();
    }
}
