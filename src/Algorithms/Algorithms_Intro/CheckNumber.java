package Algorithms.Algorithms_Intro;

public class CheckNumber {

    public static void main(String[] args) {
        positiveNegativeZero(4);
        positiveNegativeZero(0);
        positiveNegativeZero(-4);
    }

    public static void positiveNegativeZero(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else if (number == 0) {
            System.out.println("Zero");
        }
    }
}
