package sekcja6ControlFlowStatemens;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        else if(number == 0){
            return 0;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;
        while(number != 0){
            firstDigit = number % 10;
            number /= 10;
            continue;
        }
        int sum = lastDigit + firstDigit;
        return sum;
    }
}
