package module_2_apj.repositroy.house;

import module_2_apj.molel.furama.House;
import module_2_apj.molel.furama.Room;
import module_2_apj.util.read_file.HouseReadFile;
import module_2_apj.util.wrtie_file.HouseWriteFile;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HouseRepo implements IHouseRepo {
    static Map<House,Integer> houseList = HouseReadFile.houseReadFile();
    public static void writeFileHouse(Map<House,Integer> houseList) {
        HouseWriteFile.houseWriteFile(houseList);
    }

    @Override
    public Map<House,Integer> displayHouse() {
        return houseList;
    }

    @Override
    public void addHouse(Map<House, Integer> houseIntegerMap) {
        writeFileHouse(houseIntegerMap);
    }


}
