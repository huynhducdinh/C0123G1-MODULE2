package module_2_apj.repositroy.contract;

import module_2_apj.molel.bookingorcontract.Contract;

import java.util.List;

public interface IContract {
    List<Contract> getAllDisplay();
    void add(Contract hopDongThue3);
    void update(Contract hopDongThue4);
}
