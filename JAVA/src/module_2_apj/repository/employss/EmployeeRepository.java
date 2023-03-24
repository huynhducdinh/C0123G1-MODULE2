package module_2_apj.repository.employss;

import module_2_apj.molel.person.ComparatorEmployee;
import module_2_apj.molel.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EmployeeRepository implements IEmployeeRpository {
    static ArrayList<Employee> employees = new ArrayList<>();
    private static final String EMPLOYEE_LIST_PATH = "src\\module_2_apj\\data/Booking.txt";

    @Override
    public void display() {
        File file = new File(EMPLOYEE_LIST_PATH);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            Employee employee = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
//                 public Employee(String name, String gender, int codee, int birday, int sdt, int cmnd, String email, String qualification, String position, String salary)
                employee = new Employee(strings[0], strings[1], Integer.parseInt(strings[3]), Integer.parseInt(strings[4]), Integer.parseInt(strings[5]), Integer.parseInt(strings[6]), strings[7], strings[8], strings[9], strings[10]);
                employees.add(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Employee e : employees) {
            System.out.println(e);
        }


    }

    @Override
    public void add() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
