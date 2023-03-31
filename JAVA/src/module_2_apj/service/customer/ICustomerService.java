package module_2_apj.service.customer;

import module_2_apj.service.IService;

public interface ICustomerService extends IService {
    @Override
    void display();

    @Override
    void add();

    @Override
    void update();

    @Override
    void delete();
}
