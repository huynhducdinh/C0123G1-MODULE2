package module_2_apj.repositroy.Customer;

import module_2_apj.molel.person.Customer;

import java.util.List;

public interface ICustomerRepo {
   List<Customer> getAllDisplay();
    void add(Customer customer);
    void update(    List<Customer> customerList);
    void delete();
}
