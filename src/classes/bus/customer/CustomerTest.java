package classes.bus.customer;

import java.util.List;

public class CustomerTest {
    public static void main(String[] args) {
        CustomerList list = new CustomerList();
        Customer csm1 = new Customer("Попов", "Олег", "Іванович",
                "Київ", 78976,
                67543);
        Customer csm2 = new Customer("Антонов", "Іван", "Антонович",
                "Полтава", 28976,
                76143);
        Customer csm3 = new Customer("Янкович", "Микола", "Олексїйович",
                "Львів", 79465,
                67434);
        Customer csm4 = new Customer("Арестович", "Степан", "Іванович",
                "Київ", 58616,
                89543);
        Customer csm5 = new Customer("Ляховненко", "Ярослав", "Іванович",
                "Запоріжжя", 28943,
                59543);
        Customer csm6 = new Customer("Бершов", "Володимир", "Іванович",
                "Одеса", 98954,
                67519);

        CustomerList newList = new CustomerList();
        newList.addCustomer(csm1);
        newList.addCustomer(csm2);
        newList.addCustomer(csm3);
        newList.addCustomer(csm4);
        newList.addCustomer(csm5);
        newList.addCustomer(csm6);

        List<Customer> listSortByName = newList.sortCustomerInAlphabeticalOrder();
            System.out.println(listSortByName);

        List<Customer> listByDiapasonCart = newList.getCreditCardNumberByDiapason(80000, 99000);
            System.out.println(listByDiapasonCart);
    }

}
