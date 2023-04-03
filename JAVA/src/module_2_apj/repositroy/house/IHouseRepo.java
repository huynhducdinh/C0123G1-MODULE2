package module_2_apj.repositroy.house;

import module_2_apj.molel.furama.House;
import module_2_apj.molel.furama.Room;

import java.util.List;
import java.util.Map;

public interface IHouseRepo {
    Map<House, Integer> displayHouse();

    void addHouse(Map<House, Integer> houseIntegerMap);

}
