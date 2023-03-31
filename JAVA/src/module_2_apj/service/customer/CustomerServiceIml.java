package module_2_apj.service.customer;

import module_2_apj.method.CheckTrueOfFalse;
import module_2_apj.molel.person.Customer;
import module_2_apj.repositroy.customer.CustomerRepo;
import module_2_apj.repositroy.customer.ICustomerRepo;
import module_2_apj.service.IService;

import java.util.List;
import java.util.Scanner;

public class CustomerServiceIml implements ICustomerService {
   static ICustomerRepo customerRepo = new CustomerRepo();
    static Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        List<Customer> customerList = customerRepo.getAllDisplay();
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        String name = CheckTrueOfFalse.checkName();
        String gender = CheckTrueOfFalse.checkGender();
        String id = CheckTrueOfFalse.inputId();
        String birth = CheckTrueOfFalse.checkBrith();
        String phone = CheckTrueOfFalse.checkNumberPhone();
        String citizen =CheckTrueOfFalse.checkCitizen();
        String email = CheckTrueOfFalse.checkEmail();
        String guest = CheckTrueOfFalse.rank();
        String address = CheckTrueOfFalse.checkAddresse();
        Customer customer = new Customer(name, gender, id, birth, phone, citizen, email, guest, address);
        customerRepo.add(customer);

    }

    @Override
    public void update() {
        List<Customer> customerList = customerRepo.getAllDisplay();
        System.out.println("nhập mã cần sửa :");
        String codee =sc.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if ((customerList.get(i).getCodee()) == codee) {
                String name = CheckTrueOfFalse.checkName();
                String gender = CheckTrueOfFalse.checkGender();
                String birth = CheckTrueOfFalse.checkBrith();
                String phone = CheckTrueOfFalse.checkNumberPhone();
                String citizen =CheckTrueOfFalse.checkCitizen();
                String email = CheckTrueOfFalse.checkEmail();
                String guest = CheckTrueOfFalse.rank();
                String address = CheckTrueOfFalse.checkAddresse();
                customerList.set(i, new Customer(name,gender,codee,birth,phone,citizen,email,guest,address));
                customerRepo.update(customerList);
                break;
            }
        }
    }

    @Override
    public void delete() {
       List<Customer>customerList=customerRepo.getAllDisplay();
        System.out.println("nhập mã cần xoá :");
        String code = sc.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCodee() == code) {
                System.out.println("Bạn có muốn xoá  Mã  " + code + " này ko  " +
                        "\n 1. Có" +
                        "\n 2. Không");
                System.out.println("Chọn chức năng");
                int choss = Integer.parseInt(sc.nextLine());
                switch (choss) {
                    case 1:
                        customerList.remove(customerList.get(i));
                        System.out.println("Bạn xoá thành công");
                        break;
                    case 2:
                        System.out.println("Bạn đã không xoá");
                }
                return;
            }
        }
        System.out.println("không tìm thấy mã kháwch hàng");
    }


}
