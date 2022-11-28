package MethodOverloading;

public class ScoreBoard {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("The new score is " + newScore);

        //To use the overloaded method:
        calculateScore(500);

        //3rd overloaded method:
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored" + score + " points");
        return score;
    }
    //overload method, if we change the number of parameters, it makes it a unique method
    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }
}
