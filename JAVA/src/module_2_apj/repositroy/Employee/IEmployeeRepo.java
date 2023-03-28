package module_2_apj.repositroy.Employee;

import module_2_apj.molel.person.Employee;

import java.util.List;

public interface IEmployeeRepo {
    List<Employee> getAllDisplay();


    void add(Employee employee);


    void update( List<Employee> employeeList2);


    void delete();

}
