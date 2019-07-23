package sekcja5.sampleCodingExercises;

public class NumberPalindrome {

    public static void main(String[] args) {
        isPalindrome(1230321);
        isPalindrome(123032111);
    }

    public static boolean isPalindrome(int number) {
        int num = number;
        int revers = 0;

        while (num != 0) {

            int lastDigit = num % 10;
            revers *= 10;
            revers += lastDigit;
            num /= 10;

        }
        if (number == revers) {
            System.out.println(number + " == " + revers);
            return true;
        }
        System.out.println(number + " Not revers");
        return false;
    }
}