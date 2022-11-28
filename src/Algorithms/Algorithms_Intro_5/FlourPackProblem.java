package Algorithms.Algorithms_Intro_5;

public class FlourPackProblem {
    public static void main(String[] args) {

        boolean test1 = canPack(1, 0, 4);
        System.out.println("Test 1 is: " + test1);

        boolean test2 = canPack(1, 0, 5);
        System.out.println("Test 2 is: " + test2);

        boolean test3 = canPack(0,5,4);
        System.out.println("Test 3 is: " + test3);

        boolean test4 = canPack(2,2,11);
        System.out.println("Test 4 is: " + test4);

        boolean test5 = canPack(-3,2,12);
        System.out.println("Test 5 is: " + test5);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
      if((bigCount < 0 )|| (smallCount < 0) || (goal < 0)) {
          return false;
      }
          for(int x = 0; x <= smallCount; x++) {
              for(int y = 0; y <= bigCount; y++) {
                  if(((y * 5) + x) == goal) {
                      return true;
                  }
              }
          }
          return false;
      }
}
