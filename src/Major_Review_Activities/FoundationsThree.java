package Major_Review_Activities;

public class FoundationsThree {

    public static void main(String[] args) {
        //First example:
        System.out.println("First example - printDayOfTheWeek:");
        printDayOfTheWeek(4);
        System.out.println("---------------------------------------------------");

        //Second example:
        System.out.println("Second example - printDayOfTheWeek:");
        System.out.println("The Sum of digits in the number 125 is " + sumDigits(125));
        System.out.println("---------------------------------------------------");
    }


    //Test on data types, conversions, and void typed functions
    //Using enhanced switch statement
    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
        }
    }

    //Test on data types, conversions, and void typed functions
    public static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digits = number % 10;
            System.out.println(digits);
            sum += digits;
            number /= 10;
        }
        return sum;
    }
}
