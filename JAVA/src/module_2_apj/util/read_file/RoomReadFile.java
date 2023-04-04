package module_2_apj.util.read_file;

import module_2_apj.molel.furama.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomReadFile {
    private static final String ROOM_LEST_PATH = "src\\module_2_apj\\data\\room.csv";

    public static Map<Room, Integer> roomReadFile() {
        Map<Room, Integer> roomList = new HashMap<>();
        File file = new File(ROOM_LEST_PATH);
        BufferedReader bufferedReader = null;

        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));

                int timesOfUsingValue;
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] arr = line.split(",");
                    Room  room = new Room(arr[0], arr[1], Double.parseDouble(arr[2]),Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6]);
                    timesOfUsingValue = Integer.parseInt(arr[7]);
                    roomList.put(room,timesOfUsingValue);

                }
                bufferedReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return roomList;
    }
}
