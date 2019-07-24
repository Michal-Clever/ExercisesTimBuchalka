package sekcja5.sampleCodingExercises;

public class LastDigitChecker {

    public static boolean isValid(int number) {
        if (number < 10 || number > 99) {
            return false;
        }
        return true;
    }


    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if ((isValid(num1) != true) && (isValid(num2) != true) && (isValid(num3) != true)) {
            int num1Last = num1 % 10;
            int num2Last = num2 % 10;
            int num3Last = num3 % 10;
            if ((num1Last == num2Last) || (num1Last == num3Last) || (num2Last == num3Last)) {
                return true;
            }
        }
        return false;
    }

}
