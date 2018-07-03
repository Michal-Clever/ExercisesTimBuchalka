package sekcja6ControlFlowStatemens;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int count = 0;
        for (int k = 1; (k <= first && k <= second); k++) {
            if ((first % k == 0) && (second % k == 0)) {
                count = k;
            }
        }
        return count;
    }

}
