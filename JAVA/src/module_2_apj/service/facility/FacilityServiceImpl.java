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
import module_2_apj.util.read_file.RoomReadFile;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    static Scanner sc = new Scanner(System.in);
    static IVillaService villaService = new VillaServiceImpl();
    static IHouseService houseService = new HouseServiceImpl();
    static IRoomService roomService = new RoomServiceImpl();

    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();


    public void display() {
        System.out.println("-++-List of hotel facilities-++-");
        System.out.println("-++-Villa List-++-");
        villaService.display();
        System.out.println("-++-List of House-++-");
        houseService.display();
        System.out.println("-++-List Room-++-");
        roomService.display();
    }

    @Override
    public void add() {
        boolean check;
        do {
            check = true;
            System.out.println("List of hotel facilities" +
                    "\n1.Add New Villa" +
                    "\n2.Add New House" +
                    "\n3.Add New Room" +
                    "\n4.Back to menu");
            System.out.println("Select");
            int choss = Integer.parseInt(sc.nextLine());
            switch (choss) {
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
    }

    @Override
    public void update() {
    }

    @Override
    public void delete() {
    }


    public void displaymaintenance() {
        Set<Facility> facilitySet = facilityIntegerMap.keySet();
        for (Facility f : facilitySet) {
            if (facilityIntegerMap.get(f) >= 5) {
                System.out.println(f + "USED" + facilityIntegerMap.get(f) + "times" + "Needs maintenance");
            }
        }
//        Map<Room,Integer>roomIntegerMap= RoomReadFile.read();
//        for(Map.Entry<Room,Integer> room:roomIntegerMap.entrySet()){
//            if (room.getValue()>=5){
//                facilityIntegerMap.put(room.getKey(),room.getValue());
//            }
//        }
    }


}


