package OOP_Master_Challenge;

public class HealthyBurger extends Hamburger {

    private String healthyAddOnOne;
    private double healthAddOnOnePrice;

    private String healthyAddOnTwo;
    private double healthyAddOnTwoPrice;

    public HealthyBurger( String meat, double price) {
        super("Healthy Burger", meat,"Rye", price);
    }

    public void addHealthyAdditionsOne(String name, double price) {
        this.healthyAddOnOne = name;
        this.healthAddOnOnePrice = price;
    }

    public void addHealthyAdditionsTwo(String name, double price) {
        this.healthyAddOnTwo = name;
        this.healthyAddOnTwoPrice = price;
    }

    @Override
    public double itemizedBurger() {
        double priceOfHealthyBurger = super.itemizedBurger();
        if(this.healthyAddOnOne != null) {
            priceOfHealthyBurger += healthAddOnOnePrice;
        }
        if(this.healthyAddOnTwo != null) {
            priceOfHealthyBurger += healthyAddOnTwoPrice;
        }
        return priceOfHealthyBurger;
    }
}
