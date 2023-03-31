package module_2_apj.service.employee;

import module_2_apj.service.IService;

public interface IEmployessService extends IService {
    @Override
    void display();

    @Override
    void add();

    @Override
    void update();

    @Override
    void delete();

}
