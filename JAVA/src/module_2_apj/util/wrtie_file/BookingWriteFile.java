package module_2_apj.util.wrtie_file;

import module_2_apj.molel.bookingorcontract.Booking3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BookingWriteFile {
    public static void bookingWrite(String path, List<Booking3> booking3List){
        File file=new File(path);
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter =new FileWriter(file);
            bufferedWriter=new BufferedWriter(fileWriter);
            for (Booking3 b:booking3List){
                bufferedWriter.write(b.convertLine3());
                bufferedWriter.newLine();
            }        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
