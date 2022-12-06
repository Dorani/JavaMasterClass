package Major_Review_Activities;

public class FoundationsFour {

    public static void main(String[] args) {
        //First example:
        System.out.println("First example - isPalindrome: 11212");
        boolean test1 = isPalindrome(11212);
        System.out.println(test1);

        System.out.println("Another example - isPalindrome: 121");
        boolean test2 = isPalindrome(121);
        System.out.println(test2);
        System.out.println("---------------------------------------------------");

        //Second example:
        System.out.println("Second example - sumFirstAndLastDigit: 2345, 2+5:");
        System.out.println(sumFirstAndLastDigit(2345));
        System.out.println("---------------------------------------------------");
    }
    //Function that checks if the reverse of a number is equal to the initial
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temp;
        temp = number;

        while (temp != 0) {
            int lastDigit = temp % 10;
            reverse = (reverse * 10) + lastDigit;
            temp = temp / 10;
        }

        return number == reverse;
    }

    //Function that extracts the first and last number of any digit and adds them
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else {
            int firstNumber = 0;
            int lastNumber = number % 10;

            while (number > 10) {
                number = number / 10;
                firstNumber = number;
            }
            if (firstNumber == 0) {
                firstNumber = lastNumber;
            }
            return firstNumber + lastNumber;
        }
    }
}
