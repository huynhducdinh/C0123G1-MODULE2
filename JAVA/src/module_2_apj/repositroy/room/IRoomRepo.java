package module_2_apj.repositroy.room;

import module_2_apj.molel.furama.Room;

import java.util.Map;

public interface IRoomRepo {
    Map<Room, Integer> getDisplayRom();
    void addRom(Map<Room,Integer>roomIntegerMap);
}
