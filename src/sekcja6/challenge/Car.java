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

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurretnGear(): Changed to " + currentGear + " gear.");
    }

    public void changVelocity(int speed, int direction) {
        System.out.println("Car.changeGear() : Velocity " + speed + " direction " + direction);
        move(speed, direction);
    }


}
