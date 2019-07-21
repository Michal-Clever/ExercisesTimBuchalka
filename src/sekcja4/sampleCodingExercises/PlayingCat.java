package sekcja4.sampleCodingExercises;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int nameTemperature) {
        if (summer == true && (nameTemperature > 24 && nameTemperature < 46)) {
            return true;
        } else if (summer == false && (nameTemperature > 24 && nameTemperature < 36)) {
            return true;
        }
        return false;
    }


}
