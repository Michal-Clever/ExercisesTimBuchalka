package sekcja6ControlFlowStatemens;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int num = number; //Because "number" changes further down
        int reverse = 0;
        int lastDigit = 0;
        while(number != 0){
            lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
            continue;
        }
        if(num == reverse){
            return true;
        }
        else{
            return false;
        }
    }
}
