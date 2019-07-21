package sekcja5;

public class Switch {
    public static void main(String[] args) {

        int switchValue = 3;
        switch (switchValue) {

            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("was a 3 or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1  or 2");
                break;
        }

        char letter = 'a';
        switch (letter) {

            case 'a':
                System.out.println("Letter : a");
                break;
            case 'b':
                System.out.println("Letter : b");
                break;
            case 'c':
                System.out.println("Letter : c");
                break;
            case 'd':
                System.out.println("Letter : d");
                break;
            case 'e':
                System.out.println("Letter : e");
                break;
            default:
                System.out.println("Could not fine a,b,c,d,e");
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "july":
                System.out.println("Jul");
                break;
            default:
                System.out.println("Not sure");
                break;
        }


    }
}
