public class Main {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 10; count < 3 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;
            }
        }

        int sum = 0;
        int count2 = 0;

        for (int i = 1; count2 < 5 && i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                System.out.println(i + " can be divided by 3 and 5");
                count2++;
            }
        }
        System.out.println("Total sum of numbers: " + sum);
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}