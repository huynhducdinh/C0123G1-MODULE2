package module_2_apj.repositroy.villa;

import module_2_apj.molel.furama.Villa;

import java.util.List;

public interface IVillaRepo {
    List<Villa> getAllDisplay();
    void add(Villa villa1);
}
