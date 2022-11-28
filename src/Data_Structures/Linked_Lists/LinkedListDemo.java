package Data_Structures.Linked_Lists;



import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbournne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Cannberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");

        addInOrder(placesToVisit, "Darwin");

        printList(placesToVisit);
        visit(placesToVisit);

        //If we want to insert a new value into the linkedList:
        //placesToVisit.add(1, "Cameroon");
        //printList(placesToVisit);

        //If we want to remove one:
        //placesToVisit.remove(4);
        //printList(placesToVisit);
    }

    public static void printList(LinkedList<String> linkedList) {
        //equivalent of a for loop
        Iterator<String> i = linkedList.iterator();

        //while an element is in the linked list pointing at another record, ie, has a next value
        while (i.hasNext()) {
            //print the following then proceed to the next value
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("-------------------");
    }

    //Let's order our linked list values alphabetically
    //Every time an entry is added to the linked list, we want to ensure:
    //It is added alphabetically:
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        //More flexibility, made for inserting records
        ListIterator<String> stringListIterator = linkedList.listIterator();

        //go through all the records in this data structure
        while (stringListIterator.hasNext()) {
            //returns a number:
            //if is 0, means, the value in the stringlinked list == the new city, ie they match
            //so we do not insert anything
            int comparison = stringListIterator.next().compareTo(newCity);

            if (comparison == 0) {
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                //the new item should appear before this one:
                stringListIterator.previous();
                //then we add the city so it appears at the right entry
                stringListIterator.add(newCity);
                return true;
            }
            //move on to the next city
            //no need to do anything because we already used .next in the comparison initializer
        }
        //then the new item goes to the end of the list.
        stringListIterator.add(newCity);
        //ordered correctly
        return true;
    }

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in the itenrary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday (vacation) over");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward) {
                       if(listIterator.hasPrevious())  {
                           listIterator.previous();
                       }
                       goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are the absolute start");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actionL \npress ");
        System.out.println("0 - to quit \n " +
                           "1 - to go to next city\n" +
                           "2 - to go to previous city\n" +
                           "3 - to print mneu options") ;
    }
}