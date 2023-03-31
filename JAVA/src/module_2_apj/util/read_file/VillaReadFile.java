package module_2_apj.util.read_file;

import module_2_apj.molel.furama.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VillaReadFile {
    private static final String VILLA_LIST_PATH = "src\\module_2_apj\\data\\villa.csv";

    public static List<Villa> villaReadFile() {
        List<Villa> villaList = new ArrayList<>();
        File file = new File(VILLA_LIST_PATH);
        FileReader fileReader = null;
        if (file.exists()) {
            try {
                fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = null;
                String[] arr;
                while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                    arr = line.split(",");
                    Villa villa = new Villa(arr[0], Double.parseDouble(arr[1]), Double.parseDouble(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], arr[6], arr[7]);
                    villaList.add(villa);
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
