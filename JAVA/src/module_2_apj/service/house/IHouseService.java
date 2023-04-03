package module_2_apj.service.house;

public interface IHouseService {
    void display();
    void addHouse();
    boolean checkServiceNumberForBooking(String serviceNum);
    void updateTimesOfUsingService(String serviceNum);

}
