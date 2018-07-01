package sekcja6;

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
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,-2020));
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
        System.out.println(  SumOddRange.isOdd(14));
        System.out.println(  SumOddRange.isOdd(-14));
        System.out.println(  SumOddRange.isOdd(13));

        System.out.println(SumOddRange.sumOdd(1,100));
        System.out.println("**********************");
        System.out.println(SumOddRange.sumOdd(-1,100));
        System.out.println("**********************");
        System.out.println(SumOddRange.sumOdd(100,100));
        System.out.println("**********************");
        System.out.println(SumOddRange.sumOdd(100,-100));
        System.out.println("**********************");
        System.out.println(SumOddRange.sumOdd(100,1000));
        System.out.println("**********");

        System.out.println("Exercises 14 NumberPalindrome :");

        System.out.println("**********");

    }
}
