package Algorithms.Algorithms_Intro_4;

public class SharedDigit {
    public static void main(String[] args) {
       boolean test1 = hasSharedDigit(12,23);
        System.out.println(test1);

        boolean test2 = hasSharedDigit(9, 99);
        System.out.println(test2);

        boolean test3 = hasSharedDigit(15, 55);
        System.out.println(test3);

    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <=99)) {
            int value1 = number1 % 10;
            number1 = number1 / 10;

            int value2 = number2 % 10;
            number2 = number2 / 10;

            if ((number1 == number2) || (value1 == number2) || (value2 == number1) || (value1 == value2)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
