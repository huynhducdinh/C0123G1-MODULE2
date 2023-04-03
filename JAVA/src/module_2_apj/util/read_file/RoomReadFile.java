package module_2_apj.util.read_file;

import module_2_apj.molel.furama.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomReadFile {
    private static final String ROOM_LEST_PATH = "src\\module_2_apj\\data\\room.csv";

    public static Map<Room, Integer> read() {
        Map<Room, Integer> roomList = new HashMap<>();
        File file = new File(ROOM_LEST_PATH);
        BufferedReader bufferedReader = null;

        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                Room room;
                int timesOfUsingValue;
                String line = "";
                String[] arr;
                while ((line = bufferedReader.readLine()) != null&&line.equals("")) {
                    arr = line.split(",");
                    room = new Room(arr[0], Double.parseDouble(arr[1]), Double.parseDouble(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], Integer.parseInt(arr[6]));
                    timesOfUsingValue=Integer.parseInt(arr[7]);
                    roomList.put(room, timesOfUsingValue);

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
