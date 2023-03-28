package module_2_apj.util.read_file;

import module_2_apj.molel.person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerReadFile {
    public static List<Customer> comparators(String path) {
        List<Customer> customersRead = new ArrayList<>();
        File file = new File(path);
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
                    customer = new Customer(arr[0], arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], arr[7], arr[8]);
                    customersRead.add(customer);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return customersRead;
    }
}