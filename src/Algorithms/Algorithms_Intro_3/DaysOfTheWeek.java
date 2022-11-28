package Algorithms.Algorithms_Intro_3;

public class DaysOfTheWeek {
    public static void main(String[] args) {

        //Switch approach
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

        //If Else Approach
        conditionalDayOfTheWeek(0);
        conditionalDayOfTheWeek(1);
        conditionalDayOfTheWeek(2);
        conditionalDayOfTheWeek(3);
        conditionalDayOfTheWeek(4);
        conditionalDayOfTheWeek(5);
        conditionalDayOfTheWeek(6);
        conditionalDayOfTheWeek(7);
    }

    private static void conditionalDayOfTheWeek(int day) {
        if(day == 0) {
            System.out.println("Sunday");
        } else if(day == 1) {
            System.out.println("Monday");
        } else if(day == 2) {
            System.out.println("Tuesday");
        } else if(day == 3) {
            System.out.println("Wednesday");
        } else if(day == 4) {
            System.out.println("Thursday");
        } else if(day == 5) {
            System.out.println("Friday");
        } else if(day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }

    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a day of the week");
                break;
        }
    }
}
