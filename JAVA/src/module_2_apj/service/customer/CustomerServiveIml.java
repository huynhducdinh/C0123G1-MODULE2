package module_2_apj.service.customer;

import module_2_apj.molel.person.Customer;
import module_2_apj.service.ISevrice;

import java.util.ArrayList;

public class CustomerServiveIml implements ISevrice {
    static ArrayList<Customer>customers=new ArrayList<>();
    static {
        customers.add(new Customer("Đinh","Nam",1,98,90855,206379735,"heeyeon@","vip","quảng nam"));
    }
    @Override
    public void display() {
        System.out.println("Hiển thị");
        for (Customer c:customers) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
