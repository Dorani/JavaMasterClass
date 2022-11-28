package Control_Flow_Statements;

import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args) {
        //type input into the console, that gets returned
        //Scanner is one of the classes that allows us to read user input
        //We create a new instance of scanner, with the new keyword:

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");

        //check to see if the next input entered, will check to see if qualifies as an int
        //avoids type errors
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name: ");
            //read a line of input from the console
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;

            if(age >= 0  && age <= 100) {
                System.out.println("Your name is " + name + "," + " and you are " + age + " old.");
            } else {
                System.out.println("That is not a valid input");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }
        scanner.close();
    }
}
