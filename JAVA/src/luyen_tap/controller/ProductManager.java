package luyen_tap.controller;

import luyen_tap.service.Computer;

import java.util.Scanner;

public class ProductManager {
    static Scanner sc = new Scanner(System.in);
    static Computer computer=new Computer();
    public static void MenuProductManager() {
        boolean check;
        do {
            check = true;
            System.out.println("Quản lý sản phẩm gồm các:\n" +
                    "1.Máy tính\n" +
                    "2.Hết ");
            System.out.println("Chọn các chức năng trên đây để thực hiện thao tác");
            int choss = Integer.parseInt(sc.nextLine());
            switch (choss){
                case 1:
                    Computer();
                    break;
                case 3:
                    check=false;
                    break;
            }
        }while (check);
    }

    public static void Computer() {
        boolean check;
        do {
            check = true;
            System.out.println("Quản lý sản phẩm gồm các thao tác:\n" +
                    "1.Thêm sản phẩm máy tính\n" +
                    "2.Sửa thông tin sản phẩm máy tính theo id\n" +
                    "3.Xoá sản phẩm máy tính theo id\n" +
                    "4.Hiển thị danh sách sản phẩm máy tính\n" +
                    "5.Tìm kiếm sản phẩm máy tính theo tên\n" +
                    "6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n"+
                    "7. Thoát");
            System.out.println("Chọn các chức năng trên đây để thực hiện thao tác");
            int choss = Integer.parseInt(sc.nextLine());
            switch (choss) {
                case 1:
                    computer.add();
                    break;
                case 2:
                    computer.update();
                    break;
                case 3:
                    computer.detele();
                    break;
                case 4:
                    computer.display();
                    break;
                case 5:
                    computer.search();
                    break;
                case 6:
                    computer.arrange();
                    break;
                case 7:
                    check=false;
                    break;
            }
        } while (check);
    }
}
