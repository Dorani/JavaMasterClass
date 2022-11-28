package Algorithms.Algorithms_Intro;

public class EqualSumChecker {
    public static void main(String[] args) {
        boolean test1 = hasEqualSum(1, 1, 1);
        System.out.println(test1);

        boolean test2 = hasEqualSum(1, 1, 2);
        System.out.println(test2);

        boolean test3 = hasEqualSum(1, -1, 0);
        System.out.println(test3);

    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        if((num1 + num2) == num3) {
            return true;
        }
        return false;
    }
}
