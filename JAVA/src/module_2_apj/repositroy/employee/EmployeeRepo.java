package module_2_apj.repositroy.employee;

import module_2_apj.molel.person.Employee;
import module_2_apj.util.read_file.EmployeesReadFile;
import module_2_apj.util.wrtie_file.EmployeesWriteFile;

import java.util.List;

public class EmployeeRepo implements IEmployeeRepo {
    private final String EMPLOYEE_LIST_PATH = "src\\module_2_apj\\data\\employee.csv";
    List<Employee> employeeList = EmployeesReadFile.readEmployee(EMPLOYEE_LIST_PATH);


    private void writeFile(List<Employee> employeeList) {
        EmployeesWriteFile.writeFile(EMPLOYEE_LIST_PATH, employeeList);
    }

    @Override
    public List<Employee> getAllDisplay() {
        return employeeList;
    }

    @Override
    public void add(Employee employee) {
       employeeList.add(employee);
        writeFile(employeeList);
    }

    @Override
    public void update(List<Employee> employeeList2) {
        writeFile(employeeList2);
    }

    @Override
    public void delete() {
        employeeList.remove(new Employee());
    }
}
