package sekcja8;

import java.util.Scanner;

public class Arrays {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int[] myIntegers = getInteger(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is : " +getAverage(myIntegers));
    }

    public static int[] getInteger(int number) {
        System.out.println("Enter " + number + " integer values :\r");
        int[] value = new int[number];
        for (int i = 0; i < value.length; i++) {
            value[i] = scanner.nextInt();
        }
        return value;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

//        int[] myIntArray = new int[25];
//        //myIntArray[0] = 34234;
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//        }
//        printArray(myIntArray);
//    }
//    public static void printArray(int[] array) {
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Element " + i + " ,value is " + array[i]);
//        }
}

