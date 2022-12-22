package classes.bus.customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class CustomerList {

    private List<Customer> customerList = new ArrayList<>();

    public void addCustomer(Customer a) {
        customerList.add(a);
    }

    List<Customer> sortCustomerInAlphabeticalOrder() {
        List<Customer> list = new ArrayList<>(customerList);
        Collections.sort(list, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        return list;
    }
    List<Customer>getCreditCardNumberByDiapason(int diapasonStart, int diapasonEnd) {
        return customerList.stream()
                .filter(customer -> customer.getCardNumber() >=diapasonStart && customer.getCardNumber()<=diapasonEnd)
                .collect(Collectors.toList());
    }
}
