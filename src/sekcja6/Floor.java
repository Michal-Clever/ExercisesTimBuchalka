package sekcja6;

public class Floor {

    private double width;
    private double lenght;

    public Floor(double width, double lenght) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (lenght < 0) {
            this.width = 0;
        } else {
            this.lenght = lenght;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public double getArea() {
        return (width * lenght);
    }

}
