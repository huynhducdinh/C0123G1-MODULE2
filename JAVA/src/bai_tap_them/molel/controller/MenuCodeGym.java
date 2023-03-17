package bai_tap_them.molel.controller;


import bai_tap_them.molel.molel.Student;
import bai_tap_them.molel.service.HienThi;
import bai_tap_them.molel.service.ThemMoi;

import java.util.Scanner;

public class MenuCodeGym {

    public static void displayMenuCodyGym(){
        ThemMoi themMoi=new ThemMoi();
        HienThi hienThi=new HienThi();
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("Bạn là giảng viên hay học sinh  " +
                    "\n1. Chọn Học sinh"+
                    "\n2.Chọn Giảng viên" +
                    "\n3. Hết chức năng");
            System.out.println("Hãy chọn các mục trên đây để làm việc");
            int select =Integer.parseInt(sc.nextLine());
            switch (select){
                case 1:
                    Student1();
                    do {
                        System.out.println("Chọn chức năng");
                        int chooss = Integer.parseInt(sc.nextLine());
                        switch (chooss){
                            case 1:
                                System.out.println("Hãy nhập các chức năng sau đây");
                                themMoi.add();
                                break;
                            case 2:
                                themMoi.detele();
                                break;
                            case 3:
                                System.out.println("Hiển thị danh sách học viên");
                                themMoi.display();
                                break;
                            case 4:
                                displayMenuCodyGym();
                                break;
                        }
                    }while (check);
                    break;
                case 2:
                    Inturtor();
                    do {
                        System.out.println("Chọn chức năng");
                        int chooss = Integer.parseInt(sc.nextLine());
                        switch (chooss){
                            case 1:
                                System.out.println("Hãy nhập các chức năng sau đây");
                                themMoi.add();
                                break;
                            case 2:
                                themMoi.detele();
                                break;
                            case 3:
                                System.out.println("Hiển thị danh sách học viên");
                                themMoi.display();
                                break;
                            case 4:
                                displayMenuCodyGym();
                                break;
                        }
                    }while (check);
                    do {
                    System.out.println("Chọn chức năng");
                    int chooss = Integer.parseInt(sc.nextLine());
                    switch (chooss){
                        case 1:
                            System.out.println("Hãy nhập các chức năng sau đây");
                            hienThi.add();
                            break;
                        case 2:
                           hienThi.detele();
                            break;
                        case 3:
                            System.out.println("Hiển thị danh sách giảng viên");
                            hienThi.display();
                            break;
                        case 4:
                            displayMenuCodyGym();
                            break;
                    }
                }while (check);
                break;
                case 3:
                    check=false;
                    System.out.println("Hết rồi");
                    break;
            }
        } while (check);
    }
    public static void Student1(){
        System.out.println("Danh sách quản lí hồ sơ " +
                "\n1. Thêm mới  học sinh"+
                "\n2. Xoá  học sinh" +
                "\n3. Xem danh sách học sinh"+
                "\n4. Hết việc làm");
        System.out.println("Hãy chọn các mục trên đây để làm việc");
    }
    public static  void Inturtor(){
        System.out.println("Danh sách quản lí hồ sơ " +
                "\n1. Thêm mới  giảng viên"+
                "\n2. Xoá  giảng viên" +
                "\n3. Xem danh sách giảng viên"+
                "\n4. Hết việc làm");
        System.out.println("Hãy chọn các mục trên đây để làm việc");
    }


}