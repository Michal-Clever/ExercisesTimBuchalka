package sekcja4.sampleCodingExercises;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(2);
        checkNumber(-3);
        checkNumber(0);
    }

    public static void checkNumber(int number) {

        if (number > 0) {
            System.out.println("positive, my number is "+number);
        } else if (number < 0) {
            System.out.println("negative, my number is "+number);
        } else {
            System.out.println("zero, my number is "+number);
        }

    }
}
