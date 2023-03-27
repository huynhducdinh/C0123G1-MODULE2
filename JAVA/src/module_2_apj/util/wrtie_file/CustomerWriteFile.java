package module_2_apj.util.wrtie_file;

import module_2_apj.molel.person.Customer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CustomerWriteFile {
    public static void customerWrite(String path, List<Customer>customerList){
        File file=new File(path);
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter=new FileWriter(file);
            bufferedWriter=new BufferedWriter(fileWriter);
            String line =null;
            String []arr;
            for (Customer c:customerList) {
                bufferedWriter.write(c.convertLine1());
                bufferedWriter.newLine();

            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
           e.printStackTrace();
        }

    }
}
