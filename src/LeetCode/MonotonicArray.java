package LeetCode;

public class MonotonicArray {
    public static void main(String[] args) {
        //Cases that will succeed and return "true":
        int[] testerArr = {1,2,2,3};
        int[] testerArr1 = {5,4,4,3};
        System.out.println(isMonotonic(testerArr));
        System.out.println(isMonotonic(testerArr1));
        //Cases that will fail and return false:
        int[] testerArr2 = {1,5,2,3};
        int[] testerArr3 = {1,4,7,3};
        System.out.println(isMonotonic(testerArr2));
        System.out.println(isMonotonic(testerArr3));
    }

    public static boolean isMonotonic(int[] A) {
        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 0; i < A.length -1; i++) {
            if(A[i] > A[i+1]) {
                increasing = false;
            } else if(A[i] < A[i+1]) {
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }
}
