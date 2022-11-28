package Fundamentals_Foundations.Ternary_Conditions;

public class TernaryOperator {

    public static void main(String[] args) {
        //1st ternary - short cut to if, else statement
        //first we have a condition
        int ageOfClient = 20;
        //eval out condition using ternary operators:
        // if ageOfClient is == 20
            // assign isEighteenOrOver to be true
            // otherwise (else) make it false
        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
        if(isEighteenOrOver) {
            System.out.println("The age is over");
        }
    }
}
