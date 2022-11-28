package Algorithms.Algorithms_Intro;

public class LeapYearCalc {
    public static void main(String[] args) {
        boolean test1 = isLeapYear(2000);
        System.out.println(test1);
        boolean test2 = isLeapYear(1600);
        System.out.println(test2);
        boolean test3 = isLeapYear(2017);
        System.out.println(test3);
    }

    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        } else if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
