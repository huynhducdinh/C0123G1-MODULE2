package bai_tap_them.molel.service;

import bai_tap_them.molel.molel.Intructor;
import bai_tap_them.molel.molel.Student;
import com.sun.deploy.net.MessageHeader;
import module_2_apj.service.IFacilityService;

import java.util.*;

public class HienThi implements IManagement {
    static ArrayList<Intructor> intructors = new ArrayList<>();

    static {
        intructors.add(new Intructor(1, "1", "1", "1", "1"));

    }

    static Scanner sc = new Scanner(System.in);
Intructor intructor=new Intructor();
    @Override
    public void add() {
        System.out.println("NHập mã giảng viên");
        int ma = Integer.parseInt(sc.nextLine());
        for (Intructor i:intructors) {
            if(! intructors.contains(i)){
                intructors.add(intructors.get(ma));
            }
        }
        System.out.println(intructors);
        System.out.println("NHập tên giảng viên");
        String ma1 = sc.nextLine();
        System.out.println("NHập ngày sinh giảng viên");
        String ma2 = sc.nextLine();
        System.out.println("NHập giới tính giảng viên");
        String ma3 = sc.nextLine();
        System.out.println("NHập Chuyên môn giảng viên");
        String ma4 = sc.nextLine();
        Intructor intructor = new Intructor(ma, ma1, ma2, ma3, ma4);
        intructors.add(intructor);
    }

    @Override
    public void update() {

    }

    @Override
    public void detele() {
        System.out.println("nhập mã giảng viên cần xoá :");
        Scanner sc = new Scanner(System.in);
        int code = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < intructors.size(); i++) {
            if (intructors.get(i).getCode() == code) {
                intructors.remove(intructors.get(i));
                System.out.println("xoá thành công");
                return;
            }
        }
        System.out.println("không tìm thấy mã giảng viên");
//        int detele = Integer.parseInt(sc.nextLine());
//        students.remove(detele);
//        for (Student s : students) {
//
//            System.out.println(s + " ");
//        }
    }

    public void display() {
        System.out.println("Hiển thị danh sách:");
        for (Intructor i : intructors) {
            System.out.println(i);
        }
    }
}
