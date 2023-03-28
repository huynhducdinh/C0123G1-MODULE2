package module_2_apj.service.booking;

import module_2_apj.molel.bookingorcontract.Booking3;
import module_2_apj.repositroy.booking.BookingRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingServiceIml implements IBookingServive {
    BookingRepo bookingRepo = new BookingRepo();
    List<Booking3> booking3List = bookingRepo.display();
    static Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        for (Booking3 b : booking3List) {
            System.out.println(b);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập mã Booking");
        String id = sc.nextLine();
        System.out.println("Nhập mã Khách hàng");
        String code = sc.nextLine();
        System.out.println("Nhập ngày bắt đầu");
        String batDau = sc.nextLine();
        System.out.println("Nhập ngày kết thúc");
        String ketThuc = sc.nextLine();
        System.out.println("Nhập tên dịch vụ");
        String name1 = sc.nextLine();
        System.out.println("Nhập  loại dịch vụ.");
        String name2 = sc.nextLine();
        Booking3 booking3 = new Booking3(id, code, batDau, ketThuc, name1, name2);
        booking3List.add(booking3);
        bookingRepo.add(booking3);
    }

    @Override
    public void update() {
    }

    @Override
    public void delete() {
    }

    public void displayContract() {

    }

    @Override
    public void addContract() {

    }


}
