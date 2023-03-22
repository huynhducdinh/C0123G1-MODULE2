package module_2_apj.service.employee;

import module_2_apj.molel.person.ComparatorEmployee;
import module_2_apj.molel.person.Employee;

import java.util.*;

public class EmployeeServiceIml implements IEmployessService {
    static ArrayList<Employee>employees=new ArrayList<>();
    static {
        employees.add(new Employee("Đinh","Nam",1,98,908555,206379736,"heeyeon@","Sau Đại Học","Nhân viên","10tr"));
        Collections.sort(employees, new ComparatorEmployee());
    }

    static Scanner sc=new Scanner(System.in);

    @Override
    public void display() {
        System.out.println("Hiển thị");
        for (Employee e:employees) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập tên nhân viên");
        String name =sc.nextLine();
        System.out.println("Nhập giới tính nhân viên");
        String gender=sc.nextLine();
//        mã nv ko dc trùng
        System.out.println("Nhập mã nhân nhân viên");
        int code=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập ngày sinh nhân viên");
        int birday=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số điện thoại nhân viên");
        int isnumber=Integer.parseInt(sc.nextLine());
//        cmnd ko dc trùng
        System.out.println("Nhập CMND nhân viên");
        int cmnd=Integer.parseInt(sc.nextLine());
//        email ko dc trùng nè
        System.out.println("Nhập Email nhân viên");
        String email=sc.nextLine();
        System.out.println("Nhập Trình độ nhân viên");
        String trinhDo=sc.nextLine();
        System.out.println("Nhập Vị trí làm việc nhân viên");
        String viTri=sc.nextLine();
        System.out.println("Nhập Số tiền lương nhân viên");
        String luong=sc.nextLine();
       Employee employee=(new Employee(name,gender,code,birday,isnumber,cmnd,email,trinhDo,viTri,luong));
        employees.add(employee);
    }

    @Override
    public void update() {
        System.out.println("nhập mã cần sửa :");
        int codee = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <employees.size() ; i++) {
            if (employees.get(i).getCodee()== codee){
                System.out.println("Nhập tên nhân viên");
                String name =sc.nextLine();
                System.out.println("Nhập giới tính nhân viên");
                String gender=sc.nextLine();
//        mã nv ko dc trùng
                System.out.println("Nhập mã nhân nhân viên");
                int code=Integer.parseInt(sc.nextLine());
                System.out.println("Nhập ngày sinh nhân viên");
                int birday=Integer.parseInt(sc.nextLine());
                System.out.println("Nhập số điện thoại nhân viên");
                int isnumber=Integer.parseInt(sc.nextLine());
//        cmnd ko dc trùng
                System.out.println("Nhập CMND nhân viên");
                int cmnd=Integer.parseInt(sc.nextLine());
//        email ko dc trùng nè
                System.out.println("Nhập Email nhân viên");
                String email=sc.nextLine();
                System.out.println("Nhập Trình độ nhân viên");
                String trinhDo=sc.nextLine();
                System.out.println("Nhập Vị trí làm việc nhân viên");
                String viTri=sc.nextLine();
                System.out.println("Nhập Số tiền lương nhân viên");
                String luong=sc.nextLine();
               employees.set(i,new Employee(name,gender,code,birday,isnumber,cmnd,email,trinhDo,viTri,luong));
                break;
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("nhập mã cần xoá :");
        int code = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getCodee() == code) {
                System.out.println("Bạn có muốn xoá  Mã  " + code + " này ko  " +
                        "\n 1. Có" +
                        "\n 2. Không");
                System.out.println("Chọn chức năng");
                int choss = Integer.parseInt(sc.nextLine());
                switch (choss) {
                    case 1:
                        employees.remove(employees.get(i));
                        System.out.println("Bạn xoá thành công");
                        break;
                    case 2:
                        System.out.println("Bạn đã không xoá");
                }
                return;
            }
        }
        System.out.println("không tìm thấy mã học viên");
    }


}
