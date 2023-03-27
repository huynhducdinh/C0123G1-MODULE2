package module_2_apj.util.wrtie_file;

import module_2_apj.molel.person.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EmployeesWriteFile {
    public static void writeFile(String path, List<Employee> employeeList) {
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee e : employeeList) {
                bufferedWriter.write(e.convertLine());
                bufferedWriter.newLine();
                bufferedWriter.flush();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
