package Control_Flow_Statements;

public class SwitchTwo {
    public static void main(String[] args) {
        //Test:
        switchStatement();
    }
    public static void switchStatement() {
        char myCharValue = 'A';

        switch (myCharValue) {
            case 'A':
                System.out.println("A was found");
                break;

            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(myCharValue + " was found");
                break;
            default:
                System.out.println("Could not find A, B, C, E");
        }

        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("jan");
                break;

            case "june":
                System.out.println("jun");
                break;

            case "july":
                System.out.println("july");
                break;

            default:
                System.out.println("Not a month");
        }
    }
}
