package module_2_apj.repositroy.facility;

import module_2_apj.molel.furama.Facility;
import module_2_apj.molel.furama.House;
import module_2_apj.molel.furama.Room;
import module_2_apj.molel.furama.Villa;
import module_2_apj.util.read_file.FacilityReadFile;
import module_2_apj.util.read_file.HouseReadFile;
import module_2_apj.util.read_file.RoomReadFile;
import module_2_apj.util.read_file.VillaReadFile;
import module_2_apj.util.wrtie_file.FacilityWriteFile;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepo implements IFacilityRepo {
    public static final String FACILITY_LIST_PATH = "src\\module_2_apj\\data\\facility.csv";
    Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    public static void writeFile(List<Facility> facilities) {
        FacilityWriteFile.writeFacilityFile(facilities);
    }

    List<Facility> facilityList = FacilityReadFile.facilityList();

    @Override
    public List<Facility> getAllDisplay() {
        return facilityList;
    }

    @Override
    public void add() {


    }

    @Override
    public void update(List<Facility> facilities) {
        writeFile(facilities);
    }

    @Override
    public void delete() {
        facilityList.remove(new Facility());
    }

    @Override
    public Map<Facility, Integer> displaymaintenance() {
        return null;
    }
}