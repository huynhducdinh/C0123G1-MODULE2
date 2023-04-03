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
    static Set<Booking> bookingList= BookingReadFile.booking3List(BOOKING_LIST_PATH);


    @Override
    public Set<Booking> display() {
       return bookingList;
    }

    @Override
    public void add(Booking booking3List) {
        writeFileBook(bookingList);
    }

    @Override
    public void update(Booking booking4s) {

    }

    @Override
    public void delete() {

    }

    @Override
    public void displayContract() {

    }
}
