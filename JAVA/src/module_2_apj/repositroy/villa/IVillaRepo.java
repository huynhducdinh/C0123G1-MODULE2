package module_2_apj.repositroy.villa;

import module_2_apj.molel.furama.Villa;

import java.util.List;
import java.util.Map;

public interface IVillaRepo {
    Map<Villa,Integer> getAllDisplay();
    void addVilla(Map<Villa,Integer>villaIntegerMap);
}
