package Algorithms.Algorithms_Intro_5;

public class DiagonalStar {

    public static void main(String[] args) {
        //tests complete
        printSquareStar(5);
        printSquareStar(2);
    }

    public static void printSquareStar(int number) {
        if(number < 5) {
            System.out.println("Invalid Value");
        } else {
            String star = "*";
            String space = " ";

            for(int x = 1; x <= number; x++) {
                for(int y = 1; y <= number; y++){
                    if(x == y || x == 1 || y == 1 || x == number || y == number|| y == number - x+1 ) {
                        System.out.print(star);
                    } else {
                        System.out.print(space);
                    }
                }
                System.out.println();
            }
        }
    }
}
