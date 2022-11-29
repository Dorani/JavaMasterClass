package Major_Review_Activities;

public class Foundations {

    public static void main(String[] args) {
        //First example:
        boolean check1 = shouldWeWakeUp(true,12);
        System.out.println("First example - shouldWeWakeUp:");
        System.out.println(check1);
        System.out.println("---------------------------------------------------");
        //Since functions returns void, we can not set an instance variable and invoke
        //You can only invoke
        //Second example:
        System.out.println("Second example - positiveNegativeZero:");
        positiveNegativeZero(12);
        System.out.println("---------------------------------------------------");

        //Check to see if 2 numbers past in have exact decimal places
        //we cast to int
        //Example: 3
        boolean checkDec = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println("Third example - areEqualByThreeDecimalPlaces:");
        System.out.println(checkDec);
        System.out.println("---------------------------------------------------");

        //Check to see if first 2 numbers sum to the 3rd
        //Example: 4
        boolean checkNumSum = hasEqualSum(1,2,3);
        System.out.println("Fourth example - checkNumSum");
        System.out.println(checkNumSum);
        System.out.println("---------------------------------------------------");

        //Convert KB to MB + remainder, void function
        //Example: 5
        printMegaBytesAndKiloBytes(12345);
        System.out.println("Fifth example - printMegaBytesAndKiloBytes");
        System.out.println("---------------------------------------------------");
    }
    //Test on data types, conditionals, and boolean functions
    public static boolean shouldWeWakeUp(boolean barking, int hourOfDay) {
        if((barking) && ((hourOfDay < 8 || hourOfDay > 22) && (hourOfDay >= 0 && hourOfDay <= 23))) {
            return true;
        }
        return false;
    }

    //Test on data types, integers, and void functions
    public static void positiveNegativeZero(int number) {
        if(number > 0) {
            System.out.println("positive");
        } else if( number < 0) {
            System.out.println("negative");
        } else if(number == 0) {
            System.out.println("zero");
        }
    }

    //Test on data types, doubles, and boolean functions
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if( (int) (num1 * 1000) == (int)(num2 * 1000)) {
            return true;
        }
        return false;
    }

    //Test on data types, integers, and boolean functions:
    public static boolean hasEqualSum(int num1, int num2, int num3) {
        if((num1 + num2) == num3) {
            return true;
        }
        return false;
    }

    //Test on data types, integers, conversions and void functions
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        long conversion = kiloBytes / 1024;
        long remainingKiloBytes = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + conversion
                + " MB and " + remainingKiloBytes+ " KB");
    }
}
