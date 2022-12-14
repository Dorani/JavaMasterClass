package Major_Review_Activities;

public class FoundationsFive {

    public static void main(String [] args) {
        //First example:
        System.out.println("First example - canPack: bigCount:2, smallCount:4, Goal: 9  ");
        System.out.println(canPack(2, 0, 9));
        System.out.println("---------------------------------------------------");
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        } else if((bigCount == 0) && (smallCount == 0) && (goal > 0)) {
            return false;
        } else {
            int actualBigCount = bigCount * 5;
            for(int x = 0; x <= smallCount; x++) {
                for(int y = 0; y <=bigCount; y++) {
                    if(actualBigCount + smallCount == goal) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
