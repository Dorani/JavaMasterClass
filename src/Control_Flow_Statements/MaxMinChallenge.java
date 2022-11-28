package Control_Flow_Statements;

import java.util.Scanner;

public class MaxMinChallenge {
    public static void main(String[] args) {
        //invoke
        maxMin();
    }

    public static void maxMin() {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;
        boolean first = true;

        while(true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();

                if(first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if(number > max) {
                    max = number;
                }

                if(number < min) {
                    min = number;
                }

            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min = " + min + " and max = " + max);
        scanner.close();
    }
}
