package sekcja4;

public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        caltulateScore(true,800,levelCompleted,bonus);


    }

    public static void caltulateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was : " + finalScore + " point");
        }
    }
}
