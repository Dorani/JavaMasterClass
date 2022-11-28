package Fundamentals_Foundations.Conditionals;

public class MultipleConditions {

    public static void main(String[] args) {
        int topScore = 100;

        if (topScore == 100) {
            System.out.println("You got the high score!");
        }
        //not equal to 100
        if (topScore != 100) {
            System.out.println("You got the high score!");
        }
        //is the var greater than 100
        if (topScore > 100) {
            System.out.println("You got the high score!");
        }

        //is the var greater than OR == 100
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        //is the var less than 100
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        //is the var less than OR == 100
        if (topScore <= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        //Logical and operator
        //Both have to be set to true to return
        //AND OPERATOR, requires both operand conditions to be true:
        if((topScore > secondTopScore) && (topScore <= 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        //OR operator, only requires on operand to be true:
        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true.");
        }

        //understanding assignment operators, so here is ==
        //now we can correctly compare values

        int newExample = 50;
        if (newExample == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        //short for if (isCar == true)
        if (isCar) {
            System.out.println("this is not supposed to happen");
        }
    }
}
