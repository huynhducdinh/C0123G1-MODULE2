package module_2_apj.molel.furama;

    public class Facility {
    String codeService;
    String nameService;
    double acreage;
    double rentalCosts;
    int manyPeople;
    String rentalType;

    public Facility() {
    }

    public Facility(String codeService,String nameService, double acreage, double rentalCosts, int manyPeople, String rentalType) {
        this.nameService = nameService;
        this.codeService = codeService;
        this.acreage = acreage;
        this.rentalCosts = rentalCosts;
        this.manyPeople = manyPeople;
        this.rentalType = rentalType;
    }


    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getManyPeople() {
        return manyPeople;
    }

    public void setManyPeople(int manyPeople) {
        this.manyPeople = manyPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "  codeService='" + codeService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", acreage='" + acreage + '\'' +
                ", rentalCosts='" + rentalCosts + '\'' +
                ", manyPeople='" + manyPeople + '\'' +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    public String convertLine3() {
        String COMMA = ",";
        return getCodeService() + COMMA + getNameService() + COMMA + getAcreage() + COMMA + getRentalCosts() + COMMA + getManyPeople() + COMMA + getRentalType();
    }
}
