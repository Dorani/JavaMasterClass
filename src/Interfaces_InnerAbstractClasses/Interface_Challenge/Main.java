package Interfaces_InnerAbstractClasses.Interface_Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //------create player-------//
        Player seif = new Player("seif", 100, 10);
        saveObject(seif);
        seif.setHitPoints(8);
        seif.setWeapon("Knife");
        saveObject(seif);
        loadObject(seif);
        System.out.println(seif);

        //------create monster-------//
        ISaveable wareWolf = new Monster("Warewolf", 120, 80);
        System.out.println(wareWolf);
        //in order to use getStrength() method we need to cast it:
        System.out.println( "Strength: " + ((Monster) wareWolf).getStrength());
        saveObject(wareWolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        //passing ISaveable as a param, so we can use any object that is implementing it
        //The cycle through using .write() => returning entire array list for each item, figuring out the size then going through
        for(int i = 0 ; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    //Load the data back
    public static void loadObject(ISaveable objectToLoad) {
        //create an array list, and readvalues
        ArrayList<String> values = readValues();
        //all objects that implement Isaveble
        objectToLoad.read(values);
    }

}
