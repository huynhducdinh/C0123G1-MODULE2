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
        String citizen = CheckTrueOfFalse.checkCitizen();
        String email = CheckTrueOfFalse.checkEmail();
        String guest = CheckTrueOfFalse.rank();
        String address = CheckTrueOfFalse.checkAddresse();
        Customer customer = new Customer(name, gender, id, birth, phone, citizen, email, guest, address);
        customerRepo.add(customer);

    }

    @Override
    public void update() {

        boolean flag;
        int customerCodeSearch;
        do {
            try {
                System.out.println("Search for the code to be edited");
                customerCodeSearch = sc.nextInt();
                flag = true;
            }catch(NumberFormatException e){
                System.out.println("Not Found");
                flag=false;
            }
        } while (!flag);
        List<Customer> customerList = customerRepo.getAllDisplay();
        System.out.println("enter code to edit :");
        String codee = sc.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if ((customerList.get(i).getCodee()) == codee) {
                String name = CheckTrueOfFalse.checkName();
                String gender = CheckTrueOfFalse.checkGender();
                String birth = CheckTrueOfFalse.checkBrith();
                String phone = CheckTrueOfFalse.checkNumberPhone();
                String citizen = CheckTrueOfFalse.checkCitizen();
                String email = CheckTrueOfFalse.checkEmail();
                String guest = CheckTrueOfFalse.rank();
                String address = CheckTrueOfFalse.checkAddresse();
                customerList.set(i, new Customer(name, gender, codee, birth, phone, citizen, email, guest, address));
                customerRepo.update(customerList);
                break;
            }
        }
    }

    @Override
    public void delete() {
        List<Customer> customerList = customerRepo.getAllDisplay();
        System.out.println("enter the code to delete :");
        String code = sc.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCodee() == code) {
                System.out.println("Do you want to delete this Code " + code + " " +
                        "\n 1. Yes" +
                        "\n 2. No");
                System.out.println("Select function");
                int choss = Integer.parseInt(sc.nextLine());
                switch (choss) {
                    case 1:
                        customerList.remove(customerList.get(i));
                        System.out.println("You deleted successfully");
                        break;
                    case 2:
                        System.out.println("You did not delete");
                }
                return;
            }
        }
        System.out.println("customer code not found");
    }

}
