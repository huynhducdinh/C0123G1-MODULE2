package ss16_io_text.doc_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocFile {
    public static void main(String[] args) {
        String receive = "src\\ss16_io_text\\doc_file\\Nation.csv";
        List<NationClass> list = readFiles(receive);
        for (NationClass x : list) {
            System.out.println(x.getInfoToCsv());
        }
    }

    public static List<NationClass> readFiles(String receive) {
        List<NationClass> stringList = new ArrayList<>();
        File file = new File(receive);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                stringList.add(new NationClass(Integer.parseInt(str[0]), str[1], str[2]));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return stringList;
    }
}
