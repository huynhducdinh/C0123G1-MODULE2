package ss12_map.luyen_tap.service;

import ss12_map.luyen_tap.molel.ComputerProducts;

import java.util.*;

public class Computer implements IComputer {
    static ArrayList<ComputerProducts> computerProducts = new ArrayList<>();

    static {
        computerProducts.add(new ComputerProducts(1, "dell", 10, "pink"));
    }
    static  ComputerProducts computerProducts1=new ComputerProducts();

    static Scanner sc = new Scanner(System.in);


    @Override
    public void add() {
        System.out.println("Nhập id của sản phẩm");
        int id = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = 0; i < computerProducts.size(); i++) {
            if (computerProducts.get(i).getId() == id) {
                System.out.println("id của sản phẩm có rồi");
                return;
            } else {
                count++;
            }
        }
        System.out.println("Nhập hãng của sản phẩm");
        String product = sc.nextLine();
        System.out.println("Nhập giá tiền của sản phẩm");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập màu của sản phẩm");
        String color = sc.nextLine();
        ComputerProducts computerProducts1 = new ComputerProducts(id, product, price, color);
        computerProducts.add(computerProducts1);
    }

    @Override
    public void update() {
        System.out.println("Nhập id vào đây để tìm ");
        int id = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = 0; i < computerProducts.size(); i++) {
            if (computerProducts.get(i).getId() == id) {
                System.out.println("Nhập hãng của sản phẩm bạn muốn sửa");
                String product = sc.nextLine();
                System.out.println("Nhập giá tiền của sản phẩm");
                int price = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập màu bạn muốn đổi");
                String color = sc.nextLine();
                computerProducts.set(i, new ComputerProducts(id, product, price, color));
                break;
            }
        }

    }

    @Override
    public void detele() {
        System.out.println("Nhập id mà bạn muốn xoá");
        int name = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < computerProducts.size(); i++) {
            if (computerProducts.get(i).getId() == name) {
                System.out.println("Bạn có chắc muốn xoá " + name + "này" +
                        "\n 1. Có" +
                        "\n2. Không");
                System.out.println("Chọn Có hoặc Không");
                int choss = Integer.parseInt(sc.nextLine());
                switch (choss) {
                    case 1:
                        computerProducts.remove(computerProducts.get(i));
                        System.out.println("Bạn xoá thành công");
                        break;
                    case 2:
                        System.out.println("Hì không xoá rồi");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy id của sản phẩm");
    }

    @Override
    public void display() {
        System.out.println("Danh sách máy tính của cửa hàng:");
        for (ComputerProducts c : computerProducts) {
            System.out.println(c);
        }
    }

    @Override
    public void search() {
            System.out.println("Nhập tên để tìm kiếm trong danh sách");
            String name = sc.nextLine();
            int count = 0;
            for (int i = 0; i < computerProducts.size(); i++) {
                if (name.equals(computerProducts.get(i).getProduct())) {
                    System.out.println("Săn phẩm bạn  muốn tìm là :\n" + computerProducts.get(i));
                    return;
                } else {
                    count++;
                }

                System.out.println("Tên không có trong danh sách mời nhập lại");
            }
    }

    @Override
    public void arrange() {
        boolean check;
        do {
            check = true;
            System.out.println("Bạn muốn sắp xếp sản phẩm tăng dần hay giảm dần theo giá" +
                    "\n 1. tăng dần" +
                    "\n 2. Giảm dần");
            System.out.println("Chọn 1 hoặc 2");
            int choss=Integer.parseInt(sc.nextLine());
            switch (choss){
                case 1:Collections.sort(computerProducts, new Comparator<ComputerProducts>() {
                    @Override
                    public int compare(ComputerProducts a, ComputerProducts b) {
                        if (a.getPrice() > b.getPrice()) {
                            return 1;
                        } else if (a.getPrice() == b.getPrice()) {
                            return 0;
                        } else {
                            return -1;
                        }
                    }
                });
                    System.out.println("Giảm dần theo giá");
                    display();
                    break;
                case 2:
                    Collections.sort(computerProducts, new Comparator<ComputerProducts>() {
                        @Override
                        public int compare(ComputerProducts a, ComputerProducts b) {
                            if (a.getPrice() < b.getPrice()) {
                                return 1;
                            } else if (a.getPrice() == b.getPrice()) {
                                return 0;
                            } else {
                                return -1;
                            }
                        }
                    });
                    System.out.println("Giảm dần theo giá");
                    display();
                    break;
                case 3:
                    check=false;
                    break;
            }
        } while (check);

    }
}
