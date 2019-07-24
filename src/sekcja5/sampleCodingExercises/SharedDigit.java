package sekcja5.sampleCodingExercises;

public class SharedDigit {

    public static boolean hasSharedDigit(int numberFirst, int numberSecond) {
        if ((numberFirst < 10 || numberFirst > 99) || (numberSecond < 10 || numberSecond > 99)) {
            return false;
        } else {
            int numberFirstLast = numberFirst % 10;
            int numberFirstFirst = numberFirst / 10;
            int numberSecondLast = numberSecond % 10;
            int numberSecondFirst = numberSecond / 10;
            if (( numberFirstFirst == numberSecondFirst || numberFirstFirst == numberSecondFirst  )
                    || (numberFirstLast==numberSecondFirst || numberFirstLast==numberSecondLast)){
                return true;
            }

        }
        return false;
    }

}
