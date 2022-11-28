package Fundamentals_Foundations.Conditionals;

public class Conditions {

    public static void main(String[] args) {
        //assignment operator, 1 equal sign
        boolean isAlien = true;
        //2 equal signs, testing to see if the particular value is false
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        } else {
            System.out.println("It's not.....");
        }


        //Another example:
        boolean isStudent = true;

        if (!isStudent) {
           System.out.println("You are not a student!");
        } else {
            System.out.println("You are welcome to study!");
        }
    }
}
