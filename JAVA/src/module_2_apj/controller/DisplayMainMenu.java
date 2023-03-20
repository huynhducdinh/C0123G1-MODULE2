package module_2_apj.controller;

import com.sun.xml.internal.ws.developer.ValidationErrorHandler;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import module_2_apj.molel.person.Employee;
import module_2_apj.service.booking.BookingServiceIml;
import module_2_apj.service.customer.CustomerServiveIml;
import module_2_apj.service.employee.EmployeeServiceIml;
import module_2_apj.service.facility.FacilityServiceImpl;
import module_2_apj.service.promotion.PromotionSreviceIml;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayMainMenu {
    static FacilityServiceImpl facilityServiceiml = new FacilityServiceImpl();
    static BookingServiceIml bookingServiceIml = new BookingServiceIml();
    static PromotionSreviceIml promotionSreviceIml = new PromotionSreviceIml();
    static CustomerServiveIml customerServiveIml = new CustomerServiveIml();
    static EmployeeServiceIml employeeServiceIml = new EmployeeServiceIml();
    static Scanner sc = new Scanner(System.in);

    public static void displayMenu() {
        boolean flag = true;
        do {
            System.out.println("Danh sách quản lí hồ sơ " +
                    "\n 1.Employee Management" +
                    "\n 2.Customer Management" +
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
                    "\n4. Return main menu");
            System.out.println("Chọn chức năng");
            int choosee = Integer.parseInt(sc.nextLine());
            switch (choosee) {
                case 1:
                    System.out.println("Hiển thị danh sách khách hàng");
                    customerServiveIml.display();
                    break;
                case 2:
                    System.out.println("Thêm khách hàng mới");
                    customerServiveIml.add();
                    break;
                case 3:
                    System.out.println("Chỉnh sửa khách hàng");
                    customerServiveIml.update();
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
                    facilityServiceiml.display();
                    break;
                case 2:
                    System.out.println("Thêm cơ sở mới");
                    facilityServiceiml.add();
                    break;
                case 3:
                    System.out.println("Hiển thị danh sách bảo trì cơ sở");
                    facilityServiceiml.displaymaintenance();
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
                    "\n1. Add new booking" +
                    "\n2. Display list booking" +
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
                    break;
                case 4:
                    System.out.println("Hiển thị danh sách hợp đồng");
                    bookingServiceIml.displayContract();
                    break;
                case 5:
                    System.out.println("Chỉnh sửa hợp đồng");
                    bookingServiceIml.update();
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
                    promotionSreviceIml.display();
                    break;
                case 2:
                    System.out.println("Hiển thị danh sách khách hàng nhận voucher");
                    promotionSreviceIml.displayVoucher();
                    break;
                case 3:
                    flag = false;
                    break;
            }
        } while (flag);
    }

}


