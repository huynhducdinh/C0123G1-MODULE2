package module_2_apj.controller;

import module_2_apj.service.booking.BookingServiceIml;
import module_2_apj.service.booking.IBookingServive;

import module_2_apj.service.customer.CustomerServiceIml;
import module_2_apj.service.customer.ICustomerService;
import module_2_apj.service.employee.EmployeeServiceIml;
import module_2_apj.service.employee.IEmployessService;
import module_2_apj.service.facility.FacilityServiceImpl;
import module_2_apj.service.facility.IFacilityService;
import module_2_apj.service.contract.ContractServiceIml;
import module_2_apj.service.contract.IContract;
import module_2_apj.service.promotion.IPromotionService;
import module_2_apj.service.promotion.PromotionSreviceIml;

import java.util.Scanner;


public class DisplayMainMenu {
    static IFacilityService facilityServiceImpl = new FacilityServiceImpl();
    static IBookingServive bookingServiceIml = new BookingServiceIml();
    static IPromotionService promotionServiceIml = new PromotionSreviceIml();
    static ICustomerService customerServiceIml =  new CustomerServiceIml();
    static IEmployessService employeeServiceIml = new EmployeeServiceIml();
    static IContract hopDongThueServiceIml = new ContractServiceIml();
    static Scanner sc = new Scanner(System.in);

    public static void displayMenu() {
        boolean flag = true;
        do {
            System.out.println("Danh sách quản lí hồ sơ " +
                    "\n 1.employee Management" +
                    "\n 2.customer Management" +
                    "\n 3.Facility Management " +
                    "\n 4.Booking Management" +
                    "\n 5.Promotion Management" +
                    "\n 6.Exit");
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    employeeDisplay();
                    break;
                case 2:
                    customerDispay();
                    break;
                case 3:
                    facilityDisplay();
                    break;
                case 4:
                    bookingDisplay();
                    break;
                case 5:
                    promotionDisplay();
                    break;
                case 6:
                    flag = false;
                    System.out.println("Hết rồi");
                    break;
            }
        } while (flag);
    }

    public static void employeeDisplay() {
        boolean check;
        do {
            check = true;
            System.out.println("Chọn chức năng của hạng mục 1" +
                    "\n1.Display list employees" +
                    "\n2.Add new employee" +
                    "\n3.Edit employee" +
                    "\n5.xx"+
                    "\n4.Return main menu");
            System.out.println("Chọn chức năng");
            int choosee = Integer.parseInt(sc.nextLine());
            switch (choosee) {
                case 1:
                    System.out.println("Hiển thị danh sách nhân viên");
                    employeeServiceIml.display();
                    break;
                case 2:
                    System.out.println("Thêm nhân viên mới");
                    employeeServiceIml.add();
                    break;
                case 3:
                    System.out.println("Chỉnh sửa nhân viên");
                    employeeServiceIml.update();
                    break;
                case 5:
                    System.out.println("xao nhân viên");

                    employeeServiceIml.delete();
                    break;
                case 4:
                    check = false;
                    break;
            }
        } while (check);

    }

    public static void customerDispay() {
        boolean check;
        do {
            check = true;
            System.out.println("Chọn chức năng của hạng mụa 2" +
                    "\n1. Display list customers" +
                    "\n2. Add new customer" +
                    "\n3. Edit customer" +
                    "\n5.coá" +
                    "\n4. Return main menu");
            System.out.println("Chọn chức năng");
            int choosee = Integer.parseInt(sc.nextLine());
            switch (choosee) {
                case 1:
                    System.out.println("Hiển thị danh sách khách hàng");
                    customerServiceIml.display();
                    break;
                case 2:
                    System.out.println("Thêm khách hàng mới");
                    customerServiceIml.add();
                    break;
                case 3:
                    System.out.println("Chỉnh sửa khách hàng");
                    customerServiceIml.update();
                    break;
                case 5:
                    customerServiceIml.delete();
                    break;
                case 4:
                    check = false;
                    break;
            }
        } while (check);
    }

    public static void facilityDisplay() {
        boolean check;
        do {
            check = true;
            System.out.println("Chọn chức năng của hạng mụa 3" +
                    "\n1. Display list facility" +
                    "\n2. Add new facility" +
                    "\n3. Display list facility maintenance" +
                    "\n4. Return main menu");
            System.out.println("Chọn chức năng");
            int choosee = Integer.parseInt(sc.nextLine());
            switch (choosee) {
                case 1:
                    System.out.println("danh sách hiển thị cơ sở");
                    facilityServiceImpl.display();
                    break;
                case 2:
                    System.out.println("Thêm cơ sở mới");
                    facilityServiceImpl.add();
                    break;
                case 3:
                    System.out.println("Hiển thị danh sách bảo trì cơ sở");
                    facilityServiceImpl.displaymaintenance();
                    break;
                case 4:
                    check = false;
                    break;
            }
        } while (check);
    }

    public static void bookingDisplay() {
        boolean flag;
        do {
            flag = true;
            System.out.println("Chọn chức năng của hạng mụa 4" +
                    "\n1. Add new bookingtxt" +
                    "\n2. Display list bookingtxt" +
                    "\n3. Create new contract" +
                    "\n4. Display list contracts" +
                    "\n5. Edit contracts" +
                    "\n6. Return main menu");
            System.out.println("Chọn chức năng");
            int choosee = Integer.parseInt(sc.nextLine());
            switch (choosee) {
                case 1:
                    System.out.println("Thêm đặt chỗ mới");
                    bookingServiceIml.add();
                    break;
                case 2:
                    System.out.println("+Hiển thị danh sách đặt chỗ");
                    bookingServiceIml.display();
                    break;
                case 3:
                    System.out.println("Tạo hợp đồng mới");
                    hopDongThueServiceIml.add();
                    break;
                case 4:
                    System.out.println("Hiển thị danh sách hợp đồng");
                    hopDongThueServiceIml.display();
                    break;
                case 5:
                    System.out.println("Chỉnh sửa hợp đồng");
                    hopDongThueServiceIml.update();
                    break;
                case 6:
                    flag = false;
                    break;
            }
        } while (flag);
    }

    public static void promotionDisplay() {
        boolean flag;
        do {
            flag = true;
            System.out.println("Chọn chức năng của hạng mụa 4" +
                    "\n 1.Display list customers use service" +
                    "\n2. Display list customers get voucher" +
                    "\n3. Return main menu");
            System.out.println("Chọn chức năng");
            int choosee = Integer.parseInt(sc.nextLine());
            switch (choosee) {
                case 1:
                    System.out.println("+Hiển thị danh sách khách hàng sử dụng dịch vụ");
                    promotionServiceIml.display();
                    break;
                case 2:
                    System.out.println("Hiển thị danh sách khách hàng nhận voucher");
                    promotionServiceIml.displayVoucher();
                    break;
                case 3:
                    flag = false;
                    break;
            }
        } while (flag);
    }


}


