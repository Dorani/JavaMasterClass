package Fundamentals_Foundations.Primitive_DataTypes;

public class FloatDoubleTypes {

    public static void main(String[] args) {
        //real numbers that we express with a decimal point 3.14159
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println(myMinFloat);
        System.out.println(myMaxFloat);
        //Precision refers to the format and amount of space occupied by the type
        //Single precision occupies 32 bites, width of 32, so double has 64 bits, thus
        //making a double way more precise with a much wider range
        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println(myMinDouble);
        System.out.println("my max " + myMaxDouble);



        //Quick practice:
        int myIntValue = 5 / 3;  // 1
        float myFloatValue = 5f /3f; // 1.6666666
        double myDoubleValue = 5d / 3d; //1.666666666666667

        System.out.println("My int value" + myIntValue);
        System.out.println("My float value" +myFloatValue);
        //in this case we recommend, double
        //faster to process on modern comps, with the chip level
        //java lib are often going to return double, due to precision
        System.out.println("My double value" +myDoubleValue);




        //Exercise, Kilogram converter:
        double numberOfPounds = 200d;
        double convertedKilos = numberOfPounds * 0.45359237d;
        //More precise using double:
        System.out.println("Converted Kilograms= " + convertedKilos);
    }
}
