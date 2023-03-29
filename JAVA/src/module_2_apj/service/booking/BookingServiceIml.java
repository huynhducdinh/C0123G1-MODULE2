package module_2_apj.service.booking;

import module_2_apj.molel.bookingorcontract.Booking;
import module_2_apj.repositroy.booking.BookingRepo;
import module_2_apj.repositroy.booking.IBookingRepo;
import module_2_apj.service.villa.VillaService;

import java.util.List;
import java.util.Scanner;

public class BookingServiceIml implements IBookingServive {
    static IBookingRepo bookingRepo = new BookingRepo();
    static Scanner sc = new Scanner(System.in);
    static List<Booking> bookingList = bookingRepo.display();


    @Override
    public void display() {
        for (Booking b : bookingList) {
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
        String name1 = tenDichVu();
        System.out.println("Nhập  loại dịch vụ.");
        String name2 = sc.nextLine();
        Booking booking = new Booking(id, code, batDau, ketThuc, name1, name2);
        bookingList.add(booking);
        bookingRepo.add(booking);
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

    static VillaService villaService = new VillaService();

    public static String tenDichVu() {
        boolean flag = true;
        do {
            System.out.println("Các loại thuê" +
                    "\n1. Villa" +
                    "\n2.House" +
                    "\n3.Room");
            System.out.println("Mời nhập kiểu thuê");
            String choss = sc.nextLine();
            switch (choss) {
                case "1":
                    System.out.println(villa());
                    return "Villa";
                case "2":
                    return "House";
                case "3":
                    return "Room";
            }
            return choss;
        } while (flag);

    }

    public static String villa() {
        boolean flag = true;
        do {
            System.out.println("chọn " +
                    "\n1.đặt villa cho bạn" +
                    "\n2.Kiểm tra đã đặt villa");
            System.out.println("Mời nhập kiểu thuê");
            String choss = sc.nextLine();
            switch (choss) {
                case "1":
                    villaService.add();
                    break;
                case "2":
                    villaService.display();
                    break;
            }
            return choss;
        } while (flag);


    }
}
