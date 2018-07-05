package sekcja6ControlFlowStatemens;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int a = goal / 5;
        int covered = 0;
        if (a <= bigCount) {
            covered = a * 5;
        } else {
            covered = bigCount * 5;
        }
        //System.out.println(covered);
        int remaining = goal - covered;
        if (smallCount >= remaining) {
           // System.out.println(remaining);
            return true;
        } else
            return false;
    }
}
