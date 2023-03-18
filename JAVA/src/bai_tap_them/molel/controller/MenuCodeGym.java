package bai_tap_them.molel.controller;


import bai_tap_them.molel.molel.Intructor;
import bai_tap_them.molel.molel.Student;
import bai_tap_them.molel.service.IntructorIml;
import bai_tap_them.molel.service.StudentIml;

import java.util.Scanner;

public class MenuCodeGym {

    public static void displayMenuCodyGym() {
        StudentIml studentIml = new StudentIml();
        IntructorIml intructorIml = new IntructorIml();
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {System.out.println("Danh sách quản lí hồ sơ " +
                "\n1. Thêm mới  học viên hay giảng viên" +
                "\n2. Xoá  học sinh hay giảng viên" +
                "\n3. Xem danh sách học sinh hay giảng viên" +
                "\n4. Hết việc làm");
            System.out.println("Hãy chọn các mục trên đây để làm việc");
            int select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    Student();
                    do {
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
                                displayMenuCodyGym();
                                break;
                        }
                    } while (check);
                    break;
                case 2:
                    Inturtor();
                    do{
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
                                displayMenuCodyGym();
                                break;
                        }
                    } while (check);
                    do {
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
                                displayMenuCodyGym();
                                break;
                        }
                    } while (check);
                    break;
                case 3:
                    check = false;
                    System.out.println("Hết rồi");
                    break;
            }
        } while (check);
    }

    public static void Student() {
        System.out.println("Danh sách quản lí hồ sơ " +
                "\n1. Thêm mới  giảng viên" +
                "\n2. Xoá  giảng viên" +
                "\n3. Xem danh sách giảng viên" +
                "\n4. Hết việc làm");
        System.out.println("Hãy chọn các mục trên đây để làm việc");
    }
    public static void Inturtor() {
        System.out.println("Danh sách quản lí hồ sơ " +
                "\n1. Thêm mới  giảng viên" +
                "\n2. Xoá  giảng viên" +
                "\n3. Xem danh sách giảng viên" +
                "\n4. Hết việc làm");
        System.out.println("Hãy chọn các mục trên đây để làm việc");
    }
}