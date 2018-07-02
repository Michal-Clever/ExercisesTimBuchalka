package sekcja6ControlFlowStatemens;

public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        return(number % 2 != 0);
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if((start>0 && end>0) && end>=start){
            for (int i = start; i <= end; i++){
                if(isOdd(i)){
                    System.out.println("Found odd number " + i);
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}