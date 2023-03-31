package module_2_apj.service.facility;


import module_2_apj.molel.furama.Facility;
import module_2_apj.molel.furama.House;
import module_2_apj.molel.furama.Room;
import module_2_apj.molel.furama.Villa;
import module_2_apj.repositroy.house.HouseRepo;
import module_2_apj.repositroy.house.IHouseRepo;
import module_2_apj.repositroy.room.IRoomRepo;
import module_2_apj.repositroy.room.RoomRepo;
import module_2_apj.repositroy.villa.IVillaRepo;
import module_2_apj.repositroy.villa.VillaRepo;
import module_2_apj.service.house.HouseServiceImpl;
import module_2_apj.service.house.IHouseService;
import module_2_apj.service.room.IRoomService;
import module_2_apj.service.room.RoomServiceImpl;
import module_2_apj.service.villa.IVillaService;
import module_2_apj.service.villa.VillaServiceImpl;
import module_2_apj.util.read_file.HouseReadFile;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    static Scanner sc = new Scanner(System.in);
    static IVillaRepo iVillaRepo = new VillaRepo();
    static IHouseRepo iHouseRepo = new HouseRepo();
    static IRoomRepo iRoomRepo = new RoomRepo();
    static IVillaService villaService = new VillaServiceImpl();
    static IHouseService houseService = new HouseServiceImpl();
    static IRoomService roomService = new RoomServiceImpl();
    static List<Villa> villaList = iVillaRepo.getAllDisplay();
    static List<Room> randomList = iRoomRepo.getDisplayRom();
    static List<House> houseList = iHouseRepo.displayHouse();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();


    public void display() {
        System.out.println("-++-Danh sách cơ sở của khách sạn-++-");
        for (Villa v : villaList) {
            System.out.println(v);
        }
        for (Room r : randomList) {
            System.out.println(r);
        }
        for (House h : houseList) {
            System.out.println(h);
        }
    }

    @Override
    public void add() {
        boolean check;
        do {
            check = true;
            System.out.println("Danh sách cơ sở khách sạn" +
                    "\n1. Villa" +
                    "\n2.Room" +
                    "\n3.House" +
                    "\n4.Quay lại");
            System.out.println("Chọn");
            int choss = Integer.parseInt(sc.nextLine());
            switch (choss) {
                case 1:
                    villaService.addVilla();
                    break;
                case 2:
                    roomService.addRoom();
                    break;
                case 3:
                    houseService.addHouse();
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

    }


}


