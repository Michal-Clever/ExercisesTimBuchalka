package sekcja5.sampleCodingExercises;

public class Main {
    public static void main(String[] args) {


        NumberInWord.printNumberInWord(0);
        NumberInWord.printNumberInWord(10);

        NumberOfDaysInMonth.isLeapYear(-1600);
        NumberOfDaysInMonth.isLeapYear(1600);
        NumberOfDaysInMonth.isLeapYear(2017);
        NumberOfDaysInMonth.isLeapYear(2000);

        NumberOfDaysInMonth.getDaysInMonth(1, 2020);
        NumberOfDaysInMonth.getDaysInMonth(2, 2020);
        NumberOfDaysInMonth.getDaysInMonth(2, 2018);
        NumberOfDaysInMonth.getDaysInMonth(-1, 2020);
        NumberOfDaysInMonth.getDaysInMonth(1, -2020);

        int score = SumOddRange.sumOdd(1, 100);
        System.out.println(score);
        score = SumOddRange.sumOdd(-1, 100);
        System.out.println(score);
        score = SumOddRange.sumOdd(100, 100);
        System.out.println(score);
        score = SumOddRange.sumOdd(13, 13);
        System.out.println(score);
        score = SumOddRange.sumOdd(100, -100);
        System.out.println(score);
        score = SumOddRange.sumOdd(100, 1000);
        System.out.println(score);


        NumberPalindrome.isPalindrome(1230321);

        System.out.println("**********");
        FirstAndLastDigitSum.sumFirstAndLastDigit(252);
        FirstAndLastDigitSum.sumFirstAndLastDigit(257);
        FirstAndLastDigitSum.sumFirstAndLastDigit(0);
        FirstAndLastDigitSum.sumFirstAndLastDigit(5);
        FirstAndLastDigitSum.sumFirstAndLastDigit(-10);
    }
}
