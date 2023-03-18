package bai_tap_them.molel.service;

import bai_tap_them.molel.molel.Intructor;

import java.util.*;

public class IntructorIml implements IManagement {
    static ArrayList<Intructor> intructors = new ArrayList<>();

    static {
        intructors.add(new Intructor(1, "09", "nam", "Hí Anh", "Intructor"));
    }

    static Scanner sc = new Scanner(System.in);
    Intructor intructor = new Intructor();

    @Override
    public void add() {
        System.out.println("NHập mã giảng viên");
        int code = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = 0; i < intructors.size(); i++) {
            if (code == intructors.get(i).getCode()) {
                System.out.println("mã trùng rồi mời quay lại chức năng");
                return;
            } else {
                count++;
            }
        }
        if (count == intructors.size()) {
        }
        System.out.println("NHập tên giảng viên");
        String name = sc.nextLine();
        System.out.println("NHập ngày sinh giảng viên");
        String birday = sc.nextLine();
        System.out.println("NHập giới tính giảng viên");
        String gender = sc.nextLine();
        System.out.println("NHập Chuyên môn giảng viên");
        String specialize = sc.nextLine();
        Intructor intructor = new Intructor(code, name, birday, gender, specialize);
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
                System.out.println("Bạn có muốn xoá  Mã  " + code + " này ko  " +
                        "\n 1. Có" +
                        "\n 2. Không");
                System.out.println("Chọn chức năng");
                int choss = Integer.parseInt(sc.nextLine());
                switch (choss) {
                    case 1:
                        intructors.remove(intructors.get(i));
                        System.out.println("Bạn xoá thành công");
                        break;
                    case 2:
                        System.out.println("Bạn đã không xoá");
                }
                return;
            }
        }
        System.out.println("không tìm thấy mã giảng viên");
    }

    public void display() {
        System.out.println("Hiển thị danh sách:");
        for (Intructor i : intructors) {
            System.out.println(i);
        }
    }
}
