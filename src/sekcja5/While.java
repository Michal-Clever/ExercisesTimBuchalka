package sekcja5;

public class While {
    public static void main(String[] args) {
//        int count = 0;
//        while (count != 5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//
//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if (count > 100) {
//                break;
//            }
//        } while (count != 6);


//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber) {
//            number++;
//            if (!isEvenNumber(number)) {
//                continue;
//
//            }
//            System.out.println(" Even number = " + number);
//
//            }
//        }


        int number = 4;
        int finishNumber = 20;
        int eventNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;

            }
            System.out.println("Even number = " + number);
            eventNumbersFound++;
            if (eventNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("Total event number found = " + eventNumbersFound);


    }


    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }


    }
}
