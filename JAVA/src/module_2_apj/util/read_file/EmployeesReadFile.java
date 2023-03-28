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
                    employee = new Employee(arr[0], arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], arr[7], arr[8], arr[9]);
                    employeeListRead.add(employee);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return employeeListRead;
    }
}