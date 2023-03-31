package module_2_apj.service.house;

import module_2_apj.method.CheckTrueOfFalse;
import module_2_apj.molel.furama.House;
import module_2_apj.repositroy.house.HouseRepo;
import module_2_apj.repositroy.house.IHouseRepo;


import java.util.List;
import java.util.Scanner;

public class HouseServiceImpl implements IHouseService {
    static IHouseRepo iHouseRepo = new HouseRepo();
    static Scanner sc = new Scanner(System.in);
    static List<House> houseList = iHouseRepo.displayHouse();

    @Override
    public void display() {
        for (House h : houseList) {
            System.out.println(h);
        }
    }

    @Override
    public void addHouse() {
        System.out.println("Nhập tên dịch vụ");
        String name = sc.nextLine();
        double acreage = CheckTrueOfFalse.checkAcreage();
        double expense = CheckTrueOfFalse.checkExpense();
        int sumPeople = CheckTrueOfFalse.checkPeople();
        String rentalType = CheckTrueOfFalse.checkRentalType();
        String standard = CheckTrueOfFalse.checkStandard();
        int number = CheckTrueOfFalse.checkNumberOfFloors();
//  Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê, Tiêu chuẩn phòng,Số tầng.
        House house = new House(name, acreage, expense, sumPeople, rentalType, standard,number);
        houseList.add(house);
        iHouseRepo.addHouse(house);
    }
}
