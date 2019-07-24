package sekcja5.sampleCodingExercises;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int counter = 0;
        if (number < 0) {
            System.out.println("Invalid Value");
            return -1;
        } else {
            while (number > 0) {
                counter = number % 10;
                if (counter % 2 == 0) {
                    sum += counter;

                }
                number /= 10;


            }
            return sum;
        }
    }
}
