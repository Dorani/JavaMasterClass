package Major_Review_Activities;

import java.util.Scanner;

public class FoundationsSix {
    public static void main(String [] args) {

    }


    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double average = 0;

        int counter = 0;

        while(true) {
            System.out.println("Please enter a number that will be summed to the next, then averaged");
            counter++;
            boolean isInt = scanner.hasNextInt();
            //if number entered is an int

                //take that number and add it to the sum var

                //calculate the average, ie,sum / counter

                //round down the average with the Math.round() method

            // else

                //break the if

            // go to the next line with scanner.nextLine()

            //print out the sum and average while(false)
            //close out the scanner instance
        }

    }
}
