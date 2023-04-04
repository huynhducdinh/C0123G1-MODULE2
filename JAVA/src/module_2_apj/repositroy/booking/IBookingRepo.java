package module_2_apj.repositroy.booking;

import module_2_apj.molel.bookingorcontract.Booking;

import java.util.Set;

public interface IBookingRepo {
    Set<Booking> display();


    void addBooking(Set<Booking> booking);


    void update(Booking booking);


    void delete();
    void displayContract();
}
