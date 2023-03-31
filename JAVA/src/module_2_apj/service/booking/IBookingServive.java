package module_2_apj.service.booking;

import module_2_apj.service.IService;

public interface IBookingServive extends IService {
    @Override
    void display();

    @Override
    void add();

    @Override
    void update();

    @Override
    void delete();
    void displayContract();
    void addContract();

}
