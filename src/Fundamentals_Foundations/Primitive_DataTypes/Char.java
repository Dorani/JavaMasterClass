package Fundamentals_Foundations.Primitive_DataTypes;

public class Char {
    public static void main (String[] args) {
        //last key, char can only capture one single key stroke
        //store data in arrays as well
        //single character store
        //in terms of storage, occupies 2 bytes, so 16 bits, ie width of 16
        //allows us to store unicode as well

        //First Fundamentals_Foundations.Conditionals.Primitive_DataTypes.Char
        char myChar = 'D';
        // the front slash tells the java compiler, we are using unicode
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);


    }
}
