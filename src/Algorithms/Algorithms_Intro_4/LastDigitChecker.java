package Algorithms.Algorithms_Intro_4;

public class LastDigitChecker {
    public static void main(String[] args) {
        boolean firstTest = hasSameLastDigit (41, 22, 71);
        System.out.println(firstTest);

        boolean secondTest = hasSameLastDigit (23, 32, 42);
        System.out.println(secondTest);

        boolean thirdTest = hasSameLastDigit (9, 99, 999);
        System.out.println(thirdTest);

    }
    //Solution1:
    public static boolean isValid(int number) {
        if(number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if(isValid(number1) && isValid(number2) &&isValid(number3)) {
            int remainder1 = number1 % 10;
            int remainder2 = number2 % 10;
            int remainder3 = number3 % 10;
            if(remainder1 == remainder2 || remainder2 == remainder3 || remainder1 == remainder3) {
                return true;
            }
            return false;
        }
        return false;
        }
    }


//------------------------------Solution 2-----------------------------------------//


//    public static boolean isValid(int number1, int number2, int number3) {
//        if((number1 >= 10 && number1 <= 1000) && (number2 >= 10 && number2 <=1000) && (number3 >= 10 && number3 <= 1000)) {
//            return true;
//        }
//        return false;
//    }


//    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
//        if(isValid( number1, number2, number3)){
//            int remainder1 = number1 % 10;
//            int remainder2 = number2 % 10;
//            int remainder3 = number3 % 10;
//            if(remainder1 == remainder2 || remainder2 == remainder3 || remainder1 == remainder3) {
//                return true;
//            }
//            return false;
//        }
//        return false;
//    }

//-----------------------------------------------------------------------------------//