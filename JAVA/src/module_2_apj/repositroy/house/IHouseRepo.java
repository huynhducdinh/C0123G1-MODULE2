package module_2_apj.repositroy.house;

import module_2_apj.molel.furama.House;

import java.util.List;

public interface IHouseRepo {
    List<House> displayHouse();
    void addHouse(House house);

}
