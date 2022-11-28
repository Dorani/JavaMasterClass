package Data_Structures.Arrays.ListsChallenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("000666444");

    public static void main(String[] args) {
        //Initialize the Phone:
        boolean quit = false;
        startPhone();
        printActions();

        while(!quit) {
            System.out.println("Please enter an action that you would like to take");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("System is shutting down");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("contact not found");
            return;
        }
        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);

        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("success!");
        } else {
            System.out.println("error updating");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("contact not found");
            return;
        }
       if(mobilePhone.removeContact(existingContactRecord)) {
           System.out.println("successfully deleted record");
       } else {
           System.out.println("Error deleting record");
       }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("contact not found");
            return;
        }
        //to confirm we retrieved the queried info
        System.out.println("Name: " + existingContactRecord.getName() + " phone number" + existingContactRecord.getPhoneNumber());
    }


    private static void addNewContact() {
        System.out.println("Enter new contact into your phone list: ");
        String name = scanner.nextLine();
        System.out.println("Add new phone number for " + name);
        String number = scanner.nextLine();

        Contact newContact = Contact.createContact(name,number);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("Added " + newContact + " to your phone list");
        } else {
            System.out.println("This person already exists");
        }
    }

    private static void startPhone() {
        System.out.println("Phone is up and running!");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print contacts\n" +
                "2  - to add a new contact\n" +
                "3  - to update existing contact\n" +
                "4  - to remove an existing contact\n" +
                "5  - query if an existing contact exists\n" +
                "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}
