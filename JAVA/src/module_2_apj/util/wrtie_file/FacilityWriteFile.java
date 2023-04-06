package module_2_apj.util.wrtie_file;

import module_2_apj.molel.furama.Facility;
import module_2_apj.molel.furama.House;
import module_2_apj.molel.furama.Room;
import module_2_apj.molel.furama.Villa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityWriteFile {
    public static final String FACILITY_LIST_PATH = "src\\module_2_apj\\data\\facility.csv";
        public static void writeFacilityFile( List<Facility> facilities) {
            File file = new File(FACILITY_LIST_PATH);
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


