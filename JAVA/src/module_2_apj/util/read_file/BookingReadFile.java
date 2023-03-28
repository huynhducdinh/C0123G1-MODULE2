package module_2_apj.util.read_file;

import module_2_apj.molel.bookingorcontract.Booking3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookingReadFile {
    public static List<Booking3> booking3List(String path) {
        List<Booking3> booking3List = new ArrayList<>();
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
                    Booking3 booking3 = new Booking3(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
                    booking3List.add(booking3);
                }
                bufferedReader.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return booking3List;
    }

}
