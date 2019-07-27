package sekcja5.sampleCodingExercises;

public class GreatesCommonDivisior {

    public static int getGreatestCommonDivisor(int num1,int num2){
        int max =0;
        if (num1 < 10 || num2 <10){
            return -1;
        }

        for (int i =1;i<= num1;i++){

            if (num1 %i == 0  && num2 %i ==0){
                if (i > max){
                    max =i;
                }
            }
        }

        return max;

    }

}
