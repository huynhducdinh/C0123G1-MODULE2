package module_2_apj.repositroy.villa;

import module_2_apj.molel.furama.Villa;
import module_2_apj.util.read_file.VillaReadFile;
import module_2_apj.util.wrtie_file.VillaWriteFile;

import java.util.List;

public class VillaRepo implements IVillaRepo {

    static List<Villa> villaList = VillaReadFile.villaReadFile();

    public static void writeFileVilla(List<Villa> villaList) {
        VillaWriteFile.writeFileVilla(villaList);
    }

    @Override
    public List<Villa> getAllDisplay() {
        return villaList;
    }

    @Override
    public void addVilla(Villa villa1) {
        writeFileVilla(villaList);
    }
}
