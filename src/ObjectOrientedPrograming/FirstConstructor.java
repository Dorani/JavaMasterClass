package ObjectOrientedPrograming;

public class FirstConstructor {

    public static void main(String[] args) {
        Account bobsAccount = new Account("12345", 0.00, "Bob Brown",
                "myemail@bob,com", "(222) 354 2233");

        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        Account timsAccount = new Account("Tim", "tim@gmail.com", "123455");
        System.out.println(timsAccount.getNumber());
    }
    public static class Account {
        private String number;
        private double balance;
        private String customerName;
        private String customerEmailAddress;
        private String customerPhoneNumber;

        public Account() {
            this("523245", 2.50, "Default Name", "Default Email",
                    "Default Phone Number");
            System.out.println("constructor without parameter called...");
        }

        public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
            //initialization with 2 default parameters
            //we can have multiple constructors
            this("9999", 100.55,customerName, customerEmailAddress, customerPhoneNumber);
            this.customerName = customerName;
            this.customerEmailAddress = customerEmailAddress;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        //constructor:
        public Account(String number, double balance, String customerName,
                       String CustomerEmailAddress, String customerPhoneNumber) {
            System.out.println("constructor with parameter called...");
            this.number = number;
            this.balance = balance;
            this.customerName = customerName;
            this.customerEmailAddress = CustomerEmailAddress;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        public void deposit(double depositAmount) {
            this.balance += depositAmount;
        }

        public void withdrawal(double withdrawalAmount) {
            if(this.balance - withdrawalAmount < 0) {
                System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
            } else {
                this.balance -= withdrawalAmount;
                System.out.println("Withdrawal of " + withdrawalAmount + " processed. The remaining balance is " + this.balance);
            }
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getCustomerEmailAddress() {
            return customerEmailAddress;
        }

        public void setCustomerEmailAddress(String customerEmailAddress) {
            this.customerEmailAddress = customerEmailAddress;
        }

        public String getCustomerPhoneNumber() {
            return customerPhoneNumber;
        }

        public void setCustomerPhoneNumber(String customerPhoneNumber) {
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

}

//----------------------------Part 1 of Challenge----------------------------------//
// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.

// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.


