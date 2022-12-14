package Major_Review_Activities;

public class FoundationsFive {

    public static void main(String [] args) {
        //First example:
        System.out.println("First example - isPalindrome: 11212");
        System.out.println(canPack(1, 5, 9));
        System.out.println("---------------------------------------------------");
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        return true;
    }

}
