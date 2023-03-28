package ss17_io_byte.bai1.repositroy;

import ss17_io_byte.bai1.molel.Product;
import ss17_io_byte.bai1.util.ReadAndWrite;

import java.util.List;

public class ProductRepo implements IProductRepo {
    private static final String FILE = "src\\ss17_io_byte\\bai1\\data\\text.dat";
    private static List<Product> productList = ReadAndWrite.readFile(FILE);

    @Override
    public List<Product> getAllDisplay() {
        return productList;
    }

    @Override
    public void add(List<Product> productList) {
//        ReadAndWrite.writeFile(FILE, productList);
    }

    @Override
    public void search() {
        productList.add(new Product());
    }
}
