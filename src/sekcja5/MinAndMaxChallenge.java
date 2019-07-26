package sekcja5;

import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        while (true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){


            }else{
                System.out.println("Invalid number");
            }

        }

        scanner.close();
    }
}
