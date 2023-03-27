package ss17_io_byte.bai1.controller;

import ss17_io_byte.bai1.service.ProductService;

import java.util.Scanner;

public class MainMenu {
    static ProductService productService = new ProductService();

    public static void displayMenu() {
        boolean flag;
        do {
            flag = true;
            Scanner sc = new Scanner(System.in);
            System.out.println("Chọn chức năng" +
                    "\n1. Thêm mới" +
                    "\n2. HIển thị" +
                    "\n3. Tìm kiếm");
            System.out.println("Mời họn chức năng để dùm");
            int choss = Integer.parseInt(sc.nextLine());
            switch (choss) {
                case 1:
                    System.out.println("Mời thêm mới");
                    productService.add();
                    break;
                case 2:
                    productService.display();
                    System.out.println("Danh sách hiển thị");
                    break;
                case 3:
                    productService.search();
                    System.out.println("Tìm kiếm thông tin");
                    break;
                default:
                    flag = false;
                    displayMenu();
                    break;
            }
        } while (flag);
    }
}
