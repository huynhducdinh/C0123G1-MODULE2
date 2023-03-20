package module_2_apj.service.booking;

import module_2_apj.molel.bookingorcontract.Booking3;

import java.util.ArrayList;

public class BookingServiceIml implements IBookingServive {
    static ArrayList<Booking3> booking3s=new ArrayList<>();
    static {
        booking3s.add(new Booking3());
    }
    @Override
    public void display() {
    }

    @Override
    public void add() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {
    }
    public void displayContract(){

    }


}
