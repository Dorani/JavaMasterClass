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

        //Third example:
        System.out.println("Third example - getEvenDigitSum: 2345, 2+4:");
        System.out.println(getEvenDigitSum(2345));
        System.out.println("---------------------------------------------------");

        //Fourth example:
        System.out.println("Fourth example - hasSharedDigit: 12, 32:");
        System.out.println(hasSharedDigit(12, 32));
        System.out.println("---------------------------------------------------");

        //Fifth example:
        System.out.println("Fifth example - hasSameLastDigit: 41, 22, 71:");
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println("---------------------------------------------------");

        //Sixth example:
        System.out.println("Sixth example - Print Factors: 10:");
        printFactors(10);
        System.out.println("---------------------------------------------------");

        //Seventh example:
        System.out.println("Seventh example - getGreatestCommonDivisor: 15, 25");
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println("---------------------------------------------------");

        //Eighth example:
        System.out.println("Eighth example - isPerfectNumber: 6");
        System.out.println(isPerfectNumber(6));
        System.out.println("---------------------------------------------------");

        //Ninth example:
        System.out.println("Ninth example - numberToWords: 123");
        numberToWords(123);
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

    //Function that extracts all even digits from a number and sums them up
    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }
        int sum = 0;
        while(number > 0) {
            int remainder = number % 10;
            if(remainder % 2 == 0) {
                sum += remainder;
            }
            number = number / 10;
        }
        return sum;
    }

    //Function that checks if two numbers have shared common digits
    public static boolean hasSharedDigit(int number1, int number2) {
        if((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) {
            int value = number1 % 10;
            number1 = number1 / 10;

            int value2 = number2 % 10;
            number2 = number2 /10;

            if((number1 == number2) || (value == value2) || (value == number2) || (value2 == number2)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    //Helper Function that checks conditions of passed parameters
    public static boolean isValid(int number) {
        if(number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }

    //Function that checks if at least two numbers share the same last digit
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            int value1 = num1 % 10;
            int value2 = num2 % 10;
            int value3 = num3 % 10;

            if(value1 == value2 || value1 == value3 || value2 == value3) {
                return true;
            }
            return false;
        }
        return false;
    }

    //Function that prints all factors of a given number passed in
   public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for(int i = 1; i <= number; i++) {
                if(number % i == 0) {
                    System.out.println(i);
                }
            }
        }
   }

    //Function that will print out the highest common divisor between 2 numbers
   public static int getGreatestCommonDivisor(int number1, int number2) {
        if(number1 < 10 || number2 < 10) {
            return -1;
        } else {
            int maxNumber = 0;
            int minNumber = 0;
            int greatestCommonDivisor = 0;

            if (number1 > number2) {
                maxNumber = number1;
                minNumber = number2;
            } else {
                maxNumber = number2;
                minNumber = number1;
            }
            for(int i = 1; i <= minNumber; i++) {
                if((minNumber % i == 0) && (maxNumber % i == 0)) {
                    greatestCommonDivisor = i;
                }
            }
            return greatestCommonDivisor;
        }
   }

    //Function that will determine whether a number is perfect, ie an:
    //integer which is equal to the sum of its proper positive divisors.
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if(number < 1) {
            return false;
        } else {
           for(int i = 1; i < number; i++) {
              if(number % i == 0) {
                  sum += i;
              }
           }
        }
        return sum == number;
    }

    public static void numberToWords(int number) {
        int lastDigit = 0;
        if (number < 0) {
            System.out.println("Invalid Input");
        }
        if (number == 0) {
            System.out.println("Zero");
        } else {
            int reversedNumber = reverse(number);
            while(reversedNumber > 0) {
                lastDigit = reversedNumber % 10;
                switch (lastDigit) {
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println("Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    case 9 -> System.out.println("Nine");
                }
                reversedNumber = reversedNumber /10;
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

}
