package Data_Structures.Arrays.ListsChallenge;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //Expose public static record, to create a new Contact record.
    //created without creating a new obj instance for this class
    //it accepts 2 params, and we return a new contact record
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
