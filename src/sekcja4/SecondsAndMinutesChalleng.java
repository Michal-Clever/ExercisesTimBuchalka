package sekcja4;

public class SecondsAndMinutesChalleng {
    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
    }

    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid parameters";
        }

        long hours = minutes / 60;
        long remaingMinutes = minutes % 60;
        return hours + "h " + minutes + "m "+ seconds + "s";

    }

}