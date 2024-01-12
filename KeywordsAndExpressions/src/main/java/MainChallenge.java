public class MainChallenge {

    public static void main(String[] args) {

        int highScoreposition = calculateHighScorePosition(1500);
        displayHighScorePosition("David", highScoreposition);

        highScoreposition = calculateHighScorePosition(1000);
        displayHighScorePosition("Dabu", highScoreposition);

        highScoreposition = calculateHighScorePosition(500);
        displayHighScorePosition("Tromka", highScoreposition);

        highScoreposition = calculateHighScorePosition(100);
        displayHighScorePosition("Loktar", highScoreposition);

        highScoreposition = calculateHighScorePosition(25);
        displayHighScorePosition("Ogar", highScoreposition);

    }

    public static void displayHighScorePosition(String playerName, int position) {

        System.out.println(playerName + " managed to get into position " + position
                + " on the high score list");

    }

    public static int calculateHighScorePosition(int score) {

        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}
