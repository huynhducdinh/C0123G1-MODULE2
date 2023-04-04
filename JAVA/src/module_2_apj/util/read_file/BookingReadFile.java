package module_2_apj.util.read_file;

import module_2_apj.molel.bookingorcontract.Booking;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class BookingReadFile {
    private static final String BOOKING_LIST_PATH = "src\\module_2_apj\\data\\booking.csv";

    public static Set<Booking> readBooking() {
        Set<Booking> booking3List = new TreeSet<>();
        File file = new File(BOOKING_LIST_PATH);
        FileReader fileReader = null;
        if (file.exists()) {
            try {
                fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = null;
                String[] arr;
                while ((line = bufferedReader.readLine()) != null) {
                    arr = line.split(",");
                    Booking booking3 = new Booking(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
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
