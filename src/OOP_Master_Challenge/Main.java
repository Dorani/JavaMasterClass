package OOP_Master_Challenge;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", "White", 3.578);
        hamburger.addHamburgerAdditionsOne("Tomato", 0.27);
        hamburger.addHamburgerAdditionsTwo("Lettuce", 0.75);
        hamburger.addHamburgerAdditionsThree("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizedBurger());

        System.out.println("\n");

        HealthyBurger healthyBurger = new HealthyBurger("tuna", 4.59);
        healthyBurger.addHealthyAdditionsOne("extra-vegies", 2.45);
        healthyBurger.addHealthyAdditionsTwo("peppers", 1.45);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizedBurger());

        System.out.println("\n");
        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAdditionsThree("Should not do this", 50.53);
        db.itemizedBurger();

    }
}
