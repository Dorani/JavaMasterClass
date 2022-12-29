package Major_Review_Activities;

import java.util.Scanner;

public class FoundationsSix {
    public static void main(String [] args) {
        //First example:
//        System.out.println("First example - inputThenPrintSumAndAverage:  ");
//        inputThenPrintSumAndAverage();
//        System.out.println("---------------------------------------------------");

        //Second example:
        System.out.println("Second example - getBucketCount(3.4, 2.1, 1.5, 2):  ");
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));

        System.out.println("Overloaded example 1 - getBucketCount(2.75, 3.25, 1.5):  ");
        System.out.println(getBucketCount(2.75, 3.25, 1.5));
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
            //if number entered is an int, ie hasNextInt()
            if(isInt) {
                //take that number and add it to the sum var
                int number = scanner.nextInt();
                //calculate the average, ie,sum / counter
                sum += number;
                average = (double) sum / counter;
                average = Math.round(average);
                //round down the average with the Math.round() method
            } else {
                break;
            }
            // go to the next line with scanner.nextLine()
            scanner.nextLine();
        }
        //print out the sum and average while(false)
        System.out.println("SUM ="+" "+sum+" "+"AVG = "+""+(long)average);
        //close out the scanner instance
        scanner.close();
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        double initialBucketCount = 0;

        if(width <= 0 || height <= 0 || areaPerBucket <=0 || extraBuckets < 0) {
            return -1;
        }

        double wallArea = width * height;
        int totalBucketsNeeded = 0;
        initialBucketCount = (extraBuckets * areaPerBucket) ;

        while(initialBucketCount < wallArea) {
            initialBucketCount += areaPerBucket;
            totalBucketsNeeded++;
        }
        return totalBucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int numberOfTotalBucketsNeeded = 0;

        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double wallArea = width * height;
        numberOfTotalBucketsNeeded = (int) Math.ceil((wallArea / areaPerBucket));
        return numberOfTotalBucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        int numberOfBucketsNeeded = 0;

        if(area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        numberOfBucketsNeeded = (int) Math.ceil(area / areaPerBucket);
        return numberOfBucketsNeeded;
    }

}
