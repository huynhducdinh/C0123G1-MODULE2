package luyen_tap.molel;

public class ComputerProducts {
    int id ;
    String product;
     int price;
      String color;

    public ComputerProducts() {
    }

    public ComputerProducts(int id, String product, int price, String color) {
        this.id = id;
        this.product = product;
        this.price = price;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setComputer(String product) {
        this.product= product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ComputerProducts{" +
                "id=" + id +
                ", computer='" + product + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
