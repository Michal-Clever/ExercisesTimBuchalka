package sekcja8;

import java.util.Scanner;

public class ResizeArray {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseDate = new int[10];

    public static void main(String[] args) {

    }

    private void getInput() {
        for (int i = 0; i < baseDate.length; i++) {
            baseDate[i] = scanner.nextInt();
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
            System.out.println();
        }
    }

    private static void resizeArray() {
        int[] orginal = baseDate;
        baseDate = new int[12];
        for (int i = 0; i < orginal.length; i++) {
            baseDate[i] = orginal[i];
        }
    }


}
