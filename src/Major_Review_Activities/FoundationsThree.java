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

        //Third example:
        System.out.println("Third example - Is Odd:");
        System.out.println(isOdd(3));
        System.out.println("Third example 2.0 - Sum Odd:");
        System.out.println(sumOdd(1, 100));
        System.out.println("---------------------------------------------------");

        //Fourth example:
        System.out.println("Fourth example - Sum Only up to 1000:");
        sumOnly();
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

    //Test on data types, conversions and maths, and boolean typed functions
    public static boolean isOdd(int number) {
        if(number < 0) return false;
        return number % 2 != 0;
    }
    //Test on data types, conversions and maths, function reuse, and int typed functions
    public static int sumOdd(int start, int end) {
        int sum = 0;
        if(end <= start && start < 0) {
            return -1;
        } else if(start >= 0 && end >= 0) {
            //iterate through the range
            for(int i = start; i <= end; i++){
                //check to see if number is odd
                if(isOdd(i)) {
                    //add to sum
                    sum += i;
                }
            }
        }
        return sum;
    }

    //Test on data types, conversions and maths, function reuse, and int typed functions
    public static void sumOnly() {
        int sum = 0;
        int count = 0;

        for(int i = 0; i < 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                count++;
                System.out.println("Found number: " + i);
            }
            if (count == 10) {
                break;
            }
        }
        System.out.println(sum);
    }

}
