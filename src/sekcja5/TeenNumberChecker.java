package sekcja5;

public class TeenNumberChecker {
    public static boolean hasTeen(int numberA, int numberB, int numberC) {

        if (numberA >= 13 && numberA <= 19 || numberB >= 13 && numberB <= 19 || numberC >= 13 && numberC <= 19) {
            return true;
        }
        return false;
    }
}
