package module_2_apj.repositroy.booking;

import module_2_apj.molel.bookingorcontract.Booking;
import module_2_apj.util.read_file.BookingReadFile;
import module_2_apj.util.wrtie_file.BookingWriteFile;

import java.util.Scanner;
import java.util.Set;

public class BookingRepo implements IBookingRepo {
    private static final String BOOKING_LIST_PATH = "src\\module_2_apj\\data\\booking.csv";
    static Scanner sc = new Scanner(System.in);
    public static void writeFileBook(Set<Booking> bookingList){
        BookingWriteFile.bookingWrite(BOOKING_LIST_PATH,bookingList);
    }
//     Set<Booking> bookingList= BookingReadFile.readBooking();


    @Override
    public Set<Booking> display() {
        Set<Booking>bookingSet=BookingReadFile.readBooking();
       return bookingSet;
    }

    @Override
    public void addBooking(Set<Booking> booking) {
        writeFileBook(booking);
    }

    @Override
    public void update(Booking booking) {

    }

    @Override
    public void delete() {

    }

    @Override
    public void displayContract() {

    }
}
