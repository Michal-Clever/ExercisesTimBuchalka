package sekcja6ControlFlowStatemens;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        int largestPrime = 0;
        if (number <= 1) {
            return -1;
        }
        boolean isPrime = true;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                for (int k = 2; k <= i / 2; k++) {
                    if (i % k == 0) {
                        isPrime = false;
                    }

                }
                if (isPrime && i > largestPrime) {
                    largestPrime = i;
                }
            }
        }
        return largestPrime;
    }
}
