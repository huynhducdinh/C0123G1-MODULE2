package module_2_apj.service.booking;

import module_2_apj.method.CheckTrueOfFalse;
import module_2_apj.molel.bookingorcontract.Booking;
import module_2_apj.molel.furama.Facility;
import module_2_apj.molel.furama.House;
import module_2_apj.molel.furama.Room;
import module_2_apj.molel.furama.Villa;
import module_2_apj.molel.person.Customer;
import module_2_apj.repositroy.booking.BookingRepo;
import module_2_apj.repositroy.booking.IBookingRepo;
import module_2_apj.repositroy.customer.CustomerRepo;
import module_2_apj.repositroy.customer.ICustomerRepo;
import module_2_apj.repositroy.facility.FacilityRepo;
import module_2_apj.repositroy.house.HouseRepo;
import module_2_apj.repositroy.house.IHouseRepo;
import module_2_apj.repositroy.room.IRoomRepo;
import module_2_apj.repositroy.room.RoomRepo;
import module_2_apj.repositroy.villa.IVillaRepo;
import module_2_apj.repositroy.villa.VillaRepo;
import module_2_apj.service.facility.FacilityServiceImpl;
import module_2_apj.service.facility.IFacilityService;
import module_2_apj.service.house.HouseServiceImpl;
import module_2_apj.service.house.IHouseService;
import module_2_apj.service.room.IRoomService;
import module_2_apj.service.room.RoomServiceImpl;
import module_2_apj.service.villa.IVillaService;
import module_2_apj.service.villa.VillaServiceImpl;
import module_2_apj.util.read_file.*;
import module_2_apj.util.wrtie_file.BookingWriteFile;
import module_2_apj.util.wrtie_file.VillaWriteFile;
import sun.font.FontRunIterator;

import java.util.*;


public class BookingServiceIml implements IBookingServive {
    static IBookingRepo bookingRepo = new BookingRepo();
    static Scanner sc = new Scanner(System.in);
    static Set<Booking> bookingList = bookingRepo.display();
    static List<Customer> customerList = new ArrayList<>();
    List<Customer> customers = CustomerReadFile.comparators();
    static IVillaService iVillaService = new VillaServiceImpl();
    static IHouseService iHouseService = new HouseServiceImpl();
    static IRoomService iRoomService = new RoomServiceImpl();
    static IVillaRepo iVillaRepo = new VillaRepo();
    static IHouseRepo iHouseRepo=new HouseRepo();
    static IRoomRepo iRoomRepo=new RoomRepo();


    @Override
    public void display() {
        bookingList = bookingRepo.display();
        for (Booking b : bookingList) {
            System.out.println(b);
        }

    }

    @Override
    public void add() {
        bookingList = BookingReadFile.readBooking();
        System.out.println("LIST OF CUSTOMERS");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println("Name Customer: " + customers.get(i).getName() + " :|: " + "Code Customer: " + customers.get(i).getCodee());
        }
        String codeCustomer = checkCodeCustomer();
        String codeBooking = CheckTrueOfFalse.checkBooking();
        String start = CheckTrueOfFalse.checkDateBooking();
        String end = CheckTrueOfFalse.checkDateBooking();
        String serviceName = serviceName();
        System.out.println("Chọn loại dich vụ");
        String serviceType = sc.nextLine();
        checkService(serviceName);
        Booking booking = new Booking(codeCustomer, codeBooking, start, end, serviceName, serviceType);
        bookingList.add(booking);
        bookingRepo.addBooking(bookingList);


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


    public static String serviceName() {
        boolean flag;
        do {
            flag = true;
            System.out.print("Types of services " +
                    "\n1.Villa" +
                    "\n2.House" +
                    "\n3.Room" +
                    "\n Please enter rental type--> ");
            String choss = sc.nextLine();
            switch (choss) {
                case "1":
                    iVillaService.display();
                    return "Villa";
                case "2":
                    iHouseService.display();
                    return "House";
                case "3":
                    iRoomService.display();
                    return "room";
                default:
                    flag = false;
            }
            return choss;
        } while (!flag);
    }

    public static String checkCodeCustomer() {
        customerList = CustomerReadFile.comparators();
        String codeCustomer;
        boolean flag;
        do {
            flag = true;
            int count = 0;
//             Chọn mã khách hàng
//            System.out.println("Choose customer code--> "+"Nhập mã khách hàng--->");
            codeCustomer = CheckTrueOfFalse.checkCustomer();
            for (int i = 0; i < customerList.size(); i++) {
                if (!customerList.get(i).getCodee().equals(codeCustomer)) {
                    count++;
                }
            }
            if (count == customerList.size()) {
                flag = false;
                System.out.println("Customer code does not exist. |Please re-enter --> " + "Mã khách hàng không tồn tại. |Vui lòng nhập lại --> ");
            }
        } while (!flag);
        return codeCustomer;
    }


    public String checkServiceType(String serviceType) {
        String serviceHorse = null;
        switch (serviceType) {
            case "Villa":
                serviceHorse = CheckTrueOfFalse.checkCodeVl();
                break;
            case "Room":
                serviceHorse = CheckTrueOfFalse.checkCodeRo();
                break;
            case "House":
                serviceHorse = CheckTrueOfFalse.checkCodeHo();
                break;
        }
        return serviceHorse;
    }

    public void checkService(String name) {
        Map<Villa, Integer> villa = iVillaRepo.getAllDisplay();
        Map<House, Integer> house = iHouseRepo.displayHouse();
        Map<Room, Integer> room = iRoomRepo.getDisplayRom();
        switch (name) {
            case "Villa":
            for (Villa v : villa.keySet()) {
                if (v.getCodeService().equals(name)) {
                    villa.put(v, villa.get(v) + 1);
                    VillaWriteFile.writeFileVilla(villa);
                }
            }
            break;
            case "House":
                for (House h:house.keySet()){
                    if (h.getCodeService().equals(name)){}
                }
        }
    }
}


