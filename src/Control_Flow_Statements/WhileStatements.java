package Control_Flow_Statements;

public class WhileStatements {

    public static void main(String[] args) {
        isEvenNumberVolume2();
        int count = 1;
        while(count != 6) {
            System.out.println("Count value is" + count);
            count++;
        }

        //instead of the above example, we can:
        while(true){
            if(count == 6) {
                break;
            }
            System.out.println("Count value is" + count);
            count++;
        }

        //instead of above, we can use a do while loop:
        do {
            System.out.println("Count value is" + count);
            count ++;

            if(count >100){
                break;
            }
        } while(count != 6);

    }


    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number) {
        if(number % 2 ==0){
            return true;
        } else {
            return false;
        }

    }

    public static void isEvenNumberVolume2() {
        //another way:
//        int numberOne = 4;
//        int finishNumber = 20;
//
//        while(numberOne <= finishNumber) {
//            numberOne++;
//            if(!isEvenNumber(numberOne)) {
//                continue;
//            }
//            System.out.println("Even number " + numberOne);
//        }

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        int numberOne = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while(numberOne <= finishNumber) {
            numberOne++;
            if(!isEvenNumber(numberOne)) {
                continue;
            }
            evenNumbersFound++;
            if(evenNumbersFound >= 10){
                break;
            }

            System.out.println("Even number " + numberOne);
        }
    }
}
