package module_2_apj.repositroy.villa;

import module_2_apj.molel.furama.Villa;
import module_2_apj.util.read_file.VillaReadFile;
import module_2_apj.util.wrtie_file.VillaWriteFile;

import java.util.List;
import java.util.Map;

public class VillaRepo implements IVillaRepo {

    static Map<Villa,Integer> villaList = VillaReadFile.villaReadFile();

    public static void writeFileVilla(Map<Villa,Integer> villaList) {
        VillaWriteFile.writeFileVilla(villaList);
    }

    @Override
    public Map<Villa,Integer> getAllDisplay() {
        return villaList;
    }

    @Override
    public void addVilla(Map<Villa,Integer>villaIntegerMap) {
        writeFileVilla(villaIntegerMap);
    }
}
