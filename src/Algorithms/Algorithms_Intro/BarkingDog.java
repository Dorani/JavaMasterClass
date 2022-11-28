package Algorithms.Algorithms_Intro;

public class BarkingDog {
    public static void main(String[] args) {
        boolean check1 = shouldWakeUp(true, 1);
        System.out.println(check1);
        boolean check2 = shouldWakeUp(false, 2);
        System.out.println(check2);
        boolean check3 = shouldWakeUp(true, 8);
        System.out.println(check3);
        boolean check4 = shouldWakeUp(true, -1);
        System.out.println(check4);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if ((barking) && ((hourOfDay < 8 || hourOfDay > 22) && (hourOfDay >= 0 && hourOfDay <= 23))){
            return true;
        }
        return false;
    }
}

