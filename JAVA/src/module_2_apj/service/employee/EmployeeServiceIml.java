package module_2_apj.service.employee;

import module_2_apj.molel.person.Employee;
import module_2_apj.repositroy.employee.EmployeeRepo;
import module_2_apj.repositroy.employee.IEmployeeRepo;
import module_2_apj.method.CheckTrueOfFalse;

import java.util.*;

public class EmployeeServiceIml implements IEmployessService {
    static Scanner sc = new Scanner(System.in);
    static IEmployeeRepo employeeRepo = new EmployeeRepo();
    List<Employee> employeeList3 = employeeRepo.getAllDisplay();

    @Override
    public void display() {
        for (Employee e : employeeList3) {
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
    }


    @Override
    public void update() {
        System.out.println("Nội dung chỉnh sửa nhân viên");
        System.out.println("nhập mã cần sửa :");
        String codee = sc.nextLine();
        for (int i = 0; i < employeeList3.size(); i++) {
            if (employeeList3.get(i).getCodee() == codee) {
                String name = CheckTrueOfFalse.checkName();
                String gender = CheckTrueOfFalse.checkGender();
                String brith = CheckTrueOfFalse.checkBrith();
                String phone = CheckTrueOfFalse.checkNumberPhone();
                String citizen = CheckTrueOfFalse.checkCitizen();
                String email = CheckTrueOfFalse.checkEmail();
                String level = CheckTrueOfFalse.level();
                String location = CheckTrueOfFalse.location();
                double wage = CheckTrueOfFalse.checkWage();
                employeeList3.set(i, new Employee(name, gender, codee, brith, phone, citizen, email, level, location, wage));
                employeeRepo.update(employeeList3);
                break;
            }
        }
    }

    @Override
    public void delete() {
        List<Employee> employeeList4 = employeeRepo.getAllDisplay();
        System.out.println("nhập mã cần xoá :");
        String code = sc.nextLine();
        for (int i = 0; i < employeeList4.size(); i++) {
            if (employeeList4.get(i).getCodee() == code) {
                System.out.println("Bạn có muốn xoá  Mã  " + code + " này ko  " +
                        "\n 1. Có" +
                        "\n 2. Không");
                System.out.println("Chọn chức năng");
                int choss = Integer.parseInt(sc.nextLine());
                switch (choss) {
                    case 1:
                        employeeList4.remove(employeeList4.get(i));
                        System.out.println("Bạn xoá thành công");
                        break;
                    case 2:
                        System.out.println("Bạn đã không xoá");
                        break;
                }
                return;
            }
        }
        System.out.println("không tìm thấy mã học viên");
    }
}
