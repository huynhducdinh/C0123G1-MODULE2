package module_2_apj.controller;

import module_2_apj.service.FacilityServiceImpl;

import java.util.Scanner;

public class DisplayMainMenu {
    public static void displayMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        Scanner sc = new Scanner(System.in);
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
                    do {
                        System.out.println("Chọn chức năng");
                        int choosee = Integer.parseInt(sc.nextLine());
                        switch (choosee) {
                            case 1:
                                System.out.println("+Hiển thị danh sách");
                                facilityService.display();
                                break;
                            case 2:
                                System.out.println("them mơi");
                                facilityService.add();
                                break;
                            case 3:
                                System.out.println("cam ơn");
                                break;
                            case 4:
                                flag = false;
                                break;
                        }
                    } while (flag);
                    break;
                case 2:
                    customerDispay();
                    do {
                        System.out.println("Chọn chức năng");

                        int chooseee = Integer.parseInt(sc.nextLine());
                        switch (chooseee) {
                            case 1:
                                System.out.println("+Hiển thị danh sách2");
                                break;
                            case 2:
                                System.out.println("them mơi1");
                                break;
                            case 3:
                                System.out.println("cam ơ1n");
                                break;
                            case 4:
                                flag = false;
                                break;
                        }
                    } while (flag);

                case 3:
                    facilityDisplay();
                    break;
                case 4:
                    bookingDisplay();
                    break;

                case 5:
                    romotionDisplay();
                    break;
                case 6:
                    flag = false;
                    System.out.println("Hết chức năng");
                    break;
            }
        } while (flag);
    }

    public static void employeeDisplay() {
        System.out.println("Chọn chức năng của hạng mục 1" +
                "\n1.Display list employees" +
                "\n2.Add new employee" +
                "\n3.Edit employee" +
                "\n4.Return main menu");

    }

    public static void customerDispay() {
        System.out.println("Chọn chức năng của hạng mụa 2" +
                "\n1. Display list customers" +
                "\n2. Add new customer" +
                "\n3. Edit customer" +
                "\n4. Return main menu");
    }

    public static void facilityDisplay() {
        System.out.println("Chọn chức năng của hạng mụa 3" +
                "\n1. Display list facility" +
                "\n2. Add new facility" +
                "\n3. Display list facility maintenance" +
                "\n4. Return main menu");
    }

    public static void bookingDisplay() {
        System.out.println("Chọn chức năng của hạng mụa 4" +
                "\n1. Add new booking" +
                "\n2. Display list booking" +
                "\n3. Create new contract" +
                "\n4. Display list contracts" +
                "\n5. Edit contracts" +
                "\n6. Return main menu");
    }

    public static void romotionDisplay() {
        System.out.println("Chọn chức năng của hạng mụa 4" +
                "\n 1.Display list customers use service" +
                "\n2. Display list customers get voucher" +
                "\n3. Return main menu");
    }

}


