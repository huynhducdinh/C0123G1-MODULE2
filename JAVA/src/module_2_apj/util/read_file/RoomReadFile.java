package module_2_apj.util.read_file;

import module_2_apj.molel.furama.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RoomReadFile {
    private static final String ROOM_LEST_PATH = "src\\module_2_apj\\data\\room.csv";

    public static List<Room> romReadList() {
        List<Room> roomList = new ArrayList<>();
        File file = new File(ROOM_LEST_PATH);
        FileReader fileReader = null;
        if (file.exists()) {
            try {
                fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = null;
                String[] arr;
                while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                    arr = line.split(",");
                    Room room = new Room(arr[0], Double.parseDouble(arr[1]), Double.parseDouble(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5]);
                    roomList.add(room);
                }
                bufferedReader.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return roomList;
    }
}
