package sekcja6ControlFlowStatemens;

public class EvenDigitsSum {
    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        } else {
            while (number != 0) {
                int lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    sum += lastDigit;
                }
                number /= 10;
                continue;
            }
            return sum;
        }
    }
}
