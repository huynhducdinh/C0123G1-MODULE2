package module_2_apj.service.employee;

import module_2_apj.molel.person.Employee;
import module_2_apj.repositroy.employee.EmployeeRepo;
import module_2_apj.repositroy.employee.IEmployeeRepo;
import module_2_apj.method.CheckTrueOfFalse;

import java.util.*;

public class EmployeeServiceIml implements IEmployessService {
    static Scanner sc = new Scanner(System.in);
    static IEmployeeRepo employeeRepo = new EmployeeRepo();
    static List<Employee> employeeList = employeeRepo.getAllDisplay();

    @Override
    public void display() {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        String name = CheckTrueOfFalse.checkName();
        String gender = CheckTrueOfFalse.checkGender();
        String id = CheckTrueOfFalse.inputId();
        String brith = CheckTrueOfFalse.checkBrith();
        String phone = CheckTrueOfFalse.checkNumberPhone();
        String citizen = CheckTrueOfFalse.checkCitizen();
        String email = CheckTrueOfFalse.checkEmail();
        String level = CheckTrueOfFalse.level();
        String location = CheckTrueOfFalse.location();
        double wage = CheckTrueOfFalse.checkWage();
        Employee employee = (new Employee(name, gender, id, brith, phone, citizen, email, level, location, wage));
        employeeRepo.add(employee);
        System.out.println("Successfully added new");
    }


    @Override
    public void update() {
        boolean flag;
        String customerCodeSearch = "";
        System.out.println("Look for the code to edit");
        do {
            flag = false;
            customerCodeSearch=sc.nextLine();
            if (checkCode(customerCodeSearch)){
                flag=true;
                System.out.println("Employee ID already in the list|Start modifying employee ");
            }else {
                System.out.println("Employee code does not exist |Please re-enter");
            }

        } while (!flag);
        String name = CheckTrueOfFalse.checkName();
        String gender = CheckTrueOfFalse.checkGender();
        String brith = CheckTrueOfFalse.checkBrith();
        String phone = CheckTrueOfFalse.checkNumberPhone();
        String citizen = CheckTrueOfFalse.checkCitizen();
        String email = CheckTrueOfFalse.checkEmail();
        String level = CheckTrueOfFalse.level();
        String location = CheckTrueOfFalse.location();
        double wage = CheckTrueOfFalse.checkWage();
        Employee employee = new Employee(name, gender, customerCodeSearch, brith, phone, citizen, email, level, location, wage);
        for (int i = 0; i < employeeList.size(); i++) {
            if (Objects.equals(employeeList.get(i).getCodee(),customerCodeSearch)) {
                employeeList.set(i, employee);
                employeeRepo.update(employeeList);
                break;
            }
        }
        System.out.println("Update successful");
    }

    @Override
    public void delete() {
        List<Employee> employeeList4 = employeeRepo.getAllDisplay();
        System.out.println("Enter code to delete:");
        String code = sc.nextLine();
        for (int i = 0; i < employeeList4.size(); i++) {
            if (employeeList4.get(i).getCodee() == code) {
                System.out.println("Do you want to delete the Code?" + code + " \n" +
                        "this is not  " +
                        "\n 1. Have" +
                        "\n 2. No");
                System.out.println("\n" +
                        "Select function");
                int choss = Integer.parseInt(sc.nextLine());
                switch (choss) {
                    case 1:
                        employeeList4.remove(employeeList4.get(i));
                        System.out.println("\n" +
                                "You successfully deleted");
                        break;
                    case 2:
                        System.out.println("You didn't delete");
                        break;
                }
                return;
            }
        }
        System.out.println("Student ID not found");
    }

    public static boolean checkCode(String id) {

        int count = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            if (Objects.equals(employeeList.get(i).getCodee(), id)) {
                count++;
            }
        }
        if (count != 0) {
            return true;
        } else {
            return false;
        }
    }
}
