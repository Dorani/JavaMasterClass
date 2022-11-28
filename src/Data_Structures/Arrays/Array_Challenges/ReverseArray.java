package Data_Structures.Arrays.Array_Challenges;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] reversedArr = reverseArray(arr);
        System.out.println(Arrays.toString(reversedArr));
    }

    private static int[] reverseArray(int[] arr) {
        int maxIndex = arr.length -1;
        int halfLength = arr.length /2;

        for(int i =0; i < halfLength; i++) {
            int temp = arr[i];
            arr[i] = arr[maxIndex-i];
            arr[maxIndex-i] = temp;
        }
        return arr;
    }

}
