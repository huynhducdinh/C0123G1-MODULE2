package module_2_apj.util.wrtie_file;

import module_2_apj.molel.furama.Room;
import java.io.*;
import java.util.List;
public class RoomWriteFile {

    private static final String ROOM_LIST_PATH="src\\module_2_apj\\data\\room.csv";
    public static void roomWriteFile(List<Room>roomList){
        File file=new File(ROOM_LIST_PATH);
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter=new FileWriter(file);
            bufferedWriter =new BufferedWriter(fileWriter);
            for (Room r:roomList){
                bufferedWriter.write(r.convertLin5());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
