package module_2_apj.repositroy.room;

import module_2_apj.molel.furama.Room;

import java.util.List;

public interface IRoomRepo {
    List<Room> getDisplayRom();
    void addRom(Room room);
}
