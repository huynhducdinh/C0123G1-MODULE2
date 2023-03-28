package module_2_apj.util.wrtie_file;

import module_2_apj.molel.furama.Facility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FacilityWriteFile {
    public static void writeFacilityFile(String path, List<Facility> facilities) {
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = null;
            String[] arr;
            for (Facility f : facilities) {
                bufferedWriter.write(f.convertLine3());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
