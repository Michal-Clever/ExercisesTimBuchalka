package sekcja6ControlFlowStatemens;

public class SharedDigit {
    public static boolean hasSharedDigit(int p1, int p2) {
        if ((p1 < 10 || p1 > 99) || (p2 < 10 || p2 > 99)) {
            return false;
        }
        int a = p1 % 10; //Storing the last digit of parameter p1 in integer a
        int b = p1 / 10;   //Storing the first digit of parameter p1 in integer b
        //Because we are concerned with a maximum of two digits in each parameter, storing and comparing the digits just like above will do the job.
        int c = p2 % 10;
        int d = p2 / 10;
        if ((a == c) || (a == d) || (b == c) || (b == d)) {
            return true;
        }
        return false;
    }
}
