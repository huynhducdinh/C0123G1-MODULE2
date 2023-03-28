package module_2_apj.service.booking;

import module_2_apj.service.ISevrice;

public interface IBookingServive extends ISevrice {
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
