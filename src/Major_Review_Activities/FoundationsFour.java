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
    }

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
}
