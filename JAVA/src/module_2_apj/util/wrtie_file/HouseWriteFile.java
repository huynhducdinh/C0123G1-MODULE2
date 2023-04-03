package module_2_apj.util.wrtie_file;

import module_2_apj.molel.furama.House;

import java.io.*;
import java.util.List;
import java.util.Map;

public class HouseWriteFile {
    private static final String HOUSE_LIST_PATH = "src\\module_2_apj\\data\\house.csv";

    public static void houseWriteFile(Map<House,Integer> houseList) {
        File file = new File(HOUSE_LIST_PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<House,Integer>entry:houseList.entrySet()) {
                bufferedWriter.write(entry.getKey().convertLine6()+","+entry.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
