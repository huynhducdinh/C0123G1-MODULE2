package module_2_apj.service.villa;

public interface IVillaService {
    void display();
    void addVilla();
   boolean checkServiceNumberForBooking(String serviceNum);
     void updateTimesOfUsingService(String serviceNum);
}
