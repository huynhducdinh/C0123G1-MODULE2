package module_2_apj.service.room;

public interface IRoomService {
    void display();
    void addRoom();
   boolean checkServiceNumberForBooking(String serviceNum);
   void updateTimesOfUsingService(String serviceNum);
}
