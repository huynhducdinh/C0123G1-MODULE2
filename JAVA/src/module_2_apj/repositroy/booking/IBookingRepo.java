package module_2_apj.repositroy.booking;

import module_2_apj.molel.bookingorcontract.Booking3;

import java.util.List;

public interface IBookingRepo {
    List<Booking3> display();


    void add(Booking3 booking3);


    void update();


    void delete();
    void displayContract();
}
