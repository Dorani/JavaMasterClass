package Data_Structures.Arrays.Arrays_Fundamentals;

public class ArrayExample {
    public static void main(String[] args) {
        //declaring new data type of array of type integer with 10 elements
        //int[] newArray = new int[10];

        //or you can hard code the elements into the data type:
        //int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        //System.out.println(myIntArray[5]);


        //More efficient way to do it all:
        int[] newArray = new int[10];
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = i * 10;
        }
        printArray(newArray);
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " value is " + arr[i]);
        }
    }
}
