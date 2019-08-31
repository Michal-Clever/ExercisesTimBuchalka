package sekcja8.autoboxingAndUnboxing;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName == null)) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer exisingCustomer = findCustomer(customerName);

        if (exisingCustomer != null) {
            exisingCustomer.addTransactions(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer chekedCustomer = this.customers.get(i);
            if (chekedCustomer.getName().equals(customerName)) {
                return chekedCustomer;
            }
        }
    }


}
