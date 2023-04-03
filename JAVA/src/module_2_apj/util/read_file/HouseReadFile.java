package module_2_apj.util.read_file;

import module_2_apj.molel.furama.House;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HouseReadFile {
    private static final String HOUSE_LIST_PATH = "src\\module_2_apj\\data\\house.csv";

    public static Map<House,Integer> houseReadFile() {
        Map<House,Integer> houseList = new HashMap<>();
        File file = new File(HOUSE_LIST_PATH);
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
                    House house = new House(arr[0],arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]),Integer.parseInt(arr[4]), arr[5], arr[6],Integer.parseInt(arr[7]));
                   timesOfUsingValue=Integer.parseInt(arr[8]);
                    houseList.put(house,timesOfUsingValue);
                }
                bufferedReader.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return houseList;
    }
}