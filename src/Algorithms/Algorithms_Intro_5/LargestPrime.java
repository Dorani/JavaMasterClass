package Algorithms.Algorithms_Intro_5;

public class LargestPrime {

    public static void main(String[] args) {
        int test1 = getLargestPrime (21);
        System.out.println(test1);

        int test2 = getLargestPrime(217);
        System.out.println(test2);

        int test3 = getLargestPrime(0);
        System.out.println(test3);

        int test4 = getLargestPrime (45);
        System.out.println(test4);

        int test5 = getLargestPrime(-1);
        System.out.println(test5);

    }

    public static int getLargestPrime(int number) {
        if(number <= 0) {
            return -1;
        }
        int largestPrimeFactor = -1;

        for(int factor = 2; factor <= number; factor++){
            if(number % factor == 0) {
                boolean isPrime = true;
                for(int j = 2; j < factor; j++) {
                    if(factor % j == 0) {
                        isPrime = false;
                    }
                }
                if(isPrime) {
                    largestPrimeFactor = factor;
                }
            }
        }
        return largestPrimeFactor;
    }
}
