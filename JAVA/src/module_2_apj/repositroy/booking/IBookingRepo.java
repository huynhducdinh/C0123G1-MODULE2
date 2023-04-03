package module_2_apj.repositroy.booking;

import module_2_apj.molel.bookingorcontract.Booking;

import java.util.Set;

public interface IBookingRepo {
    Set<Booking> display();


    void add(Booking booking3);


    void update(Booking booking4s);


    void delete();
    void displayContract();
}
