package Control_Flow_Statements;

public class ForLoopStatement {

    public static void main(String[] args) {

        boolean testerPrime1= isPrime(6);
        System.out.println(testerPrime1);

        //for loop demo, standard
        for(int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        System.out.println("************************************");
        //for loop demo, backwards:
        for(int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit
        int count = 0;
        for(int i = 10; i < 50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }
    //calculate interest method:
    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate / 100));
    }


    //Determine whether n is a prime number:
        // ie: a prime number is a whole number greater than 1
        // that can ONLY be divided evenly by 1 or itself.
    public static boolean isPrime(int n) {
        //test to see if it's 1
        if (n == 1) {
            //not a prime number so stop..
            return false;
        }
        // otherwise, we start on 2, since it has to be greater than 1
        // (n/2) is a shortcut, because we want numbers that we should ONLY be processing
        // ie: find numbers that divide into n
        for(int i = 2; i <= (long) Math.sqrt(n); i++) {
            //check if there is a remainder
            if(n % i == 0) {
                return false;
            }
        }
        //otherwise its a prime!
        return true;
    }
}
