package Algorithms.Algorithms_Intro_5;


import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average = 0.0;
        int counter = 0;

        while(true) {
            System.out.println("Enter number: ");
            counter++;
            boolean isInt = scanner.hasNextInt();
            if(isInt) {
                int number = scanner.nextInt();
                sum += number;
                average = (double) sum / counter;
                average = Math.round(average);
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM ="+" "+sum+" "+"AVG = "+""+(long)average);
        scanner.close();
    }
}
