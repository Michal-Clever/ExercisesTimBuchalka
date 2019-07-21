package sekcja4.sampleCodingExercises;

import sekcja4.SecondsAndMinutesChalleng;

public class Main {
    public static void main(String[] args) {

        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);


        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

        boolean number = TeenNumberChecker.isTeen(13);
        System.out.println(number);


        System.out.println("AreaCalculator = " + AreaCalculator.area(514.21));
        System.out.println("AreaCalculator = " + AreaCalculator.area(8.5));
        System.out.println("AreaCalculator = " + AreaCalculator.area(4.21,5.75));

       MinutesToYearsAndDaysCalculator.printYearsAndDays(525600);
       MinutesToYearsAndDaysCalculator.printYearsAndDays(1051200);
       MinutesToYearsAndDaysCalculator.printYearsAndDays(561600);
       MinutesToYearsAndDaysCalculator.printYearsAndDays(0);

    }
}
