package ObjectOrientedPrograming_Part2.Encapsulation;

public class EnhancedPlayer {
    //encapsulation demo:

    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100) {
            //validation to ensure that the only values we are accepting for health are betweem 0 and 100
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health -= damage;
        if(this.health <= 0) {
            System.out.println("Player is dead..");
        }
    }

    public int getHealth() {
        return health;
    }
}
