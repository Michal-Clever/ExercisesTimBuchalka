package sekcja4.sampleCodingExercises;

public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0)
                || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}

