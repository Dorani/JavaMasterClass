package Fundamentals_Foundations.String_DataType;

public class FirstString {
    public static void main(String[] args) {
        //create a string with the String class type
        String myFirstString = "Steve is my name";
        System.out.println(myFirstString);
        //adding to the first string
        myFirstString = myFirstString + " and my last name is Dot";
        System.out.println(myFirstString);

        //add stringed numbers
        String myAge = "33";
        String yourAge = "22";
        //will add the strings together because the data types is still a string
        System.out.println("Our ages combined together is" + myAge+ yourAge);


        String yearOfBirth = "1987";
        int age = 33;
        //even if you add an int datatype with a string, it will be converted the int to a string
        System.out.println(yearOfBirth + age);


    }
}
