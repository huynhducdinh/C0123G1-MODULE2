package module_2_apj.util.read_file;

import module_2_apj.molel.furama.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VillaReadFile {
    private static final String VILLA_LIST_PATH = "src\\module_2_apj\\data\\villa.csv";

    public static Map<Villa,Integer> villaReadFile() {
      Map<Villa,Integer> villaList = new HashMap<>();
        File file = new File(VILLA_LIST_PATH);
        FileReader fileReader = null;
        if (file.exists()) {
            try {
                fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = null;
                String[] arr;
                int timesOfUsingValue;
                while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                    arr = line.split(",");
                    Villa villa = new Villa(arr[0],arr[1], Double.parseDouble(arr[2]),Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6], Double.parseDouble(arr[7]), Integer.parseInt(arr[8]));
                    timesOfUsingValue=Integer.parseInt(arr[9]);
                    villaList.put(villa,timesOfUsingValue);
                }
                bufferedReader.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return villaList;
    }
}
