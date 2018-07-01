package sekcja5ExpressionsStatementsCodeBloksMethodsAndMore;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer == true) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            }
            return false;

        } else if (summer == false) {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            }
            return false;
        }
        return summer;
    }
}
