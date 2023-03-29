package module_2_apj.service.promotion;

import module_2_apj.service.ISevrice;

public interface IPromotionService extends ISevrice {

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
