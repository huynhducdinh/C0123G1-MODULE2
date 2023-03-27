package ss17_io_byte.bai1.repositroy;

import ss17_io_byte.bai1.molel.Product;
import ss17_io_byte.bai1.util.ReadAndWrite;

import java.util.List;

public class ProductRepo implements IProductRepo {
    private static final String FILE = "src\\ss17_io_byte\\bai1\\data\\text.dat";

    @Override
    public List<Product> getAllDisplay() {
        List<Product> productList = ReadAndWrite.readFile(FILE);
        return productList;
    }

    @Override
    public void add(Product product) {
        List<Product> productList1 = ReadAndWrite.readFile(FILE);
        productList1.add(product);
        ReadAndWrite.writeFile(FILE, productList1);
    }

    @Override
    public void search() {
        List<Product> productList1 = ReadAndWrite.readFile(FILE);
        productList1.add(new Product());
    }
}
