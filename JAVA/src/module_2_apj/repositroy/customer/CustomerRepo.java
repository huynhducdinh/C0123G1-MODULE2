package module_2_apj.repositroy.customer;

import module_2_apj.molel.person.Customer;
import module_2_apj.util.read_file.CustomerReadFile;
import module_2_apj.util.wrtie_file.CustomerWriteFile;

import java.util.List;

public class CustomerRepo implements ICustomerRepo {
    static Customer customer = new Customer();
    private static final String CUSTOMER_LIST_PATH = "src\\module_2_apj\\data\\customer.csv";
    public static void writeFileCus(List<Customer>customerList){
        CustomerWriteFile.customerWrite(CUSTOMER_LIST_PATH,customerList);
    }
   static List<Customer> customerList = CustomerReadFile.comparators(CUSTOMER_LIST_PATH);
    @Override
    public List<Customer> getAllDisplay() {
        return customerList;
    }

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
        writeFileCus(customerList);


    }

    @Override
    public void update(List<Customer> customerList) {
        writeFileCus(customerList);
    }

    @Override
    public void delete() {
        customerList.remove(new Customer());
    }
}
