package Data_Structures.Arrays.Array_Challenges;


import java.util.Scanner;

public class MinElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("Min is: " + (returnedMin));
    }

    private static int[] readIntegers(int count) {
        int[] arr = new int[count];
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            arr[i] = number;
        }
        return arr;
    }

    public static int findMin(int[] array) {
        //make the min value equal to the highest value an int can hold,
        // then compare that to the value of each element of the array
        //if the value is less, make the min reflect that,
        // then keep looping till the min is returned
        int min = Integer.MAX_VALUE;

        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
