package Algorithms.Algorithms_Intro;

public class DecimalComparator {
    public static void main(String[] args) {
        boolean test1 = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(test1);
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        if( (int)(number1 * 1000) == (int)(number2 * 1000)) {
            return true;
        }
        return false;
    }
}
