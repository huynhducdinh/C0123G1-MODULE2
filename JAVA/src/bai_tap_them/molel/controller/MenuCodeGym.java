package bai_tap_them.molel.controller;

import bai_tap_them.molel.service.IntructorIml;
import bai_tap_them.molel.service.StudentIml;

import java.util.Scanner;

public class MenuCodeGym {
   static StudentIml studentIml = new StudentIml();
   static IntructorIml intructorIml = new IntructorIml();

   static  Scanner sc = new Scanner(System.in);
    public static void displayMenuCodyGym() {
        boolean check;
        do {
            check = true;
            System.out.println("Trung tâm đào đào tạo gồm có " +
                    "\n1. Học viên" +
                    "\n2. Giảng viên" +
                    "\n3. Hết việc làm");
            System.out.println("Nếu bạn là học viên hay giảng viên  thì ấn phím 1 hoặc 2 muốn thoát thì phím 3");
            int select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    Student();
                    break;
                case 2:
                    Inturtor();
                    break;
                case 3:
                    check = false;
                    break;
            }
        } while (check);
    }

    public static void Student() {

        boolean check;
        do {
            check = true;
            System.out.println("Danh sách quản lí hồ sơ học viên gồm có " +
                    "\n1. Thêm mới  học viên" +
                    "\n2. Xoá  học viên" +
                    "\n3. Xem danh sách học viên" +
                    "\n4. Hết việc làm");
            System.out.println("Hãy chọn các mục trên đây để làm việc");
            System.out.println("Chọn chức năng");
            int chooss = Integer.parseInt(sc.nextLine());
            switch (chooss) {
                case 1:
                    System.out.println("Hãy nhập các chức năng sau đây");
                    studentIml.add();
                    break;
                case 2:
                    studentIml.detele();
                    break;
                case 3:
                    System.out.println("Hiển thị danh sách học viên");
                    studentIml.display();
                    break;
                case 4:
                    check = false;
                    break;
            }
        } while (check);
    }

    public static void Inturtor() {
        boolean check;
        do {
            check =true;
            System.out.println("Danh sách quản lí hồ sơ giảng viên gồm" +
                    "\n1. Thêm mới  giảng viên" +
                    "\n2. Xoá  giảng viên" +
                    "\n3. Xem danh sách giảng viên" +
                    "\n4. Hết việc làm");
            System.out.println("Hãy chọn các mục trên đây để làm việc");
            System.out.println("Chọn chức năng");
            int chooss = Integer.parseInt(sc.nextLine());
            switch (chooss) {
                case 1:
                    System.out.println("Hãy nhập các chức năng sau đây");
                    intructorIml.add();
                    break;
                case 2:
                    intructorIml.detele();
                    break;
                case 3:
                    System.out.println("Hiển thị danh sách giảng viên");
                    intructorIml.display();
                    break;
                case 4:
                    check=false;
                    break;
            }
        } while (check);
    }
}