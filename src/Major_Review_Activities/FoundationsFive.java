package Major_Review_Activities;

public class FoundationsFive {

    public static void main(String [] args) {
        //First example:
        System.out.println("First example - canPack: bigCount:2, smallCount:4, Goal: 9  ");
        System.out.println(canPack(2, 0, 9));
        System.out.println("---------------------------------------------------");
    }

        //1. Validation of the parameter values
        //2. Determine how many bigCount can fill the goal:  As long as goal is greater than or equal to 5, take the goal
        //and subtract 5 for each bigCount that you have.  Use a while loop to do this and make sure you decrement the number of bigCount for each iteration.
        //3. Determine how many smallCount can fill the goal:  The remaining amount is what you have to fill with smallCount,
        //so evaluate that you have enough smallCount to fulfill the "remaining" goal.
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        while((bigCount > 0) && (goal >= 5)) {
            goal -= 5;
            bigCount--;
        }
        return smallCount >= goal;
    }
}
