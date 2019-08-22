package sekcja7.playerEncapsulation;

public class EnhancedPlayer {
    private String name;
    private int hitPoint = 100;
    private String weapone;

    public EnhancedPlayer(String name, int hitPoint, String weapone) {
        this.name = name;
        if (hitPoint > 0 && hitPoint <= 100) {
            this.hitPoint = hitPoint;
        }
        this.weapone = weapone;
    }

    public void loseHealth(int damage) {
        this.hitPoint = this.hitPoint - damage;
        if (this.hitPoint <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return hitPoint;
    }
}
