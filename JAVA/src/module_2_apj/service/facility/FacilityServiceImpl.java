package module_2_apj.service.facility;


import module_2_apj.molel.furama.Facility;
import module_2_apj.molel.furama.House;
import module_2_apj.molel.furama.Room;
import module_2_apj.molel.furama.Villa;
import module_2_apj.repositroy.facility.FacilityRepo;
import module_2_apj.repositroy.facility.IFacilityRepo;
import module_2_apj.repositroy.house.HouseRepo;
import module_2_apj.repositroy.house.IHouseRepo;
import module_2_apj.repositroy.villa.IVillaRepo;
import module_2_apj.repositroy.villa.VillaRepo;
import module_2_apj.service.house.HouseServiceImpl;
import module_2_apj.service.house.IHouseService;
import module_2_apj.service.room.IRoomService;
import module_2_apj.service.room.RoomServiceImpl;
import module_2_apj.service.villa.IVillaService;
import module_2_apj.service.villa.VillaServiceImpl;
import module_2_apj.util.read_file.HouseReadFile;
import module_2_apj.util.read_file.RoomReadFile;
import module_2_apj.util.read_file.VillaReadFile;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    static Scanner sc = new Scanner(System.in);
    IFacilityRepo iFacilityRepo = new FacilityRepo();
    static IVillaService villaService = new VillaServiceImpl();
    static IHouseService houseService = new HouseServiceImpl();
    static IRoomService roomService = new RoomServiceImpl();

    static Map<Facility,Integer>facilityIntegerMap=new LinkedHashMap<>();


    public void display() {
        System.out.println("-----------------++-List of hotel facilities-++----------------");
        System.out.println("-----------------Villa List-----------------");
        villaService.display();
        System.out.println("--------------------List of House------------------");
        houseService.display();
        System.out.println("--------------------List Room-------------------");
        roomService.display();
    }

    @Override
    public void add() {
        boolean check;
        try {
            do {
                check = true;
                System.out.println("List of hotel facilities" +
                        "\n1.Add New Villa" +
                        "\n2.Add New House" +
                        "\n3.Add New Room" +
                        "\n4.Back to menu");
                System.out.println("Select");
                int poss = Integer.parseInt(sc.nextLine());
                switch (poss) {
                    case 1:
                        villaService.addVilla();
                        break;
                    case 2:
                        houseService.addHouse();
                        break;
                    case 3:
                        roomService.addRoom();
                        break;
                    case 4:
                        check = false;
                        break;
                }
            } while (check);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {
    }


    public void displaymaintenance() {
        Map<Villa, Integer> villaIntegerMap = VillaReadFile.villaReadFile();
        Map<House, Integer> houseIntegerMap = HouseReadFile.houseReadFile();
        Map<Room, Integer> roomIntegerMap = RoomReadFile.roomReadFile();
        for (Map.Entry<Room, Integer> room : roomIntegerMap.entrySet()) {
            if (room.getValue() >= 5) {
                facilityIntegerMap.put(room.getKey(), room.getValue());
            }
        }
        for (Map.Entry<Villa,Integer>villa:villaIntegerMap.entrySet()){
            if (villa.getValue()>=5){
                facilityIntegerMap.put(villa.getKey(),villa.getValue());
            }
        }
        for (Map.Entry<House,Integer>house: houseIntegerMap.entrySet()){
            if (house.getValue()>=5){
                facilityIntegerMap.put(house.getKey(),house.getValue());
            }
        }
        if (facilityIntegerMap.isEmpty()){
            System.out.println("There is no service that needs maintenance--> Không có dịch vụ nào cần bảo trì");
        }else {
            System.out.print("List of Services which need maintenance:--> Dịch vụ cần bảo trì : --> "+facilityIntegerMap);

        }
    }
}


