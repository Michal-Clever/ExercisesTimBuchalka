package sekcja4.sampleCodingExercises;

public class MinutesToYearsAndDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0){
            System.out.println("Invalid Value");
        }else{
            long days = minutes /1440;
            long remainingDays = minutes % 1440;
            long years = days / 365;
            long remainingYears = days % 365;
            System.out.println(minutes+" min = "+ years + " y and " + remainingYears + " d ");
        }
    }
}
