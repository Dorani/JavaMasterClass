package ObjectOrientedPrograming;

public class SecondConstructor {
    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 2500000);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 123444, "time@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getCreditLimit());
        System.out.println(person3.getEmailAddress());
    }

    public static class VipCustomer {
        private String name;
        private double creditLimit;
        private String emailAddress;

        public VipCustomer() {
            this("default name", 50000, "default@gmail.com");
        }

        public VipCustomer(String name, double creditLimit, String emailAddress) {
            this.name = name;
            this.creditLimit = creditLimit;
            this.emailAddress = emailAddress;
        }


        public VipCustomer(String name, double creditLimit) {
            this.name = name;
            this.creditLimit = creditLimit;
        }

        public String getName() {
            return name;
        }

        public double getCreditLimit() {
            return creditLimit;
        }

        public String getEmailAddress() {
            return emailAddress;
        }
    }
}



//----------------------------Part 2 of Challenge----------------------------------//
// Create a new class VipCustomer
// it should have 3 fields name, credit limit, and email address.
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of intellij as setters wont be needed
// test and confirm it works.