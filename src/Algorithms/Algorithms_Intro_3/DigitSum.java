package Algorithms.Algorithms_Intro_3;

public class DigitSum {

    public static void main(String[] args) {
        System.out.println("The Sum of digits in the number 125 is " + sumDigits(125));
        System.out.println("The Sum of digits in the number -125 is " + sumDigits(-125));
        System.out.println("The Sum of digits in the number 4 is " + sumDigits(4));
        System.out.println("The Sum of digits in the number 32123 is " + sumDigits(32123));
    }

    private static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }

        int sum = 0;
        //extract the least significant digit
        //125 -> 125 / 10 = 12 -> 12 * 10 = 120 so 125-120 = least sig digit is 5
        while(number > 0) {
            //extract the least sig digit
            int digit = number % 10;
            System.out.println(digit);
            sum += digit;
            //drop the least sig digit
            number /= 10;
        }

        return sum;
    }
}
