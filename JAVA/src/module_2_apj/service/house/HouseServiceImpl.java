package module_2_apj.service.house;

import module_2_apj.method.CheckTrueOfFalse;
import module_2_apj.molel.furama.House;
import module_2_apj.repositroy.house.HouseRepo;
import module_2_apj.repositroy.house.IHouseRepo;
import module_2_apj.util.wrtie_file.HouseWriteFile;


import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HouseServiceImpl implements IHouseService {
    static IHouseRepo iHouseRepo = new HouseRepo();
    static Scanner sc = new Scanner(System.in);
    static Map<House, Integer> houseList = iHouseRepo.displayHouse();

    @Override

    public void display() {
        if (houseList.size() <= 0) {
            System.out.println("Empty list");
        } else {
            for (Map.Entry<House, Integer> entry : houseList.entrySet()) {
                System.out.println(entry.getKey()+":|:"+"Used "+entry.getValue());
            }
        }
    }

    @Override
    public void addHouse() {
        String id = CheckTrueOfFalse.checkCodeHo();
        String name = CheckTrueOfFalse.checkNameService();
        double acreage = CheckTrueOfFalse.checkAcreage();
        double expense = CheckTrueOfFalse.checkExpense();
        int sumPeople = CheckTrueOfFalse.checkPeople();
        String rentalType = CheckTrueOfFalse.checkLeases();
        String standard = CheckTrueOfFalse.checkStandard();
        int number = CheckTrueOfFalse.checkNumberOfFloors();
//  Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê, Tiêu chuẩn phòng,Số tầng.
        House house = new House(id,name, acreage, expense, sumPeople, rentalType,standard, number);
        houseList.put(house, 0);
        iHouseRepo.addHouse(houseList);
    }

    @Override
    public boolean checkServiceNumberForBooking(String serviceNum) {
        Set<House>houseSet=houseList.keySet();
        for (House house:houseSet){
            if (house.getCodeService().equals(serviceNum)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void updateTimesOfUsingService(String serviceNum) {
        Set<House>houseSet=houseList.keySet();
        House updateHouse=null;
        for (House house:houseSet){
            if (house.getCodeService().equals(serviceNum)){
                updateHouse=house;
                break;
            }
        }
    int usingTimes=houseList.get(updateHouse);
        houseList.put(updateHouse,usingTimes+1);
        HouseWriteFile.houseWriteFile(houseList);
    }
}
