package Fundamentals_Foundations.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //declaring integer variable type with a value
        int myValue = 1000;
        //Taking it a step further and using the Integer (wrapper class) gives us ways to perform diff methods
        int myMinInt = Integer.MIN_VALUE;
        int myMaxInt = Integer.MAX_VALUE;

        //String concat to combine text and data
        System.out.println("Integer Min is: " + myMinInt);
        System.out.println("Integer Max is: " + myMaxInt);

        //Overflow demo, busted number, outside range allocated for an integer, so it turns negative.
        System.out.println("Busted Integer Max is: " + myMinInt + 1);
        //Underflow demo, busted number, outside range allocated for an integer, so it turns positive.
        System.out.println("Busted Integer Max is: " + myMaxInt + 1);

        //New datatype, Byte -128, 127 range, maybe if we have a lot of numbers in that range, and we want to save memory:
        //Modern computers can handle bigger data types, we don't necessarily need to use this in our modern day and age
        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println("Byte Min Value: " + myMinByte);
        System.out.println("Byte Max Value: " + myMaxByte);

        //New DataType Short, the range is -32768, 32767
        //How much space it takes up in memory
        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        System.out.println("Short Min Value: " + myMinShort);
        System.out.println("Short Max Value: " + myMaxShort);

        //New DataType Long
        //Double the width of an Integer, 63bit as opposed to the 32bit Integer range
        //The range is significantly larger
        long myLongValue = 100L;
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println("Long Min Value: " + myMinLong);
        System.out.println("Long Max Value: " + myMaxLong);

        //Casting:
        //Told Java to treat this value following the (byte) as a byte
        byte myNewByteValue = (byte) (myMinShort / 2);
    }
}

