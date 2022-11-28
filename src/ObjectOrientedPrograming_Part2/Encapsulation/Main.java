package ObjectOrientedPrograming_Part2.Encapsulation;

public class Main {
    public static void main(String[] args) {
//        //Since we didn't build a constructor, when we initialize it, the fields are empty, so...
//        Player player = new Player();
//        //we can manually assign values to those fields for that respective instance
//        player.name = "Seif";
//        player.health = 100;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("remaining health is..." + player.healthRemaining());


        //When an instance is created we default the value to 100
        //and we validate to make sure that whatever we pass in is also between 0 and 100
        //This way provides more control, by making our fields private we are making sure our fields within our class
        //are not accesible to any classes that are outside.
        EnhancedPlayer player = new EnhancedPlayer("Seif", 100, "sword");
        System.out.println("initial health is " + player.getHealth());
    }

}
