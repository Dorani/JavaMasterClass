package Data_Structures.Arrays.ListsChallenge;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    //Create an ArrayList of contracts, pass in the class.
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        //initialize the ArrayList contacts in our Mobile class
        this.myContacts = new ArrayList<Contact>();
    }
    //whether our contacts have been added successfully
    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on File");
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }

    private int findContact(Contact contact) {
        //return an int, showing the element in the array for that particular contact obj
        return this.myContacts.indexOf(contact);
    }

    //search for old, and replace with new contact
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        } else if(findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name" + newContact.getName() + " already exists");
            return false;
        } else {
            this.myContacts.set(foundPosition, newContact);
            System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
            return true;
        }
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if(foundPosition < 0) {
            System.out.println(contact.getName() + " was not found");
            return false;
        } else {
            this.myContacts.remove(foundPosition);
            System.out.println(contact.getName() + " was removed.");
            return true;
        }
    }

    private int findContact(String contactName) {
        //accepts string
        //loop through all records, extract name, compare it to the name passed and return the index position
        for(int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position > 0) {
            return this.myContacts.get(position);
        } else {
            return null;
        }
    }


    public void printContacts() {
        System.out.println("Contact List");
        for(int i=0; i<this.myContacts.size(); i++) {
            System.out.println((i+1) + "." +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }

    }
}
