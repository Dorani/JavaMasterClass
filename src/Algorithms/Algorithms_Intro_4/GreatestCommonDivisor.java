package Algorithms.Algorithms_Intro_4;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int test1 = getGreatestCommonDivisor(25, 15);
        System.out.println(test1);

        int test2 = getGreatestCommonDivisor(12, 30);
        System.out.println(test2);

        int test3 = getGreatestCommonDivisor(9, 18);
        System.out.println(test3);

        int test4 = getGreatestCommonDivisor(81, 153);
        System.out.println(test4);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        } else {

            int maxNumber = 0;
            int minNumber = 0;
            int greatestCommonDiv = 0;

            if(first <= second) {
                maxNumber = second;
                minNumber = first;
            } else {
                maxNumber = first;
                minNumber = second;
            }
            for (int x = 1; x <= minNumber; x++) {
                if((minNumber % x == 0) && (maxNumber % x ==0)){
                  greatestCommonDiv = x;
                }
            }
            return greatestCommonDiv;
        }
    }
}
