package OOP_Master_Challenge;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe Burger", "steak and cheese", "white", 12.99);
        super.addHamburgerAdditionsOne("Chips", 1.99);
        super.addHamburgerAdditionsTwo("Drink", 2.99);
    }

    @Override
    public void addHamburgerAdditionsOne(String name, double price) {
        System.out.println("Unable to add on to deluxe order");
    }

    @Override
    public void addHamburgerAdditionsTwo(String name, double price) {
        System.out.println("Unable to add on to deluxe order");
    }

    @Override
    public void addHamburgerAdditionsThree(String name, double price) {
        System.out.println("Unable to add on to deluxe order");
    }

    @Override
    public void addHamburgerAdditionsFour(String name, double price) {
        System.out.println("Unable to add on to deluxe order");
    }
}
