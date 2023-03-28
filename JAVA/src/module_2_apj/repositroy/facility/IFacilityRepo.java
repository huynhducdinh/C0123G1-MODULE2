package module_2_apj.repositroy.facility;

import module_2_apj.molel.furama.Facility;

import java.util.List;

public interface IFacilityRepo {
    List<Facility> getAllDisplay();


    void add(Facility facility);


    void update(List<Facility> facilities);


    void delete();

    void displaymaintenance() ;
}
