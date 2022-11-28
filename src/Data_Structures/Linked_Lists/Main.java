package Data_Structures.Linked_Lists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //An example as to why we use linked Lists:
        Intro_Customer customerOne = new Intro_Customer("seif", 56.987);
        Intro_Customer customerTwo = new Intro_Customer("", 0.000);

        customerOne = customerTwo;
        customerTwo.setBalance(12.18);
        System.out.println("Balance for customer: " + customerOne.getName() + "is " + customerOne.getBalance());


        //-------------------//
        //Another example:

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(4);
        intList.add(8);

        for(int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
        //insert into index 1, the value of 2
        intList.add(1,2);
        //in order for the above to be inserted, the other entries need to move down.
        //not a problem for a small batch of records
        for(int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
