package module_2_apj.repositroy.Customer;

import module_2_apj.molel.person.Customer;
import module_2_apj.util.ReadAndWrite;
import module_2_apj.util.read_file.CustomerReadFile;
import module_2_apj.util.wrtie_file.CustomerWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepo implements ICustomerRepo {
    static Customer customer = new Customer();
    private static final String CUSTOMER_LIST_PATH = "src\\module_2_apj\\data\\customer.csv";
    public static void writeFileCus(List<Customer>customerList){
        CustomerWriteFile.customerWrite(CUSTOMER_LIST_PATH,customerList);
    }
    @Override
    public List<Customer> getAllDisplay() {
        List<Customer> customerList = CustomerReadFile.comparators(CUSTOMER_LIST_PATH);
        return customerList;
    }

    @Override
    public void add(Customer customer) {
        List<Customer> customerList = CustomerReadFile.comparators(CUSTOMER_LIST_PATH);
        customerList.add(customer);
        writeFileCus(customerList);


    }

    @Override
    public void update(List<Customer> customerList) {
        writeFileCus(customerList);
    }

    @Override
    public void delete() {

    }
}
