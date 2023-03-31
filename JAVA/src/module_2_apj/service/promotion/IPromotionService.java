package module_2_apj.service.promotion;

import module_2_apj.service.IService;

public interface IPromotionService extends IService {

    @Override
    void display();

    @Override
    void add();

    @Override
    void update();

    @Override
    void delete();
    void displayVoucher();
}
