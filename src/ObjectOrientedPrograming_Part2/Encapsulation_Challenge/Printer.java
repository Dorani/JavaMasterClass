package ObjectOrientedPrograming_Part2.Encapsulation_Challenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >= 1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100) {
            //overfill toner test
           if(this.tonerLevel + tonerAmount > 100) {
               return -1;
           }
           //otherwise add the tonerAmount to the toner Level and return it
           this.tonerLevel += tonerAmount;
           return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint /= 2;
            System.out.println("printed on both sides of the page");
        }
        this.pagesPrinted =+ pagesToPrint;
        return pagesToPrint;
    }

}
