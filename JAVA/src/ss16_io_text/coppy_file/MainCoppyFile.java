package ss16_io_text.coppy_file;

import java.util.List;

public class MainCoppyFile {
    public static void main(String[] args) {
        String path = "src\\ss16_io_text\\coppy_file\\text.txt";
        String pathFile = "src\\ss16_io_text\\coppy_file\\textfilename.txt";
        ReadAndWrite readAndWrite = new ReadAndWrite();
        List<String> stringList = readAndWrite.readFile(path);
        readAndWrite.writedFile(pathFile, stringList, true);
    }


}
