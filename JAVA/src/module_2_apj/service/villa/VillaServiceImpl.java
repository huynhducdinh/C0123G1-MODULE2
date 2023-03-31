package module_2_apj.service.villa;

import module_2_apj.molel.furama.Villa;
import module_2_apj.repositroy.villa.IVillaRepo;
import module_2_apj.repositroy.villa.VillaRepo;
import module_2_apj.service.facility.FacilityServiceImpl;

import java.util.List;
import java.util.Scanner;

public class VillaServiceImpl extends Villa implements IVillaService {
    static IVillaRepo villaRepo = new VillaRepo();
    static List<Villa> villa1List = villaRepo.getAllDisplay();
    static Scanner sc = new Scanner(System.in);
    FacilityServiceImpl facilityService = new FacilityServiceImpl();

    @Override
    public void display() {
        for (Villa v : villa1List) {
            System.out.println(v);
        }
    }

    @Override
    public void addVilla() {
        System.out.println("Nhập tên dịch vụ");
        String name = sc.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        double dienTich = sc.nextDouble();
        System.out.println("Nhập chi phí thuê");
        double num = sc.nextDouble();
        System.out.println("Nhập số lượng người thuê");
        int sum = sc.nextInt();
        System.out.println("Nhập Kiểu thuê");
        String kieuThue = sc.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng");
        String phong = sc.nextLine();
        System.out.println("Nhập số tầng ");
        String number = sc.nextLine();
        System.out.println("Nhập S hồ bơi");
        String hoBoi = sc.nextLine();
        Villa villa1 = new Villa(name, dienTich, num, sum, kieuThue, phong, number, hoBoi);
        villa1List.add(villa1);
        villaRepo.addVilla(villa1);


    }
}
