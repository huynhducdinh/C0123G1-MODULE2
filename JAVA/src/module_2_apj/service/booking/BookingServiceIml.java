package module_2_apj.service.booking;

import module_2_apj.molel.bookingorcontract.Booking;
import module_2_apj.molel.furama.Facility;
import module_2_apj.molel.furama.Villa;
import module_2_apj.molel.person.Customer;
import module_2_apj.repositroy.booking.BookingRepo;
import module_2_apj.repositroy.booking.IBookingRepo;
import module_2_apj.repositroy.customer.CustomerRepo;
import module_2_apj.repositroy.customer.ICustomerRepo;
import module_2_apj.service.facility.FacilityServiceImpl;
import module_2_apj.service.facility.IFacilityService;
import module_2_apj.service.villa.VillaServiceImpl;
import module_2_apj.util.read_file.VillaReadFile;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BookingServiceIml implements IBookingServive {
    static IBookingRepo bookingRepo = new BookingRepo();
    static Scanner sc = new Scanner(System.in);
    static Set<Booking> bookingList = bookingRepo.display();
    IFacilityService iFacilityService = new FacilityServiceImpl();
    static ICustomerRepo iCustomerRepo=new CustomerRepo();

    @Override
    public void display() {

    }

    @Override
    public void add() {
       List<Customer>customerList= iCustomerRepo.getAllDisplay();
        for (Customer c:customerList){
            System.out.println(c);
        }
        System.out.print("Enter Booking Code-->");
        String id = sc.nextLine();
        System.out.print("Enter Customer Code-->");
        String code = sc.nextLine();
        System.out.print("Enter start date-->");
        String start = sc.nextLine();
        System.out.print("Enter end date-->");
        String end = sc.nextLine();
        System.out.print("Enter service name-->");
        String name = serviceName();
        System.out.print("Enter service type-->");
        String name2 = sc.nextLine();
        Booking booking = new Booking(id, code, start, end, name, name2);
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

    public static String serviceName() {
        boolean flag = true;
        do {
            System.out.println("Rent Types" +
                    "\n1. Villa" +
                    "\n2.House" +
                    "\n3.room");
            System.out.print("Please enter rental type");
            String choss = sc.nextLine();
            switch (choss) {
                case "1":
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
