package module_2_apj.util.read_file;

import module_2_apj.molel.furama.Facility;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FacilityReadFile {
    public static List<Facility> facilityList(String path) {
        List<Facility> facilities = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader = null;
        if (file.exists()) {
            try {
                fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = null;
                String[] arr;
                while ((line = bufferedReader.readLine()) != null) {
                    arr = line.split(",");
                    Facility facility = new Facility(arr[0], Double.parseDouble(arr[1]), Double.parseDouble(arr[2]), Integer.parseInt(arr[3]), arr[4]);
                    facilities.add(facility);
                }
                bufferedReader.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return facilities;
    }
}
