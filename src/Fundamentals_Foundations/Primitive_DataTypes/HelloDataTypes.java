package Fundamentals_Foundations.Primitive_DataTypes;

public class HelloDataTypes {
    public static void main (String[] args) {
        System.out.println("Hello World");

        //Declare var with data type of Integer, use operators
        int myFirstVar = (5 + 5) + (2 * 10);
        int mySecondNum = 12;
        int myThirdNum = 33;
        int myTotal = myFirstVar + mySecondNum + myThirdNum;
        //Print the total statement to our console
        System.out.println("The total is: " + myTotal);
        //Last Var with sub operator
        int myLastOne = 1000 - myTotal;
        System.out.println("The last is a subtraction: " + myLastOne);
    }
}



