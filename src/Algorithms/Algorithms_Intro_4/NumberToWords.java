package Algorithms.Algorithms_Intro_4;

public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(100);
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }
        if(number == 0) {
            System.out.println("Zero");
        } else {
            int reversedNumber = reverse(number);
            int zeros = getDigitCount(number) - getDigitCount(reversedNumber);
            while(reversedNumber > 0 ) {
                int lastDigit = reversedNumber % 10;
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;

                    case 1:
                        System.out.println("One");
                        break;

                    case 2:
                        System.out.println("Two");
                        break;

                    case 3:
                        System.out.println("Three");
                        break;

                    case 4:
                        System.out.println("Four");
                        break;

                    case 5:
                        System.out.println("Five");
                        break;

                    case 6:
                        System.out.println("Six");
                        break;

                    case 7:
                        System.out.println("Seven");
                        break;

                    case 8:
                        System.out.println("Eight");
                        break;

                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversedNumber = reversedNumber / 10;
            }
            while(zeros > 0) {
                System.out.println("Zero");
                zeros--;
            }
        }
    }

    public static int reverse(int number) {
        int reversed = 0;
        while(number != 0) {
            reversed = reversed * 10;
            reversed += number % 10;
            number = number / 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        } else {
            int count = 0;
            if(number == 0) {
                count = 1;
            }
            while(number > 0) {
                count++;
                number = number / 10;
            }
            return count;
        }
    }
}




//---------------Test For Other Methods:-------------------------//
//Test second method to reverse a number;
//int test1 = reverse(23);
//System.out.println(test1);

//Test third method:
//int test3 = getDigitCount(100);
//System.out.println(test3);
//--------------------------------------------------------------------