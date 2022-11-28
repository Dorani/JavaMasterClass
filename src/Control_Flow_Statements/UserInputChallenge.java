package Control_Flow_Statements;

import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args) {
        //Test:
         adder();
    }

    public static void adder() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }
}
