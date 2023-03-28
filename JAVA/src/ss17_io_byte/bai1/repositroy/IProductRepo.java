package ss17_io_byte.bai1.repositroy;

import ss17_io_byte.bai1.molel.Product;

import java.util.List;

public interface IProductRepo {
    List<Product> getAllDisplay();

    void add(List<Product>productList);

    void search();
}
