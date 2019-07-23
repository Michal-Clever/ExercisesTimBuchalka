package sekcja5.sampleCodingExercises;

public class FirstAndLastDigitSum {


    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            System.out.println("Invalid value");
            return -1;
        }

            String str = "" + number;
            String first = "" + str.charAt(0);
            String last = "" + str.charAt(str.length() - 1);
            int sum = Integer.parseInt(first) + Integer.parseInt(last);
            System.out.println(sum);
            return sum;

    }

}
