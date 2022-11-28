package Data_Structures.Arrays.Autoboxing_Challenge;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    //create a new bank initialized and ready to be used
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomerTransaction(customerName,amount);
        } else {
            return false;
        }
    }

    private Branch findBranch(String customerName) {
        //go through our list of customers
        for(int i = 0; i < branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(customerName)) {
                return checkedBranch;
            }
        }
        return null;
    }


    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null){
            //figure out which branch we are dealing with
            System.out.println("Customers details for branch " + branch.getName());
            //now lets get a list of the respective customers
            ArrayList<Customer> branchCustomers = branch.getCustomers();

            //loop through the list of customers
            for(int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                //i + 1 to start the list at 1
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1)  + "]" );

                //show transactions for those customers:
                if(showTransactions) {
                    System.out.println("Transactions: ");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();

                    //another loop, in case there are multiple transactions:
                    for(int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "]" + "Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

}
