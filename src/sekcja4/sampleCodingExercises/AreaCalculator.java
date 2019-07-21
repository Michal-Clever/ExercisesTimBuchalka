package sekcja4.sampleCodingExercises;

public class AreaCalculator {

    private static final double PI =  3.141592;

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        double P = PI * radius * radius;

        return P;

    }

    public static double area(double a, double b) {

        if (a < 0 || b < 0) {
            return -1;
        }

        double P = a * b;
        return P;


    }
}
