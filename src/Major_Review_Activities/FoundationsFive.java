package Major_Review_Activities;

public class FoundationsFive {

    public static void main(String [] args) {
        //First example:
        System.out.println("First example - canPack: bigCount:2, smallCount:4, Goal: 9  ");
        System.out.println(canPack(2, 0, 9));
        System.out.println("---------------------------------------------------");

        //Second example:
        System.out.println("Second example - canPack: getLargestPrime: 217 ");
        System.out.println(getLargestPrime(217));
        System.out.println("---------------------------------------------------");
    }

    //1. Validation of the parameter values
    //2. Determine how many bigCount can fill the goal:  As long as goal is greater than or equal to 5, take the goal
    //and subtract 5 for each bigCount that you have.  Use a while loop to do this and make sure you decrement the number of bigCount for each iteration.
    //3. Determine how many smallCount can fill the goal:  The remaining amount is what you have to fill with smallCount,
    //so evaluate that you have enough smallCount to fulfill the "remaining" goal.
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        while((bigCount > 0) && (goal >= 5)) {
            goal -= 5;
            bigCount--;
        }
        return smallCount >= goal;
    }

     //The definition of prime number (or a prime) is a natural number greater than 1 that is not a product of two
     // smaller natural numbers. So, if a number is divisible by 2, it's not a prime number. And, you never need to
     // check the entire range of the number since any number that is divisible by 2 has a corresponding number that is
     // equal or greater. For example, number = 62 can be broken down to 2 x 31. No need to check from 32, 33, 34...61.
     // The largest prime is 31.
     //With that knowledge, you can optimize the for loop to start the iterator at number/2 and stop at 2.
     // This will improve the performance since you only have to loop half of the range.
     public static int getLargestPrime(int number) {
         if(number <= 1) return -1;
         for(int i = number / 2; i >= 2; i--) {
             if(number % i == 0) {
                 number = i;
             }
         }
         return number;
     }
}