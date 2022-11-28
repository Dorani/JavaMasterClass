package Data_Structures.Arrays.Autoboxing_Challenge;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if(findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        //grab existing customer record and add that amount to that person
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        } else {
            return false;
        }
    }

    private Customer findCustomer(String customerName) {
        //go through our list of customers
        for(int i = 0; i < customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)) {
                return this.customers.get(i);
            }
        }
        return null;
    }
}
