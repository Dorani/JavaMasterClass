package Data_Structures.Arrays.Lists;



import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    private static Scanner scanner = new Scanner(System.in);
    //creating an array list,
    //and the elements of the list will be of type String
    //then create a new List
    private final ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        //power of java to do the hard work, deciding where things are or where they go
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++) {
            //iterate through through the list and print the, and start from 1, and access a particular element using get(i)
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position > 0) {
            modifyGroceryItem(position, newItem);
        }
    }


    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position > 0) {
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
        //milk
        //cheese
        //bread
    }
    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
            if(position >= 0) {
                return true;
            }
            return false;
    }
    //the ability to query the array list and find an item
    private int findItem(String searchItem) {
        //simpler: return -1 if item exists or index number
        return groceryList.indexOf(searchItem);
        //will return a boolean, if the list contains a specified element.
        //this allows us to do a fast search for it, optimized by the writers of Java
        //boolean exists = groceryList.contains(searchItem);

        //now if we want to return the item we are searching for
        //searches the array, finds the item, returns the index position of the item
//        int position = groceryList.indexOf(searchItem);
//
//        //if it has found the element, then we return the contents back as the return data
//        //otherwise return null, no where to be found
//        if(position >= 0) {
//            return groceryList.get(position);
//        }
//        return null;
    }

}
