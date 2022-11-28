package Algorithms.Algorithms_Intro_3;

public class SumThreeFive {

    public static void main(String[] args) {
        sum();
    }

    public static void sum() {
        int sum = 0;
        int count = 0;

        for(int i = 1; i < 1000; i++){
          if((i % 3 == 0) && (i % 5 == 0)) {
              count++;
              sum += i;
              System.out.println("Found number: " + i);
          }
              if(count == 5) {
                      break;
                }
          }
            System.out.println("Sum = " + sum);
    }
}
