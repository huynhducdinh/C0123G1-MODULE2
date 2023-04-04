package module_2_apj.service.villa;

import module_2_apj.method.CheckTrueOfFalse;
import module_2_apj.molel.furama.House;
import module_2_apj.molel.furama.Villa;
import module_2_apj.repositroy.villa.IVillaRepo;
import module_2_apj.repositroy.villa.VillaRepo;
import module_2_apj.service.facility.FacilityServiceImpl;
import module_2_apj.util.wrtie_file.VillaWriteFile;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class VillaServiceImpl extends Villa implements IVillaService {
    static IVillaRepo villaRepo = new VillaRepo();
    static Map<Villa, Integer> villaList = villaRepo.getAllDisplay();
    static Scanner sc = new Scanner(System.in);
    FacilityServiceImpl facilityService = new FacilityServiceImpl();

    @Override
    public void display() {
        if (villaList.size() == 0) {
            System.out.println("There's nothing in this list");
        } else {
            for (Map.Entry<Villa, Integer> entry : villaList.entrySet()) {
                System.out.println(entry.getKey() + ":|:" + entry.getValue());
            }
        }
    }
    @Override
    public void addVilla() {
        String id = CheckTrueOfFalse.checkCodeVl();
        String name = CheckTrueOfFalse.checkNameService();
        double acreage = CheckTrueOfFalse.checkAcreage();
        double expense = CheckTrueOfFalse.checkExpense();
        int sumPeople = CheckTrueOfFalse.checkPeople();
        String rentalType = CheckTrueOfFalse.checkLeases();
        String standard = CheckTrueOfFalse.checkStandard();
        double acreages = CheckTrueOfFalse.checkAcreage();
        int number = CheckTrueOfFalse.checkNumberOfFloors();
//  Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê, Tiêu chuẩn phòng,Số tầng.
        Villa villa = new Villa(id, name, acreage, expense, sumPeople, rentalType, standard, acreages, number);
        villaList.put(villa,0);
        villaRepo.addVilla(villaList);
    }

    @Override
    public boolean checkServiceNumberForBooking(String serviceNum) {
        Set<Villa> villaSet=villaList.keySet();
       for (Villa villa:villaSet){
           if (villa.getCodeService().equals(serviceNum)){
               return true;
           }
       }
        return false;
    }

    @Override
    public void updateTimesOfUsingService(String serviceNum) {
        Set<Villa> villaSet=villaList.keySet();
        Villa updateVilaa=null;
        for(Villa villa:villaSet){
            if (villa.getCodeService().equals(serviceNum)){
                updateVilaa=villa;
                break;
            }
        }
        int usingTimes=villaList.get(updateVilaa);
            villaList.put(updateVilaa,usingTimes+1);
            VillaWriteFile.writeFileVilla(villaList);

    }
}
