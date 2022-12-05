package Major_Review_Activities;

public class FoundationsTwo {
    public static void main(String[] args) {
        //First example:
        //Working with formulas and overloading methods
        //Ie: same method name, different parameters, diff body of functionality
        System.out.println("First example - Area Calculation:");
        double areaOfCircle = area(5.0);
        System.out.println("The area of the circle is: " + areaOfCircle);
        double areaOfRectangle = area(5,5);
        System.out.println("The area of the rectangle is: " + areaOfRectangle);
        System.out.println("---------------------------------------------------");

        //Second example:
        //Working with equality formulas
        System.out.println("Second example - PrintEqual Calculation:");
        printEqual(1, 2, 3);
        System.out.println("---------------------------------------------------");

        //Third example:
        //Working with conversions formulas
        System.out.println("Third example - PrintYearsAndDays Calculation:");
        printYearsAndDays(561600);
        System.out.println("---------------------------------------------------");

        //Fourth example:
        //Working with conditions and booleans
        System.out.println("Fourth example - isCatPlaying Calculation:");
        System.out.println(isCatPlaying(false, 35));
        System.out.println("---------------------------------------------------");
    }
    //Test on data types, conditionals, and double typed functions
    public static double area(double radius) {
        if(radius < 0) {
            return -1;
        }
        return (radius * radius) * Math.PI;
    }
    //Test on data types, conditionals, and double typed Overloaded functions
    public static double area(double length, double width) {
        if(length < 0 || width < 0) {
            return -1;
        }
        return length * width;
    }

    //Test on data types, compare between inputs, void functions
    public static void printEqual(int num1, int num2, int num3) {
        if(num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid Text");
        } else if((num2 == num3) && (num1 == num3)) {
            System.out.println("All numbers are equal");
        } else if((num1 != num2) && (num2 != num3 )&& (num1 != num3)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    //Test on data types, formulas, void functions
    @SuppressWarnings("IntegerDivisionInFloatingPointContext")
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int years;
            years = Math.round((minutes /365) / 60 / 24);
            long days = ((minutes / 60) / 24) % 365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

    //Test on data types, conditionals, boolean typed functions
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean isPlaying = false;
        if((summer) && (temperature <=45) && (temperature >=25)) {
            return true;
        } else if((!summer) && (temperature <=35) && (temperature >=25)) {
            return true;
        } else {
            return false;
        }
    }
}
