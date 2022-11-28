package Data_Structures.Arrays.Array_Challenges;
// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.
import java.util.Arrays;
import java.util.Scanner;

public class Array_Intro_Challenge {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] arr = getIntegers(5);
        int[] reversed = reverse(arr);
        System.out.println(Arrays.toString(reversed));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \n");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int[] printArray(int number) {
        int[] arrNumbers = getIntegers(number);
        for (int arrNumber : arrNumbers) {
            System.out.println(arrNumber);
        }
        return arrNumbers;
    }

    public static int[] reverse(int[] arr) {
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
}
