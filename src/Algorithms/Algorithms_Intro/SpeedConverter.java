package Algorithms.Algorithms_Intro;

public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(22);
    }
    public static long toMilesPerHour(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            return -1;
        }
        return Math.round(kilometerPerHour / 1.609);
    }
    public static void printConversion(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            //instead of typing math.round we will call toMilesPerhour
            //and pass in our kilometer value which we want converted
            long milesPerHour = toMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour +
                    "km/h = " + milesPerHour +
                    " mi/h");
        }
    }
}
