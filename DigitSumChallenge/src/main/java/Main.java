public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int number) {

        if (number < 0) {
            return -1;
        }

        int result = 0;
        while (number > 9) {
            result += number % 10;
            number = number / 10;
        }

        result += number;
        return result;
    }
}
