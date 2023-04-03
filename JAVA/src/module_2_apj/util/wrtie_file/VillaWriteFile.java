package module_2_apj.util.wrtie_file;

import module_2_apj.molel.furama.Villa;

import java.io.*;
import java.util.List;
import java.util.Map;

public class VillaWriteFile {
    private static  final String VILLA_LIST_PATH="src\\module_2_apj\\data\\villa.csv";
    public static void writeFileVilla(Map<Villa,Integer> villaList){
        File file=new File(VILLA_LIST_PATH);
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter=new FileWriter(file);
            bufferedWriter =new BufferedWriter(fileWriter);
            for (Map.Entry<Villa,Integer>entry:villaList.entrySet()) {
                bufferedWriter.write(entry.getKey().convertLine4()+","+entry.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
