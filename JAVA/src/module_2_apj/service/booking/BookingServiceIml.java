package module_2_apj.service.booking;

import module_2_apj.molel.bookingorcontract.Booking;
import module_2_apj.molel.furama.Villa;
import module_2_apj.repositroy.booking.BookingRepo;
import module_2_apj.repositroy.booking.IBookingRepo;
import module_2_apj.service.villa.VillaServiceImpl;
import module_2_apj.util.read_file.VillaReadFile;

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

    static VillaServiceImpl villaService = new VillaServiceImpl();

    public static String tenDichVu() {
        boolean flag = true;
        do {
            System.out.println("Các loại thuê" +
                    "\n1. Villa" +
                    "\n2.House" +
                    "\n3.room");
            System.out.println("Mời nhập kiểu thuê");
            String choss = sc.nextLine();
            switch (choss) {
                case "1":
                 List<Villa> villas =  VillaReadFile.villaReadFile();
                    for (int i = 0; i < villas.size(); i++) {
                        System.out.println(villas.get(i));
                    }
                    return "Villa";
                case "2":
                    return "House";
                case "3":
                    return "room";
            }
            return choss;
        } while (flag);

    }


}
