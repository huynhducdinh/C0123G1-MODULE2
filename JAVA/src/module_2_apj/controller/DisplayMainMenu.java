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
            System.out.println("List of managers and managers of Furama. resort " +
                    "\n 1.Employee Management" +
                    "\n 2.Customer Management" +
                    "\n 3.Facility Management " +
                    "\n 4.Booking Management" +
                    "\n 5.Promotion Management" +
                    "\n 6.Exit"+"|:|"+"Select function--->");
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
                    System.out.println("Exit");
                    break;
            }
        } while (flag);
    }

    public static void employeeDisplay() {
        boolean check;
        do {
            check = true;
            System.out.println("Select the function of item employees" +
                    "\n1.Display list employees" +
                    "\n2.Add new employee" +
                    "\n3.Edit employee" +
                    "\n4.Return main menu"+"|:|"+"Select function--->");
            int choosee = Integer.parseInt(sc.nextLine());
            switch (choosee) {
                case 1:
                    System.out.println("Show list of employees");
                    employeeServiceIml.display();
                    break;
                case 2:
                    System.out.println("Add new staff");
                    employeeServiceIml.add();
                    break;
                case 3:
                    System.out.println("Edit staff");
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
            System.out.println("Select the function of the item customers" +
                    "\n1. Display list customers" +
                    "\n2. Add new customer" +
                    "\n3. Edit customer" +
                    "\n4. Return main menu"+"|:|"+"Select function--->");
            int choosee = Integer.parseInt(sc.nextLine());
            switch (choosee) {
                case 1:
                    System.out.println("Show list of customers");
                    customerServiceIml.display();
                    break;
                case 2:
                    System.out.println("Add new customers");
                    customerServiceIml.add();
                    break;
                case 3:
                    System.out.println("Edit customers");
                    customerServiceIml.update();
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
            System.out.println("Select the function of the item facility" +
                    "\n1. Display list facility" +
                    "\n2. Add new facility" +
                    "\n3. Display list facility maintenance" +
                    "\n4. Return main menu"+"|:|"+"Select function--->");
            int choosee = Integer.parseInt(sc.nextLine());
            switch (choosee) {
                case 1:
                    System.out.println("Base display list");
                    facilityServiceImpl.display();
                    break;
                case 2:
                    System.out.println("Add a new facility");
                    facilityServiceImpl.add();
                    break;
                case 3:
                    System.out.println("Show facility maintenance list");
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
            System.out.println("Select the function of the item booking" +
                    "\n1. Add new booking" +
                    "\n2. Display list booking" +
                    "\n3. Create new contract" +
                    "\n4. Display list contracts" +
                    "\n5. Edit contracts" +
                    "\n6. Return main menu"+"|:|"+"Select function--->");
            int choosee = Integer.parseInt(sc.nextLine());
            switch (choosee) {
                case 1:
                    System.out.println("Add new booking");
                    bookingServiceIml.add();
                    break;
                case 2:
                    System.out.println("+Show reservation list");
                    bookingServiceIml.display();
                    break;
                case 3:
                    System.out.println("Create a new contract");
                    hopDongThueServiceIml.add();
                    break;
                case 4:
                    System.out.println("Show contract list");
                    hopDongThueServiceIml.display();
                    break;
                case 5:
                    System.out.println("Edit contract");
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
            System.out.println("Select the function of the item promotion" +
                    "\n 1.Display list customers use service" +
                    "\n2. Display list customers get voucher" +
                    "\n3. Return main menu"+"|:|"+"Select function--->");
            int choosee = Integer.parseInt(sc.nextLine());
            switch (choosee) {
                case 1:
                    System.out.println("+Display a list of customers using the service");
                    promotionServiceIml.display();
                    break;
                case 2:
                    System.out.println("Display the list of customers receiving vouchers");
                    promotionServiceIml.displayVoucher();
                    break;
                case 3:
                    flag = false;
                    break;
            }
        } while (flag);
    }


}


