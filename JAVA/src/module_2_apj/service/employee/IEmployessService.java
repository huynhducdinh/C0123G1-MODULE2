package module_2_apj.service.employee;

import module_2_apj.service.ISevrice;

public interface IEmployessService extends ISevrice {
    @Override
    void display();

    @Override
    void add();

    @Override
    void update();

    @Override
    void delete();

}
