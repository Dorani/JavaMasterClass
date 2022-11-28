package Algorithms.Algorithms_Intro_4;

public class PerfectNumber {
    public static void main(String[] args) {
        boolean test1 = isPerfectNumber(6);
        System.out.println(test1);

        boolean test2 = isPerfectNumber(28);
        System.out.println(test2);

        boolean test3 = isPerfectNumber(5);
        System.out.println(test3);

        boolean test4 = isPerfectNumber(-1);
        System.out.println(test4);

    }

    public static boolean isPerfectNumber(int number) {
        int total = 0;

        if (number < 1) {
            return false;
        } else {
            for(int x = 1; x < number; x++) {
                if(number % x == 0) {
                   total += x;
                }
            }
            return total == number;
        }
    }
}
