package LeetCode;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String[] str = {"h","e","l","l","o"};
        String[] reversed = reverseString(str);
        System.out.println(Arrays.toString(reversed));

        //another way
        char[] javaCharArray = {'r', 's', 't', 'u', 'v'};
        System.out.println(reverseString(javaCharArray));
    }
    //function that takes in an array of Chars
        //function returns an array of reversed Chars

//    Example 1:
//    Input: ["h","e","l","l","o"]
//    Output: ["o","l","l","e","h"]

    public static String[] reverseString(String[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            String tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
        return s;
    }

    //another solution
    public static char[] reverseString(char[] s) {
        char temp;
        int len = s.length;
        for(int i = 0; i < len / 2; i++) {
            temp = s[i];
            s[i] = s[len - 1 - i];
            s[len - 1 - i] = temp;
        }
        return s;
    }
}
