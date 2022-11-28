package OOP_Master_Challenge;

public class Hamburger {

    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addOnOne;
    private double addOnOnePrice;

    private String addOnTwo;
    private double addOnTwoPrice;

    private String addOnThree;
    private double addOnThreePrice;

    private String addOnFour;
    private double addOnFourPrice;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAdditionsOne(String name, double price) {
        this.addOnOne = name;
        this.addOnOnePrice = price;
    }

    public void addHamburgerAdditionsTwo(String name, double price) {
        this.addOnTwo = name;
        this.addOnTwoPrice = price;
    }

    public void addHamburgerAdditionsThree(String name, double price) {
        this.addOnThree = name;
        this.addOnThreePrice = price;
    }

    public void addHamburgerAdditionsFour(String name, double price) {
        this.addOnFour = name;
        this.addOnFourPrice = price;
    }

    public double itemizedBurger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll "
                + "with " + this.meat + ", price is "  + this.price);
        if(this.addOnOne != null) {
            hamburgerPrice += this.addOnOnePrice;
            System.out.println("Added " + this.addOnOne + " for an extra " + this.addOnOnePrice);
        }
        if(this.addOnTwo != null) {
            hamburgerPrice += this.addOnTwoPrice;
            System.out.println("Added " + this.addOnTwo + " for an extra " + this.addOnTwoPrice);
        }
        if(this.addOnThree != null) {
            hamburgerPrice += this.addOnThreePrice;
            System.out.println("Added " + this.addOnThree + " for an extra " + this.addOnThreePrice);
        }
        if(this.addOnFour != null) {
            hamburgerPrice += this.addOnFourPrice;
            System.out.println("Added " + this.addOnFour + " for an extra " + this.addOnFourPrice);
        }
        return hamburgerPrice;
    }
}
