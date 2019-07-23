package sekcja5.sampleCodingExercises;

public class DigitSumChallenge {

    public static void main(String[] args) {

        sumDigits(125);

    }

    static public int sumDigits(int number) {

        if (number <= 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int digits = number % 10;
            sum += digits;

            number/=10;
        }
        return sum;


    }
}
