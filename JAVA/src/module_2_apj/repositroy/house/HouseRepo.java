package module_2_apj.repositroy.house;

import module_2_apj.molel.furama.House;
import module_2_apj.util.read_file.HouseReadFile;
import module_2_apj.util.wrtie_file.HouseWriteFile;

import java.util.List;
import java.util.Scanner;

public class HouseRepo implements IHouseRepo {
    static List<House> houseList = HouseReadFile.houseReadFile();
    public static void writeFileHouse(List<House> houseList) {
        HouseWriteFile.houseWriteFile(houseList);
    }

    @Override
    public List<House> displayHouse() {
        return houseList;
    }

    @Override
    public void addHouse(House house) {
        writeFileHouse(houseList);
    }
}
