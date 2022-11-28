package Algorithms.Algorithms_Intro_3;

public class SumOdd {

    public static void main(String[] args) {
        boolean isOddTester1 = isOdd(11);
        System.out.println(isOddTester1);

        int wholeTest = sumOdd(1, 100);
        System.out.println(wholeTest);

        int wholeTest2 = sumOdd(100, 100);
        System.out.println(wholeTest2);

        int wholeTest3 = sumOdd(13, 13);
        System.out.println(wholeTest3);

        int wholeTest4 = sumOdd(100, -100);
        System.out.println(wholeTest4);

        int wholeTest5 = sumOdd(100, 1000);
        System.out.println(wholeTest5);

    }

    public static boolean isOdd(int number) {
        if ((number < 0) || (number % 2 == 0)) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((start < 0 || end < 0 || start > end)) {
            return -1;
        } else if (start >= 0 && end >= 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        }
        return sum;
    }
}
