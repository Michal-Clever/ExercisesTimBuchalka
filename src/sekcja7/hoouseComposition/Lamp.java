package sekcja7.hoouseComposition;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRaiting;

    public Lamp(String style, boolean battery, int globRaiting) {
        this.style = style;
        this.battery = battery;
        this.globRaiting = globRaiting;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRaiting() {
        return globRaiting;
    }
}
