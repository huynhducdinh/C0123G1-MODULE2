package module_2_apj.repositroy.room;

import module_2_apj.molel.furama.Room;
import module_2_apj.util.read_file.RoomReadFile;

import module_2_apj.util.wrtie_file.RoomWriteFile;

import java.util.Map;

public class RoomRepo implements IRoomRepo {
    static Map<Room, Integer> roomList = RoomReadFile.read();

    public static void writeFileRoom(Map<Room, Integer> roomIntegerMap) {
        RoomWriteFile.roomWriteFile(roomIntegerMap);
    }

    @Override
    public Map<Room, Integer> getDisplayRom() {
        return roomList;
    }

    @Override
    public void addRom(Map<Room, Integer> roomIntegerMap) {
        writeFileRoom(roomIntegerMap);
    }


}
