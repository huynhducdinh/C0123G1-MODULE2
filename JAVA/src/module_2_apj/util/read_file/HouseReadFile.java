package module_2_apj.util.read_file;

import module_2_apj.molel.furama.House;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HouseReadFile {
    private static final String HOUSE_LIST_PATH = "src\\module_2_apj\\data\\house.csv";

    public static List<House> houseReadFile() {
        List<House> houseList = new ArrayList<>();
        File file = new File(HOUSE_LIST_PATH);
        FileReader fileReader = null;
        if (file.exists()) {
            try {
                fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = null;
                String[] arr;
                while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                    arr = line.split(",");
                    House house = new House(arr[0], Double.parseDouble(arr[1]), Double.parseDouble(arr[2]),Integer.parseInt(arr[3]), arr[4], arr[5], Integer.parseInt(arr[6]));
                    houseList.add(house);
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