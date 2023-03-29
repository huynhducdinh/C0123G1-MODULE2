package module_2_apj.repositroy.hopdongthue;

import module_2_apj.molel.bookingorcontract.Contract;

import java.util.List;

public interface IIHopDongThueRepo {
    List<Contract> getAllDisplay();
    void add(Contract hopDongThue3);
    void update(Contract hopDongThue4);
}
