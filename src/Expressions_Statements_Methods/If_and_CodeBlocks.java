package Expressions_Statements_Methods;

public class If_and_CodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelComplete = 5;
        int bonus = 100;

        //Basic If, alternatively for If statements with one code block, you can get rid of brackets
        //But for readability, just keep it bruh..
        if(score == 5000) {
            System.out.println("Your score is 5000");
        }

        //Now working with else statements, ie otherwise if this does not work, then..
        if(score < 5000) {
            System.out.println("Your score is 5000");
        } else {
            System.out.println("Your was less!");
        }

        //Else if, in case there are more conditions:
        //Now working with else statements, ie otherwise if this does not work, then..
        if(score < 5000 && score > 50) {
            System.out.println("Your score is 5000");
        } else if (score < 100) {
            System.out.println("Your was less!");
        } else {
            System.out.println("fine..");
        }


        //Create a var in the code block
        //Also able to access var declared outside
        //However, we can't access variables created in the code block, outside of that scope:
        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 1000;
            System.out.println("your final score was " + finalScore);
        }
    }
}



