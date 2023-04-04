package module_2_apj.repositroy.room;

import module_2_apj.molel.furama.Room;
import module_2_apj.molel.furama.Villa;
import module_2_apj.util.read_file.RoomReadFile;

import module_2_apj.util.read_file.VillaReadFile;
import module_2_apj.util.wrtie_file.RoomWriteFile;
import module_2_apj.util.wrtie_file.VillaWriteFile;

import java.util.Map;

public class RoomRepo implements IRoomRepo {
    static Map<Room,Integer> roomIntegerMap = RoomReadFile.roomReadFile();

    public static void writeFileVilla(Map<Room,Integer> integerMap) {
        RoomWriteFile.roomWriteFile(integerMap);
    }

    @Override
    public Map<Room,Integer> getDisplayRom() {
        return roomIntegerMap;
    }

    @Override
    public void addRom(Map<Room, Integer> roomIntegerMap) {
        writeFileVilla(roomIntegerMap);
    }



}
