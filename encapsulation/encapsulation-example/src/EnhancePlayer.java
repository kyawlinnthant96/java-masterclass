public class EnhancePlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancePlayer(String fullName) {
        this(fullName,100,"M16A1");
    }

    public EnhancePlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if (health <= 0) {
            this.healthPercentage = 1;
        } else this.healthPercentage = Math.min(health, 100);
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println("Player knock out of the game");
        }
    }

    public int healthRemaining() { return healthPercentage; }

    public void restoreHealth(int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage > 100) {
            System.out.println("Player restore to 100%");
        }
    }
}
