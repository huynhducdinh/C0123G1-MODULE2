package module_2_apj.service.customer;

import module_2_apj.molel.person.Customer;
import module_2_apj.molel.person.Employee;
import module_2_apj.repositroy.Customer.CustomerRepo;
import module_2_apj.service.ISevrice;
import module_2_apj.util.ReadAndWrite;
import module_2_apj.util.read_file.CustomerReadFile;
import module_2_apj.util.wrtie_file.CustomerWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiveIml implements ISevrice {
    CustomerRepo customerRepo = new CustomerRepo();
    static Scanner sc = new Scanner(System.in);
    static Customer customer = new Customer();

    @Override
    public void display() {
        List<Customer> customerList = customerRepo.getAllDisplay();
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập tên khách hàng");
        String name = sc.nextLine();
        System.out.println("Nhập giới tính khách hàng");
        String gender = sc.nextLine();
        System.out.println("Nhập mã khách hàng");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập ngày sinh khách hàng");
        int birday = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số điện thoại khách hàng");
        int isnumber = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập CMND khách hàng");
        int cmnd = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Email khách hàng");
        String email = sc.nextLine();
        String loaiKhach = capBac();
        System.out.println("Nhập Địa chỉ khách hàng");
        String diaChi = sc.nextLine();
        Customer customer = new Customer(name, gender, id, birday, isnumber, cmnd, email, loaiKhach, diaChi);
        customerRepo.add(customer);

    }

    @Override
    public void update() {
        List<Customer> customerList = customerRepo.getAllDisplay();
        System.out.println("nhập mã cần sửa :");
        int codee = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if ((customerList.get(i).getCodee()) == codee) {
                System.out.println("Nhập lại tên khách hàng");
                String name = sc.nextLine();
                System.out.println("Nhập lại giới tính khách hàng");
                String gender = sc.nextLine();
                System.out.println("Nhập lại mã khách hàng");
                int id = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập lại ngày sinh khách hàng");
                int birday = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập lại số điện thoại khách hàng");
                int isnumber = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập lại CMND khách hàng");
                int cmnd = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập lại Email khách hàng");
                String email = sc.nextLine();
                String loaiKhach = capBac();
                System.out.println("Nhập lại Địa chỉ khách hàng");
                String diaChi = sc.nextLine();
                customerList.set(i, new Customer(name, gender, id, birday, isnumber, cmnd, email, loaiKhach, diaChi));
                customerRepo.update(customerList);
                break;
            }
        }
    }

    @Override
    public void delete() {
       List<Customer>customerList=customerRepo.getAllDisplay();
        System.out.println("nhập mã cần xoá :");
        int code = Integer.parseInt(sc.nextLine());
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
        System.out.println("không tìm thấy mã khách hàng");
    }

    public static String capBac() {
        System.out.println("Chọn loại khách " +
                "\n 1.Kim Cương" +
                "\n 2.Bạch Kim" +
                "\n 3.Vàng" +
                "\n 4.Bạc" +
                "\n 5.Thành viên");
        System.out.println("Mời bạn chọn");
        String poss = sc.nextLine();
        switch (poss) {
            case "1":
                return "Kim cương";
            case "2":
                return "Bạch kim";
            case "3":
                return "Vàng";
            case "4":
                return "Bạc";
            case "5":
                return "Thành viên";
        }
        return poss;
    }
}
