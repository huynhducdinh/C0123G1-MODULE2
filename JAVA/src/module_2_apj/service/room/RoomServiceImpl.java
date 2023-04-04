package module_2_apj.service.room;

import module_2_apj.method.CheckTrueOfFalse;
import module_2_apj.molel.furama.House;
import module_2_apj.molel.furama.Room;
import module_2_apj.repositroy.room.IRoomRepo;
import module_2_apj.repositroy.room.RoomRepo;
import module_2_apj.util.wrtie_file.RoomWriteFile;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RoomServiceImpl implements IRoomService {
    static IRoomRepo iroomRepo = new RoomRepo();
    static Map<Room, Integer> roomList = iroomRepo.getDisplayRom();

    @Override

    public void display() {
        if (roomList.size() == 0) {
            System.out.println("There's nothing in this list");

        } else {
            for (Map.Entry<Room, Integer> entry : roomList.entrySet()) {
                System.out.println(entry.getKey() + ":|:" + entry.getValue());
            }
        }
    }
    @Override
    public void addRoom() {
        String id = CheckTrueOfFalse.checkCodeRo();
        String name = CheckTrueOfFalse.checkNameService();
        double acreage = CheckTrueOfFalse.checkAcreage();
        double expense = CheckTrueOfFalse.checkExpense();
        int sumPeople = CheckTrueOfFalse.checkPeople();
        String rentalType = CheckTrueOfFalse.checkLeases();
        String rooms = CheckTrueOfFalse.checkServiceName();
//        Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê, dịch vụ riêng
        Room room = new Room(id, name, acreage, expense, sumPeople, rentalType, rooms);
        roomList.put(room, 0);
        iroomRepo.addRom(roomList);
    }

    @Override
    public boolean checkServiceNumberForBooking(String serviceNum) {
        Set<Room> roomSet = roomList.keySet();
        for (Room room : roomSet) {
            if (room.getCodeService().equals(serviceNum)) return true;
        }
        return false;
    }

    @Override
    public void updateTimesOfUsingService(String serviceNum) {
        Set<Room> roomSet = roomList.keySet();
        Room updateRoom = null;
        for (Room room : roomSet) {
            if (room.getCodeService().equals(serviceNum)) {
                updateRoom = room;
                break;
            }
        }
        int usingTimes = roomList.get(updateRoom);
        roomList.put(updateRoom, usingTimes + 1);
        RoomWriteFile.roomWriteFile(roomList);
    }


}
