package module_2_apj.repositroy.booking;

import module_2_apj.molel.bookingorcontract.Booking3;
import module_2_apj.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingRepo implements IBookingRepo{
    private static final String BOOKING_LIST_PATH="src/module_2_apj/data/booking.csv";
    static Scanner sc =new Scanner(System.in);
    @Override
    public List<Booking3> display() {
        List<Booking3>booking3List=new ArrayList<>();
        List<String>stringList= ReadAndWrite.readFile(BOOKING_LIST_PATH);
        int size =stringList.size();
        for (int i = 0; i <size ; i++) {
            String str=stringList.get(i);
            String[]arr=str.split(",");
            Booking3 booking3=new Booking3(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);
            booking3List.add(booking3);
        }
        return booking3List;
    }

    @Override
    public void add(Booking3 booking3List) {
    ReadAndWrite.writeFile(BOOKING_LIST_PATH, booking3List.convertLine3(),true);
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void displayContract() {

    }
}
