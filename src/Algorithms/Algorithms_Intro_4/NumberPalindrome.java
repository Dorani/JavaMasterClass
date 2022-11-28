package Algorithms.Algorithms_Intro_4;

public class NumberPalindrome {

    public static void main(String[] args) {
        boolean palindromeTest = isPalindrome(121);
        System.out.println(palindromeTest);

        boolean test2 = isPalindrome(-1221);
        System.out.println(test2);

        boolean test3 = isPalindrome(707);
        System.out.println(test3);

        boolean test4 = isPalindrome(11212);
        System.out.println(test4);
    }

    public static boolean isPalindrome(int number) {
        //var to compare original number to
        int reverse = 0;
        //make a copy of the original number to a temp variable
        int temp = number;

        //while this condition is true, ie while 121 is not 0
        while (temp != 0) {
            //get the last value
            int lastDigit = temp % 10;
            //add it to reverse
            reverse = (reverse * 10) + lastDigit;
            //the last digit gets removed from temp, in each iteration
            //until temp is 0
            temp = temp / 10;
        }
        //which when the condition is met, check to see if the passed in parameter
        //is equal to our reversed var, if it is, return true!
        //if it's true, well then is a palindrome:
        return number == reverse;
    }
}
