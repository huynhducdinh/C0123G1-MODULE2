package module_2_apj.repositroy.facility;

import module_2_apj.molel.furama.Facility;
import module_2_apj.util.read_file.FacilityReadFile;
import module_2_apj.util.wrtie_file.FacilityWriteFile;

import java.util.List;

public class FacilityRepo implements IFacilityRepo {
    public static final String FACILITY_LIST_PATH = "src\\module_2_apj\\data\\facility.csv";

    public static void writeFlie(List<Facility> facilities) {
        FacilityWriteFile.writeFacilityFile(FACILITY_LIST_PATH, facilities);
    }

    @Override
    public List<Facility> getAllDisplay() {
        List<Facility> facilityList = FacilityReadFile.facilityList(FACILITY_LIST_PATH);
        return facilityList;
    }

    @Override
    public void add(Facility facility) {
        List<Facility> facilityList = FacilityReadFile.facilityList(FACILITY_LIST_PATH);
        facilityList.add(facility);
        writeFlie(facilityList);
    }

    @Override
    public void update(List<Facility> facilities) {
        writeFlie(facilities);
    }

    @Override
    public void delete() {
        List<Facility> facilityList = FacilityReadFile.facilityList(FACILITY_LIST_PATH);
        facilityList.remove(new Facility());
    }

    @Override
    public void displaymaintenance() {

    }

