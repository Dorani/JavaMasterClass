package Algorithms.Algorithms_Intro;

public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean hasTeenTest1 = hasTeen(9, 99, 19);
        System.out.println(hasTeenTest1);

        boolean hasTeenTest2 = hasTeen(23, 15, 42);
        System.out.println(hasTeenTest2);

        boolean hasTeenTest3 = hasTeen(22, 23, 34);
        System.out.println(hasTeenTest3);


        System.out.println("----------------------------");
        boolean isTeenTest = isTeen(9);
        boolean isTeenTest2 = isTeen(13);
        System.out.println(isTeenTest);
        System.out.println(isTeenTest2);
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
       if(isTeen(age1) || isTeen(age2) || isTeen(age3)) {
           return true;
       }
       return false;
    }

    public static boolean isTeen(int age) {
        if (age >= 13 && age <= 19) {
            return true;
        }
        return false;
    }
}
