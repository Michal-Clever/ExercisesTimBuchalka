package sekcja4;

public class Methods {
    public static void main(String[] args) {



        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = caltulateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was : " + highScore + " point");


        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highScore = caltulateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was : " + highScore + " point");

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Adam",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy",highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert",highScorePosition);

    }
    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " o the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int caltulateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }




}
