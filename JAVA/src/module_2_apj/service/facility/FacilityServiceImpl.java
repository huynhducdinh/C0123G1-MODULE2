package module_2_apj.service.facility;

import module_2_apj.molel.furama.Facility;

import module_2_apj.repositroy.facility.FacilityRepo;


import java.util.List;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    static FacilityRepo facilityRepo = new FacilityRepo();
    static Scanner sc = new Scanner(System.in);

    public void display() {
        List<Facility> facilities = facilityRepo.getAllDisplay();
        for (Facility f : facilities) {
            System.out.println(f);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập mã thuê ");
        String id = sc.nextLine();
        System.out.println("Nhập Tên dịch vụ ");
        String name = sc.nextLine();
        System.out.println("Nhập diện tích sử dụng ");
        double area = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập Chi phí thuê ");
        double costs = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập Số lượng người tối đa ");
        String amount = sc.nextLine();
        String kieuThue = kieuThue();
        Facility facility = new Facility(id, name, area, costs, amount, kieuThue);
        facilityRepo.add(facility);
    }

    @Override
    public void update() {
        List<Facility> facilityList1 = facilityRepo.getAllDisplay();
        System.out.println("Nhập mã cần sửa");
        String code = sc.nextLine();
        for (int i = 0; i < facilityList1.size(); i++) {
            if (facilityList1.get(i).getId() == code) {
                System.out.println("Nhập mã thuê cần sửa ");
                String id = sc.nextLine();
                System.out.println("Nhập Tên dịch vụ cần sửa ");
                String name = sc.nextLine();
                System.out.println("Nhập diện tích sử dụng cần sửa ");
                double area = Double.parseDouble(sc.nextLine());
                System.out.println("Nhập Chi phí thuê cần sửa ");
                double costs = Double.parseDouble(sc.nextLine());
                System.out.println("Nhập Số lượng người tối đa cần sửa ");
                String amount = sc.nextLine();
                String kieuThue = kieuThue();
                facilityList1.set(i, new Facility(id, name, area, costs, amount, kieuThue));
                facilityRepo.update(facilityList1);
            }
        }
    }

    @Override
    public void delete() {
    }


    public void displaymaintenance() {
        }


    public static String kieuThue() {
        System.out.println("Các loại thuê" +
                "\n1. Villa+" +
                "\n2.House" +
                "\n3.Room");
        System.out.println("Mời nhập kiểu thuê");
        String choss = sc.nextLine();
        switch (choss) {
            case "1":
                return "Villa";
            case "2":
                return "House";
            case "3":
                return "Room";
        }
        return choss;
    }
}


