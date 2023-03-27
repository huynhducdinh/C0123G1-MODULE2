package ss17_io_byte.bai2.copy_file;

import java.io.*;

public class CoppyFile {
    public static String copyReadFile(String source) {
        File file = new File(source);
        FileInputStream fileInputStream = null;
        String str = "";
        try {
            fileInputStream = new FileInputStream(file);
            int i = -1;
            while ((i = fileInputStream.read()) != -1) {
                str += (char) i;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    public static void copyWriteFile(String path, String line) {
        File file = new File(path);
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bytes = line.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                fileOutputStream.write(bytes[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        String targetfile = "src/ss17_io_byte/bai2/copy_file/targetfile.dat";
        String sourcefile = "src/ss17_io_byte/bai2/copy_file/sourcefile.dat";
        String str = copyReadFile(targetfile);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        CoppyFile.copyWriteFile(sourcefile, str);
    }
}
