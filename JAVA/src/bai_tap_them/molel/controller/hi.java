package bai_tap_them.molel.controller;

import bai_tap_them.molel.molel.Student;
import bai_tap_them.molel.service.IntructorIml;
import bai_tap_them.molel.service.StudentIml;

import java.util.Scanner;

public class hi {
    public static void displayMenuCodyGym() {
        StudentIml studentIml = new StudentIml();
        IntructorIml intructorIml = new IntructorIml();
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("Danh sách quản lí hồ sơ học viên gồm có " +
                    "\n1. Thêm mới  học viên" +
                    "\n2. Xoá  học viên" +
                    "\n3. Xem danh sách học viên" +
                    "\n4. Hết việc làm");
            System.out.println("Hãy chọn các mục trên đây để làm việc");
            int select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    Student1();
                    int chos = Integer.parseInt(sc.nextLine());
                    if (chos == 1) {
                        System.out.println("Hãy nhập các chức năng sau đây");
                        studentIml.add();
                    } else if (chos == 2) {
                        System.out.println("Hãy nhập các chức năng sau đây");
                        intructorIml.add();
                    } else {
                        displayMenuCodyGym();
                    }
                    break;
                case 2:
                    Student1();
                    int chosss = Integer.parseInt(sc.nextLine());
                    if (1 == chosss) {
                        studentIml.detele();
                    } else if (chosss == 2) {
                        intructorIml.detele();
                    }else {
                        displayMenuCodyGym();
                    }
                    break;
                case 3:
                    Student1();
                    int chos1 = Integer.parseInt(sc.nextLine());
                    if (chos1 == 1) {
                        System.out.println("Hiển thị danh sách học viên");
                        studentIml.display();
                    } else if (chos1 == 2) {
                        System.out.println("Hiển thị danh sách giảng viên");
                        intructorIml.display();
                    } else {
                        displayMenuCodyGym();
                    }
                    break;
                case 4:
                    System.out.println("Kết thúc ");
                    check =false;
            }
        } while (check);
    }

    public static void Student1() {
        System.out.println("Trung tâm đào đào tạo gồm có " +
                "\n1. Học viên" +
                "\n2. Giảng viên" +
                "\n3. Hết việc làm");
        System.out.println("Nếu bạn là học viên hay giảng viên  thì ấn phím 1 hoặc 2 muốn thoát thì phím 3");
    }
}
