package Algorithms.Algorithms_Intro_5;

public class PaintJob {
    public static void main(String[] args) {
                                //Method 1 test:
        int test1 = getBucketCount(3.4, 2.1, 1.5, 2);
        System.out.println(test1);

        int test2 = getBucketCount(2.75, 3.25, 2.5, 1);
        System.out.println(test2);

        int test9 = getBucketCount(0.0,2.1,1.5,7);
        System.out.println(test9);

        System.out.println("----------------------------------------------------------------");

                                //Method 2 test:
        int test3 = getBucketCount(-3.4, 2.1, 1.5);
        System.out.println(test3);

        int test4 = getBucketCount(3.4, 2.1, 1.5);
        System.out.println(test4);

        int test5 = getBucketCount(7.25, 4.3, 2.35);
        System.out.println(test5);

        System.out.println("----------------------------------------------------------------");

                                //Method 3 test:
        int test6 = getBucketCount(3.4, 1.5);
        System.out.println(test6);

        int test7 = getBucketCount(6.26, 2.2);
        System.out.println(test7);

        int test8 = getBucketCount(3.26, 0.75);
        System.out.println(test8);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        int numberOfBuckets = 0;
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets <= 0) {
            return -1;
        } else {
            double area = height * width;
            numberOfBuckets = (int) Math.ceil((area / areaPerBucket));
            if(extraBuckets > 0) {
                numberOfBuckets = (numberOfBuckets - extraBuckets);
            }
        }
        return numberOfBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        //quick reusable way on line 57:
        //return getBucketCount(width, height, areaPerBucket, 0);
        int numberOfBuckets = 0;
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double area = height * width;
            numberOfBuckets = (int) Math.ceil((area / areaPerBucket));
        }
        return numberOfBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        //quick reusable way on line 70:
        //return getBucketCount(1, area, areaPerBucket, 0);
        int numberOfBuckets = 0;
        if(area <= 0 || areaPerBucket <= 0 ) {
            return -1;
        } else {
            numberOfBuckets = (int) Math.ceil((area / areaPerBucket));
        }
        return numberOfBuckets;
    }
}
