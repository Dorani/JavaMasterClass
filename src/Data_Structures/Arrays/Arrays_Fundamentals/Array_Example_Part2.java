package Data_Structures.Arrays.Arrays_Fundamentals;

import java.util.Scanner;

public class Array_Example_Part2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i =0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \n");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] arr) {
        double total = 0;
        for (int value : arr) {
            total += value;
        }
        return (double)(total/ (arr.length));
    }
}
