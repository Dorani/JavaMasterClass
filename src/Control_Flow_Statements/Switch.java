package Control_Flow_Statements;

public class Switch {

    public static void main(String[] args) {
        conditionalBuildUp();
        firstSwitch();
    }

    public static void conditionalBuildUp() {
        int value = 3;
        if (value == 1) {
            System.out.println("value was 1");
        } else if(value == 2) {
            System.out.println("value was 2");
        } else {
            System.out.println("was not 1 or 2, it was " + value);
        }
    }
    public static void firstSwitch() {
        int switchValue = 1;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
             //grouping test cases
            case 3: case 4: case 5:
                System.out.println("It was a 3, 4 or 5");
            default:
                System.out.println("Was not 1 or 2. It was a " + switchValue);
        }
    }
}
