package module_2_apj.repositroy.Employee;

import module_2_apj.molel.person.Employee;
import module_2_apj.util.read_file.EmployeesReadFile;
import module_2_apj.util.wrtie_file.EmployeesWriteFile;

import java.util.List;

public class EmployeeRepo implements IEmployeeRepo {
    private final String EMPLOYEE_LIST_PATH = "src\\module_2_apj\\data\\employee.csv";

    private void writeFile(List<Employee> employeeList) {
        EmployeesWriteFile.writeFile(EMPLOYEE_LIST_PATH, employeeList);
    }

    @Override
    public List<Employee> getAllDisplay() {
        List<Employee> employeeList1 = EmployeesReadFile.readEmployee(EMPLOYEE_LIST_PATH);
        return employeeList1;
    }

    @Override
    public void add(Employee employee) {
        List<Employee> employeeList2 = EmployeesReadFile.readEmployee(EMPLOYEE_LIST_PATH);
        employeeList2.add(employee);
        writeFile(employeeList2);
    }

    @Override
    public void update(List<Employee> employeeList2) {
        writeFile(employeeList2);
    }

    @Override
    public void delete() {
        List<Employee> employeeList4 = EmployeesReadFile.readEmployee(EMPLOYEE_LIST_PATH);
        employeeList4.remove(new Employee());
    }
}
