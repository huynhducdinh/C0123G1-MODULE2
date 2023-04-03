package module_2_apj.util.wrtie_file;

import module_2_apj.molel.bookingorcontract.Booking;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class BookingWriteFile {
    public static void bookingWrite(String path, Set<Booking> booking3List){
        File file=new File(path);
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter =new FileWriter(file);
            bufferedWriter=new BufferedWriter(fileWriter);
            for (Booking b:booking3List){
                bufferedWriter.write(b.convertLine3());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
