package Algorithms.Algorithms_Intro;

public class MegaBytes_Converter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            long conversion = kiloBytes / 1024;
            long remainder = kiloBytes % 1024 ;
            System.out.println(kiloBytes + " KB = "
                    + conversion + " MB" + " and "
                    + remainder + " KB");
        }
    }
}
