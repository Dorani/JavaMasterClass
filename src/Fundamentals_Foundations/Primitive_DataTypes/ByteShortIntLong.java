package Fundamentals_Foundations.Primitive_DataTypes;//--------------------------------------------------------------------------
//Primitive Datatype challenge

public class ByteShortIntLong {
    public static void main(String[] args) {
        //declare a byte, short and int
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);
        //Cast to short
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println(shortTotal);
    }
}