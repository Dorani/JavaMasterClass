package Algorithms.Algorithms_Intro_4;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        int test1 = sumFirstAndLastDigit(121);
        System.out.println(test1);

        int test2 = sumFirstAndLastDigit(252);
        System.out.println(test2);

        int test3 = sumFirstAndLastDigit(-10);
        System.out.println(test3);

        int test4 = sumFirstAndLastDigit(5);
        System.out.println(test4);

    }

    public static int sumFirstAndLastDigit(int number) {
        //validation 1
        if(number < 0) {
            return -1;
        } else {
          int firstNumber = 0;
          int lastNumber = number % 10;

          //keep dividing number by 10, until it is less than 10,
            //if it is, return the only int and assign it to firstNumber
          while(number >= 10){
              number = number /10;
              firstNumber = number;
          }
          //validation2
          if(firstNumber == 0) {
              firstNumber = lastNumber;
          }
          //return total:
          return firstNumber + lastNumber;
        }
    }
}
