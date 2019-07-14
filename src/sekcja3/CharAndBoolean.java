package sekcja3;

public class CharAndBoolean {
    public static void main(String[] args) {

        //width of 16 ( 2 bytes )
        char myCharUnicode = '\u00A9';
        char myChar = 'A';

        System.out.println("Unicode output was: " + myCharUnicode);

        boolean myBoolean = false;
        boolean isMale = true;

        char registeredSymbol = '\u00AE';
        System.out.println("Unicode output was: " + registeredSymbol);
    }
}
