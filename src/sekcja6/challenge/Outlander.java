package sekcja6.challenge;

public class Outlander extends Car {

    private int roadServiceMonths;

    public Outlander( int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5,5, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
