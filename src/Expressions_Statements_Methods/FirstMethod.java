package Expressions_Statements_Methods;

public class FirstMethod {

    public static void main(String[] args) {
        //Call the calculateScore method in the main method
        //Keep in mind, you can create vars in the main method, and pass them as arguments into calcScore

        //We can assign a var to a method call with arguments in it, like an instance
        int firstScore = calculateScore(true, 800, 5, 100);
        System.out.println("your final score was " + firstScore);

        int secondScore = calculateScore(true, 10000, 8, 200);
        System.out.println("your final score was " + secondScore);

    }

    //New method, for reusability of above code during invocation
    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}


