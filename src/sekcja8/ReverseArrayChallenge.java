package sekcja8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {

        int[] array = {1, 5, 3, 7, 11, 9, 15};
        System.out.println("Array = "+ Arrays.toString(array));
        revers(array);
        System.out.println("Reversed array = " + Arrays.toString(array));

    }

    private static void revers(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;

        }
    }

}