package sekcja6.challenge;

public class Car extends Vehicle {

    private int wheels;
    private int dors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int dors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.dors = dors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }



}
