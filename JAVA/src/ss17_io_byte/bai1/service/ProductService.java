package ss17_io_byte.bai1.service;

import ss17_io_byte.bai1.molel.Product;
import ss17_io_byte.bai1.repositroy.ProductRepo;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    ProductRepo productRepo = new ProductRepo();
    static Scanner sc = new Scanner(System.in);
    static Product product = new Product();

    @Override
    public void display() {
        List<Product> products = productRepo.getAllDisplay();
        for (Product p : products) {
            System.out.println(p);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập id ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm ");
        String name = sc.nextLine();
        System.out.println("Nhập giá ");
        float price = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập hàng sản xuất ");
        String manufactured = sc.nextLine();
        System.out.println("Hãy mô toả sản phẩm");
        String describe = sc.nextLine();
        product = new Product(id, name, price, manufactured, describe);
        productRepo.add(product);
    }

    @Override
    public void search() {
        List<Product> products = productRepo.getAllDisplay();
        System.out.println("Nhập tên sản phẩm cần tìm kiếm: ");
        String nameFind = sc.nextLine();
        boolean search = false;
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(nameFind.toLowerCase())) {
                System.out.println(product);
                search = true;
            }
        }
        if (!search) {
            System.out.println("Không tìm thấy sản phẩm.");
        }
    }
}
