public class Main {
    public static void main(String[] args) {

        System.out.println("Exercises 1 MegaBytesConverter :");
        //Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with
        //the name kiloBytes.
        //The method should not return anything (void) and it needs to calculate the megabytes and
        //remaining kilobytes from the kilobytes parameter. 
        //Then it needs to print a message in the format "XX KB = YY MB and ZZ KB". XX represents
        //the original value kiloBytes. YY represents the calculated megabytes. ZZ represents the
        //calculated remaining kilobytes.
        //If the parameter kiloBytes is < 0 then print instead the text "Invalid Value".
        //Example: printMegaBytesAndKiloBytes(2050) should print "2050 KB = 2 MB and 2 KB"
        //TIP: Be careful about spaces in the printed message.
        //TIP: Use the remainder operator
        //TIP: 1 MB = 1024 KB
        MegaBytesConverter.printMegaBytesAndKiloBytes(12345);
        System.out.println("**********");


        System.out.println("Exercises 2 BarkingDog :");
        //We have a dog that likes to bark. We need to wake up if the dog is barking at night!
        //Write a method bark that has 2 parameters.
        //1st parameter should be of type boolean and be named barking it represents if our dog is curently
        //barking.
        //2nd parameter represents the hour of the day and is type int with the hourOfDay and has valid
        //range of 0-23.
        //We have to wake up if the dog is barking before 8:00 am or after 22:00 hours so in that case return true.
        //In all other cases return false. If the hourOfDay parameter is less than 0 or greater than 23 return false.
        //Examples of input/output:
        //bark(true, 1); should return true
        //bark(false, 2); should return false since the dog is not barking.
        //bark(true, 8); should return false, since it's not before 8:00AM.
        //bark(true, -1); should return false because the hourOfDay parameter needs to be in
        //range 0-23.
        System.out.println(BarkingDog.bark(true, 1));
        System.out.println(BarkingDog.bark(false, 2));
        System.out.println(BarkingDog.bark(true, 8));
        System.out.println(BarkingDog.bark(true, -1));
        System.out.println("**********");

        System.out.println("Exercises 3 LeapYearCalculator :");
        //Write a method isLeapYear with a parameter of type int named year. 
        //The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
        //If the parameter is not in that range return false. 
        //Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
        //otherwise return false. 
        //A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
        //Examples of input/output:
        //isLeapYear(-1600); should return false since parameter is not in the range (1-9999)
        //isLeapYear(1600); should return true since 1600 is leap year
        //isLeapYear(2017); should return false since 2017 is not a leap year
        //isLeapYear(2000); should return true because 2000 is a leap year 
        System.out.println(LeapYear.isLeapYear(-1600));
        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(LeapYear.isLeapYear(2000));
        System.out.println(LeapYear.isLeapYear(2017));
        System.out.println("**********");

        System.out.println("Exercises 4 DecimalComperator :");
        //Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
        //The method should return boolean and it needs to return true if two double numbers
        //are the same up to three decimal places. Otherwise return false.
        //EXAMPLES OF INPUT/OUTPUT:
        //areEqualByThreeDecimalPlaces(-3.1756, -3.175); should return true since
        //numbers are equal up to 3 decimal places.
        //areEqualByThreeDecimalPlaces(3.175, 3.176); should return false since numbers
        //are not equal up to 3 decimal places
        //areEqualByThreeDecimalPlaces(3.0, 3.0); should return true since numbers
        //are equal up to 3 decimal places.
        System.out.println(DecimalComperator.areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(DecimalComperator.areEqualByThreeDecimalPlaces(3.175,3.176));
        System.out.println(DecimalComperator.areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println("**********");

        System.out.println("Exercises 5 EqualSumChecker :");
        //Write a method hasEqualSum with 3 parameters of type int.
        //The method should return boolean and it needs to return true if sum of rst
        //and second
        //parameter is equal to third parameter. Otherwise return false.
        //EXAMPLES OF INPUT/OUTPUT:
        //hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1
        //hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2
        //hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0
        System.out.println( EqualSumChecker.hasEqualSum(1,1,1));
        System.out.println( EqualSumChecker.hasEqualSum(1,1,2));
        System.out.println( EqualSumChecker.hasEqualSum(1,-1,0));
        System.out.println("**********");

        System.out.println("Exercises 6 TeenNumberChecker :");
        //We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
        //Write a method hasTeen with 3 parameters of type int.
        //The method should return boolean and it needs to return true if one of parameters is
        //in range 13(inclusive) - 19 (inclusive). Otherwise return false.
        //EXAMPLES OF INPUT/OUTPUT:
        //hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
        //hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
        //hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range
        //13-19
        System.out.println(TeenNumberChecker.hasTeen(9,99,19));
        System.out.println(TeenNumberChecker.hasTeen(23,15,42));
        System.out.println(TeenNumberChecker.hasTeen(22,23,24));
        System.out.println("**********");

        System.out.println("Exercises 7 AreaCalculator:");
        //Write a method named area with one double parameter named radius.
        //The method needs to return a double value that represents the area of a circle.
        //If the parameter radius is negative then return -1.0 to represent an invalid value. 
        //Write another overloaded method with 2 parameters x and y (both
        //doubles), where x and y represent the sides of a rectangle.
        //The method needs to return an area of a rectangle. 
        //If either or both parameters is/are negative return -1.0 to indicate an invalid value.
        //For formulas and PI value please check the tips below.
        //Examples of input/output:
        //area(5.0); should return 78.53975
        //area(-1);  should return -1 since the parameter is negative
        //area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
        //area(-1.0, 4.0);  should return -1 since rst
        //the parameter is negative
        System.out.println(AreaCalculator.area(5));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(5, 4));
        System.out.println(AreaCalculator.area(-1, 4));
        System.out.println("**********");

        System.out.println("Exercises 8 MinutesToYearsDaysCalculator :");
        //The method should not return anything (void) and it needs to calculate the years and days
        //from the minutes parameter.
        //If parameter is less than 0, print text "Invalid Value".
        //Otherwise if parameter is valid then it needs to print a message in the format "XX min = YY
        //y and ZZ d".
        //XX represents the original value minutes. YY represents the calculated years.
        //ZZ represents the calculated days.
        //EXAMPLES OF INPUT/OUTPUT:
        //printYearsAndDays(525600); should print "525600 min = 1 y and 0 d"
        //printYearsAndDays(1051200); should print "1051200 min = 2 y and 0 d"
        //printYearsAndDays(561600); should print "561600 min = 1 y and 25 d"
        //TIPS:
        //Be extra careful about spaces in the printed message.
        //Use the remainder operator
        // hour = 60 minutes
        //1 day = 24 hours
        //1 year = 365 days
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
        System.out.println("**********");

        System.out.println("Exercises 9 Equality Printer:");
        //Write a method printEqual with 3 parameters of type int. The method should not return
        //anything (void).
        //If one of parameters is less than 0, print text "Invalid Value".
        //If all numbers are equal print text "All numbers are equal"
        //If all numbers are dierent
        //print text "All numbers are dierent".
        //Otherwise print "Neither all are equal or dierent".
        //EXAMPLES OF INPUT/OUTPUT:
        //printEqual(1, 1, 1); should print text All numbers are equal
        //printEqual(1, 1, 2); should print text Neither all are equal or dierent
        //printEqual(-1, -1, -1); should print text Invalid Value
        //printEqual(1, 2, 3); should print text All numbers are dierent
        EqualityPrinter.printEqual(1, 1, 1);
        EqualityPrinter.printEqual(1, 1, 2);
        EqualityPrinter.printEqual(-1, -1, -1);
        EqualityPrinter.printEqual(1, 2, 3);
        System.out.println("**********");

        System.out.println("Exercises 10 PlayingCat :");
        //The cats spend most of the day playing. In particular, they play if the temperature is
        //between 25 and 35 (inclusive). Unless it is summer, then the upper limit is 45 (inclusive)
        //instead of 35.
        //Write a method isCatPlaying that has 2 parameters. Method needs to return true if cat is
        //playing, otherwise return false
        //1st parameter should be of type boolean and be named summer it represents if it is
        //summer. 2nd parameter represents the temperature and is of type int with the name
        //temperature.
        //EXAMPLES OF INPUT/OUTPUT:
        //isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45 
        //isCatPlaying(false, 36); should return false since temperature is not in range 25 -
        //35 (summer parameter is false)
        //isCatPlaying(false, 35); should return true since temperature is in range 25 - 35 
        System.out.println(PlayingCat.isCatPlaying(true, 10));
        System.out.println(PlayingCat.isCatPlaying(false, 36));
        System.out.println(PlayingCat.isCatPlaying(false, 35));
        System.out.println("**********");
    }
}
