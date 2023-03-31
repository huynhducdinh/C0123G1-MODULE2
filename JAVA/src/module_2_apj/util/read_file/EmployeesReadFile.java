package module_2_apj.util.read_file;

import module_2_apj.molel.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeesReadFile {
    public static List<Employee> readEmployee(String path) {
        List<Employee> employeeListRead = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
//        Phương thức exists() của lớp File được sử dụng để check file có tồn tại không
        if (file.exists()) {
            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line = null;
                Employee employee;
                String[] arr;
                while ((line = bufferedReader.readLine()) != null) {
                    arr = line.split(",");
//                    String name, String gender, int codee, int birday, int sdt, int cmnd, String email, String qualification, String position, String salary
                    employee = new Employee(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], Double.parseDouble(arr[9]));
                    employeeListRead.add(employee);
                }
                bufferedReader.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return employeeListRead;
    }
}
