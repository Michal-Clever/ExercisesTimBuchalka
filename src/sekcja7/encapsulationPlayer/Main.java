package sekcja7.encapsulationPlayer;

public class Main {
    public static void main(String[] args) {

        EnhancedPlayer player = new EnhancedPlayer("Songo", 450, "sword");
        System.out.println("Inital health is " + player.getHealth());
        player.loseHealth(20);
        System.out.println("Inital health is " + player.getHealth());
        player.loseHealth(180);
        System.out.println("Inital health is " + player.getHealth());

    }


}
