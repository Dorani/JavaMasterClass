package Algorithms.Algorithms_Intro_4;

public class EvenDigitSum {
    public static void main(String[] args) {
        int test1 = getEvenDigitSum(252);
        System.out.println(test1);

        int test2 = getEvenDigitSum(123456789);
        System.out.println(test2);
    }

    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }
        int sum = 0;
        while(number > 0) {
            //extract the remainder value, as long as number > 0
            int remainder = number % 10;
            //if the first remainder value is evenly divisible by 2
            if (remainder % 2 == 0) {
                //add it to the sum variable
                sum += remainder;
            }
            //keep dividing it by 10, and loop the process of checking the remainder
            //until number <= 0
            number /= 10;
        }
        //return the total value all all evenly added values
        return sum;
    }
}
