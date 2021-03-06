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

        System.out.println("*************");
        int evenDigitSum = EvenDigitSum.getEvenDigitSum(123456789);
        System.out.println(evenDigitSum);
        evenDigitSum = EvenDigitSum.getEvenDigitSum(252);
        System.out.println(evenDigitSum);
        evenDigitSum = EvenDigitSum.getEvenDigitSum(-22);
        System.out.println(evenDigitSum);

        System.out.println("*********");
        boolean shareDigit = SharedDigit.hasSharedDigit(19, 99);
        System.out.println(shareDigit);

        System.out.println("*************");
        boolean lastDigitChecker = LastDigitChecker.hasSameLastDigit(41, 22, 71);
        System.out.println(lastDigitChecker);
        lastDigitChecker = LastDigitChecker.hasSameLastDigit(23, 32, 42);
        System.out.println(lastDigitChecker);
        lastDigitChecker = LastDigitChecker.hasSameLastDigit(9, 99, 999);
        System.out.println(lastDigitChecker);

        System.out.println("**********");
        int max = GreatesCommonDivisior.getGreatestCommonDivisor(25, 15);
        System.out.println(max);
        max = GreatesCommonDivisior.getGreatestCommonDivisor(12,30);
        System.out.println(max);
        max = GreatesCommonDivisior.getGreatestCommonDivisor(9,18);
        System.out.println(max);
        max = GreatesCommonDivisior.getGreatestCommonDivisor(81,153);
        System.out.println(max);


    }
}
