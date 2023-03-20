package module_2_apj.service.facility;

import module_2_apj.service.ISevrice;

public interface IFacilityService extends ISevrice {

    @Override
    void display();

    @Override
    void add();

    @Override
    void update();

    @Override
    void delete();

    void displaymaintenance();
}
