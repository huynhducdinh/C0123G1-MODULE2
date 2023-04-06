package module_2_apj.repositroy.facility;

import module_2_apj.molel.furama.Facility;

import java.util.List;
import java.util.Map;

public interface IFacilityRepo {
    List<Facility> getAllDisplay();


    void add();


    void update(List<Facility> facilities);


    void delete();

    Map<Facility, Integer> displaymaintenance() ;
}
