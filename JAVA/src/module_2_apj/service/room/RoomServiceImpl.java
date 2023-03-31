package module_2_apj.service.room;

import module_2_apj.method.CheckTrueOfFalse;
import module_2_apj.molel.furama.Room;
import module_2_apj.repositroy.room.IRoomRepo;
import module_2_apj.repositroy.room.RoomRepo;

import java.util.List;
import java.util.Scanner;

public class RoomServiceImpl implements IRoomService {
    static Scanner sc = new Scanner(System.in);
    static IRoomRepo iroomRepo = new RoomRepo();
    static List<Room> roomList = iroomRepo.getDisplayRom();

    @Override
    public void display() {
        for (Room r : roomList) {
            System.out.println(r);
        }
    }

    @Override
    public void addRoom() {
        System.out.println("Nhập tên dịch vụ");
        String name = sc.nextLine();
        double acreage = CheckTrueOfFalse.checkAcreage();
        double expense = CheckTrueOfFalse.checkExpense();
        int sumPeople = CheckTrueOfFalse.checkPeople();
        String rentalType = CheckTrueOfFalse.checkRentalType();
        System.out.println("Nhập các dịch vụ riêng");
        String rooms = sc.nextLine();
//        Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê, dịch vụ riêng
        Room room = new Room(name, acreage, expense, sumPeople, rentalType, rooms);
        roomList.add(room);
        iroomRepo.addRom(room);
    }
}
