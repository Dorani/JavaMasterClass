package Major_Review_Activities;

import java.util.Scanner;

public class FoundationsSix {
    public static void main(String [] args) {
        //First example:
        System.out.println("First example - canPack: bigCount:2, smallCount:4, Goal: 9  ");
        inputThenPrintSumAndAverage();
        System.out.println("---------------------------------------------------");
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
            //if number entered is an int, ie hasInt()
            if(isInt) {
                //take that number and add it to the sum var
                int number = scanner.nextInt();
                //calculate the average, ie,sum / counter
                sum += number;
                average = Math.round(sum / counter);
                //round down the average with the Math.round() method
            } else {
                break;
            }
            // go to the next line with scanner.nextLine()
            scanner.nextLine();
        }
        //print out the sum and average while(false)
        //close out the scanner instance
        System.out.println("The SUM: " + sum + " and the Average: " + average);
    }
}
