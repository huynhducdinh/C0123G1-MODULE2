package module_2_apj.service.villa;

import module_2_apj.method.CheckTrueOfFalse;
import module_2_apj.molel.furama.House;
import module_2_apj.molel.furama.Villa;
import module_2_apj.repositroy.villa.IVillaRepo;
import module_2_apj.repositroy.villa.VillaRepo;
import module_2_apj.service.facility.FacilityServiceImpl;
import module_2_apj.util.wrtie_file.VillaWriteFile;

import java.util.*;

public class VillaServiceImpl extends Villa implements IVillaService {
    static IVillaRepo villaRepo = new VillaRepo();
    static Map<Villa, Integer> villaList = villaRepo.getAllDisplay();
    static Scanner sc = new Scanner(System.in);

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
        System.out.println("Villa added-->| Thêm mới thành công-->");
    }


}
