public class Main {

    public static void main(String[] args) {

        System.out.println("New score is " + calculateScore("David", 500));
        System.out.println("New score is " + calculateScore(10));
        System.out.println(convertToCentimeters(15,5));
    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {

        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {

        System.out.println("No player name, no player score");
        return 0;
    }

    public static double convertToCentimeters(int height) {
        return height * 2.54;
    }

    public static double convertToCentimeters(int heightFeet, int heightInches) {

        return convertToCentimeters((heightFeet * 12) + heightInches);

    }
}
