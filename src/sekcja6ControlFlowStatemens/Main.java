package sekcja6ControlFlowStatemens;

public class Main {
    public static void main(String[] args) {
        //SEKCJA 6
        System.out.println("Exercises 11 NumberInWord :");
        //Write a method called printNumberInWord.
        //This method should have one parameter called number which a whole number (type int).
        //The method needs to print "ZERO" if the number parameter is passed with the value of 0.
        //The method needs to print "ONE" if the number parameter is passed with the value of 1.
        //The method needs to print "TWO" if the number parameter is passed with the value of 2.
        //... and so on up to and including "NINE" if the number parameter is passed with the value
        //of 9.
        //If the number parameter has any other value than 0 to 9, then the method should print
        //"OTHER".
        //You can use an if-else statement or a the switch statement to solve this challenge - the
        //choice is yours.
        //NOTE: The printNumberInWord method needs to be dened
        //as public static like we have
        //been doing so far in the course. 
        //NOTE: Do not add a  main method to solution code
        NumberInWord.printNumberInWord(5);
        System.out.println("**********");

        System.out.println("Exercises 12 NumberOfDaysInMonth :");
        //Write a method isLeapYear with a parameter of type int named year. 
        //The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
        //If the parameter is not in that range return false. 
        //Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
        //otherwise return false. 
        //A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
        //Examples of input/output:
        //isLeapYear(-1600); should return false since parameter is not in the range (1-9999)
        //isLeapYear(1600); should return true since 1600 is leap year
        //isLeapYear(2017); should return false since 2017 is not a keap year
        //isLeapYear(2000); should return true because 2000 is aleap year 
        //NOTE:  The solution to the Leap Year coding exercise earlier in the course created the
        //isLeapYear method. You can use that solution if you wish.
        //Write another method getDaysInMonth with two parameters month and year.  Both of
        //type int.
        //If parameter month is < 1 or > 12 return -1. 
        //If parameter year is < 1 or > 9999 then return -1.
        //This method needs to return the number of days in the month. Be careful about leap years
        //they have 29 days in month 2 (February).
        //You should check if the year is a leap year using the method isLeapYear described above.
        //Examples of input/output:
        //getDaysInMonth(1, 2020); should return 31 since January has 31 days.
        //getDaysInMonth(2, 2020); should return 29 since February has 29 days in a leap year
        //and 2020 is a leap year.
        //getDaysInMonth(2, 2018); should return 28 since February has 28 days if it's not a
        //leap year and 2018 is not a leap year.
        //getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
        //getDaysInMonth(1, -2020); should return -1 since the parameter year is outside
        //the range of 1 to 9999.
        //HINT: Use the switch statement.
        //NOTE: Methods isLeapYear and getDaysInMonth need to be public static like we have
        //been doing so far in the course.
        //NOTE: Do not add a main method to solution code.
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));
        System.out.println("**********");

        System.out.println("Exercises 13 SumOddRange :");
        //Write a method called isOdd with an int parameter and call it number. The method needs
        //to return a boolean.
        //Check that number is > 0, if it is not return false.
        //If number is odd return true, otherwise  return false.
        //Write a second method called sumOdd that has 2 int parameters start and end, which
        //represent a range of numbers.
        //The method should use a for loop to sum all odd numbers  in that range including
        //the end and return the sum.
        //It should call the method isOdd to check if each number is odd.
        //The parameter end needs to be greater than or equal to start and
        //both start and end parameters have to be greater than 0.
        //If those conditions are not satised
        //return -1 from the method to indicate invalid input. 
        //Example input/output:
        //System.out.println(sumOdd(1, 100)); // should print  2500
        //System.out.println(sumOdd(-1, 100)); // should print  -1
        //System.out.println(sumOdd(100, 100)); // should print  0
        //System.out.println(sumOdd(100, -100)); // should print  -1
        //System.out.println(sumOdd(100, 1000)); // should print  247500
        //TIP: use the remainder operator to check if the number is odd
        //NOTE: Both methods  needs to be dened
        //as public static like we have been doing so far
        //in the course.
        //NOTE: Do not add a  main method to solution code
        System.out.println(SumOddRange.isOdd(14));
        System.out.println(SumOddRange.isOdd(-14));
        System.out.println(SumOddRange.isOdd(13));

        System.out.println(SumOddRange.sumOdd(1, 100));
        System.out.println("**********************");
        System.out.println(SumOddRange.sumOdd(-1, 100));
        System.out.println("**********************");
        System.out.println(SumOddRange.sumOdd(100, 100));
        System.out.println("**********************");
        System.out.println(SumOddRange.sumOdd(100, -100));
        System.out.println("**********************");
        System.out.println(SumOddRange.sumOdd(100, 1000));
        System.out.println("**********");

        System.out.println("Exercises 14 NumberPalindrome :");
        //Write a method called isPalindrome with one int parameter called number.
        //The method needs to return a boolean.
        //It should return true if the number is a palindrome number otherwise it should
        //return false.
        //Check the tips below for more info about palindromes.
        //Example Input/Output
        //isPalindrome(-1221); should return true
        //isPalindrome(707); should return true
        //isPalindrome(11212); should return false because reverse is 21211 and that is not equal to
        //11212.
        //Tip: What is a Palindrome number?  A palindrome number is a number which
        //when reversed is equal to the original number. For example: 121, 12321, 1001 etc.
        //Tip: Logic to check a palindrome number
        //Find the reverse of the given number. Store it in some variable say reverse. Compare
        //the number with reverse.
        //If both are the same then the number is a palindrome otherwise it is not.
        //Tip:Logic to reverse a number
        //Declare and initialize another variable to store the reverse of a number, for
        //example reverse = 0.
        //Extract the last digit of the given number by performing modulo division.
        //Store the last digit to some variable say lastDigit = num % 10.
        //Increase the place value of reverse by one.
        //To increase place value multiply reverse variable by 10 e.g. reverse = reverse * 10.
        //Add lastDigit to reverse.
        //Since last digit of num is processed, remove last digit of num. To remove last digit
        //divide num by 10.
        //Repeat steps until num is not equal to (or greater than) zero.
        //A while loop would be good for this coding exercise.
        System.out.println(NumberPalindrome.isPalindrome(-1221));
        System.out.println(NumberPalindrome.isPalindrome(707));
        System.out.println(NumberPalindrome.isPalindrome(11212));
        System.out.println("**********");

        System.out.println("Exercises 15 FirstAndLastDigitSum :");
        //Write a method named sumFirstAndLastDigit with one parameter of type int
        //called number.
        //The method needs to nd
        //the rst
        //and last digit of the parameter number passed to the
        //method, using a loop and return the sum of the rst
        //and last digit of that number.
        //If the number is negative then the method needs to return -1 to indicate an invalid value.
        //sumFirstAndLastDigit(252); should return 4, rst
        //digit is 2 and the last is 2 which gives us
        //2+2 and the sum is 4.
        //sumFirstAndLastDigit(257); should return 9, rst
        //digit is 2 and the last is 7 which gives us
        //2+7 and the sum is 9.
        //sumFirstAndLastDigit(0); should return 0, rst
        //digit and the last digit is 0, since we only
        //have 1 digit, which gives us 0+0 and the sum is 0.
        //sumFirstAndLastDigit(5); should return 10, rst
        //digit and last digit is 5, since we only have
        //1 digit, which gives us 5+5 and the sum is 10.
        //sumFirstAndLastDig
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(252));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(257));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(0));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(5));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(-10));
        System.out.println("**********");

        System.out.println("Exercises 16 EvenDigitSum :");
        //Write a method named getEvenDigitSum with one parameter of type int called number.  The
        //method should return the sum of the even digits within the number.  If the number is
        //negative, the method should return -1 to indicate an invalid value
        //EXAMPLE INPUT/OUTPUT:
        //getEvenDigitSum(123456789); should return 20 since 2 + 4 + 6 + 8 = 20
        //getEvenDigitSum(252); should return 4 since 2 + 2 = 4
        //getEvenDigitSum(-22); should return -1 since the number is negative
        System.out.println(EvenDigitsSum.getEvenDigitSum(123456789));
        System.out.println(EvenDigitsSum.getEvenDigitSum(252));
        System.out.println(EvenDigitsSum.getEvenDigitSum(-22));
        System.out.println("**********");

        System.out.println("Exercises 17 SharedDigit :");
        //Write a method named hasSharedDigit with two parameters of type int. 
        //Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the
        //numbers is not within the range, the method should return false.
        //The method should return true if there is a digit that appears in both numbers, such
        //as 2 in 12 and 23; otherwise, the method should return false.
        //EXAMPLE INPUT/OUTPUT:
        //hasSharedDigit(12, 23); should return true since the digit 2 appears in both
        //numbers
        //hasSharedDigit(9, 99); should return false since 9 is not within the range of 10-99
        //hasSharedDigit(15, 55); should return true since the digit 5 appears in both
        //numbers
        System.out.println(SharedDigit.hasSharedDigit(12, 23));
        System.out.println(SharedDigit.hasSharedDigit(9, 99));
        System.out.println(SharedDigit.hasSharedDigit(15, 55));
        System.out.println("**********");

        System.out.println("Exercises 18 LastDigitChecker :");
        //Write a method named hasSameLastDigit with three parameters of type int. 
        //Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the
        //numbers is not within the range, the method should return false.
        //The method should return true if at least two of the numbers share the same rightmost
        //digit; otherwise, it should return false.
        //EXAMPLE INPUT/OUTPUT:
        //hasSameLastDigit (41, 22, 71); should return true since 1 is the rightmost digit in
        //numbers 41 and 71
        //hasSameLastDigit (23, 32, 42); should return true since 2 is the rightmost digit in
        //numbers 32 and 42
        //hasSameLastDigit (9, 99, 999); should return false since 9 is not within the range of
        //10-1000
        System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71));
        System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 42));
        System.out.println(LastDigitChecker.hasSameLastDigit(9, 99, 999));
        System.out.println("**********");

        System.out.println("Exercises 19 Greatest Common Divisor :");
        // Write a method named getGreatestCommonDivisor with two parameters of
        // type int named rst
        //and second. 
        //If one of the parameters is < 10, the method should return -1 to indicate an invalid
        //value.
        //The method should return the greatest common divisor of the two numbers (int).
        //The greatest common divisor is the largest positive integer that can fully divide each of
        //the integers (i.e. without leaving a remainder).
        //For example 12 and 30:
        //12 can be divided by 1, 2, 3, 4, 6, 12
        //30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
        //The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no
        //resulting remainder
        //EXAMPLE INPUT/OUTPUT:
        //getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5
        //without a remainder
        //getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6
        //without a remainder
        //getGreatestCommonDivisor(9, 18); should return -1 since the rst
        //parameter is <
        //10
        //getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by
        //9 without a remainder
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
        System.out.println("**********");

        System.out.println("Exercises 20 All Factors :");
        //Write a method named printFactors with one parameter of type int named number. 
        //If number is < 1, the method should print "Invalid Value".
        //The method should print all factors of the number. A factor of a number is an integer
        //which divides that number wholly (i.e. without leaving a remainder).
        //For example: 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other
        //words 6 / 3 = 2.
        //EXAMPLE INPUT/OUTPUT:
        //printFactors(6); should print 1 2 3 6
        //printFactors(32); should print 1 2 4 8 16 32
        //printFactors(10); should print 1 2 5 10
        //printFactors(-1); should print "Invalid Value" since number is < 1
        System.out.println(" ");FactorPrinter.printFactors(6);
        System.out.println(" ");FactorPrinter.printFactors(32);
        System.out.println(" ");FactorPrinter.printFactors(10);
        System.out.println(" ");FactorPrinter.printFactors(-1);
        System.out.println("**********");

        System.out.println("Exercises 21 Perfect Number :");
        //What is a perfect number? A perfect number is a positive integer which is equal to the
        //sum of its proper positive divisors.  Proper positive divisors are positive integers that fully
        //divide the perfect number without leaving a remainder and exclude the perfect number
        //itself. For example, take the number 6:  Its proper divisors are 1, 2, and 3 (since 6 is the
        //value of the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 =
        //6. 
        //Therefore, 6 is a perfect number (as well as the rst
        //perfect number).
        //Write a method named isPerfectNumber with one parameter of type int named number. 
        //If number is < 1, the method should return false.
        //The method must calculate if the number is perfect. If the number is perfect, the method
        //should return true; otherwise, it should return false.
        //EXAMPLE INPUT/OUTPUT:
        //isPerfectNumber(6); should return true since its proper divisors are 1, 2, 3 and the
        //sum is 1 + 2 + 3 = 6
        //isPerfectNumber(28); should return true since its proper divisors are 1, 2, 4, 7, 14
        //and the sum is 1 + 2 + 4 + 7 + 14 = 28
        //isPerfectNumber(5); should return false since its only proper divisor is 1 and the
        //sum is 1 not 5
        System.out.println(PerfectNumber.isPerfectNumber(6));
        System.out.println(PerfectNumber.isPerfectNumber(28));
        System.out.println(PerfectNumber.isPerfectNumber(5));
        System.out.println(PerfectNumber.isPerfectNumber(-1));
        System.out.println("**********");

        System.out.println("Exercises 22 NumberToWords :");
        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(123));
        System.out.println(NumberToWords.getDigitCount(-12));
        System.out.println(NumberToWords.getDigitCount(5200));
        System.out.println(NumberToWords.reverse(-121));
        System.out.println(NumberToWords.reverse(1212));
        System.out.println(NumberToWords.reverse(1234));
        System.out.println(NumberToWords.reverse(100));
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);
        System.out.println("**********");
    }
}
