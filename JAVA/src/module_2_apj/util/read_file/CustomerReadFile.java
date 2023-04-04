package module_2_apj.util.read_file;

import module_2_apj.molel.person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerReadFile {
    private static final String CUSTOMER_LIST_PATH = "src\\module_2_apj\\data\\customer.csv";

    public static List<Customer> comparators() {
        List<Customer> customersRead = new ArrayList<>();
        File file = new File(CUSTOMER_LIST_PATH);
        FileReader fileReader = null;
        if (file.exists()) {
            try {
                fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = null;
                Customer customer;
                String[] arr;
                while ((line = bufferedReader.readLine()) != null) {
                    arr = line.split(",");
                    customer = new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                    customersRead.add(customer);
                }
                bufferedReader.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return customersRead;
    }
}
