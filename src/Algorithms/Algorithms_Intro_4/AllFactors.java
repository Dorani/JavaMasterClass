package Algorithms.Algorithms_Intro_4;

public class AllFactors {
    public static void main(String[] args) {
        printFactors(45);

    }

    public static void printFactors(int number) {
        if(number < 1) {
            System.out.println("Invalid Value");
        } else {
            for(int x = 1; x <= number; x++){
                if(number % x == 0) {
                    System.out.println(x);
                }
            }
        }
    }
}
