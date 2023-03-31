package module_2_apj.service.facility;

import module_2_apj.service.IService;

public interface IFacilityService extends IService {

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
