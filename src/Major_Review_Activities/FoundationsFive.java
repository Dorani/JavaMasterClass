package Major_Review_Activities;

public class FoundationsFive {

    public static void main(String [] args) {
        //First example:
        System.out.println("First example - canPack: bigCount:2, smallCount:4, Goal: 9  ");
        System.out.println(canPack(2, 0, 9));
        System.out.println("---------------------------------------------------");
    }


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
