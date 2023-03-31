package module_2_apj.repositroy.room;

import module_2_apj.molel.furama.Room;
import module_2_apj.util.read_file.RoomReadFile;
import module_2_apj.util.wrtie_file.RoomWriteFile;

import java.util.List;
public class RoomRepo implements IRoomRepo {
    static List<Room> roomList = RoomReadFile.romReadList();

    public static void writeFileRoom(List<Room> roomList) {
        RoomWriteFile.roomWriteFile(roomList);
    }

    @Override
    public List<Room> getDisplayRom() {
        return roomList;
    }

    @Override
    public void addRom(Room room) {
        writeFileRoom(roomList);
    }
}
