public class Main {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int sumEvenNumbers = 0;
        int counterEvenNumbers = 0;
        int counterOddNumbers = 0;

        while (number <= finishNumber) {
            if (counterEvenNumbers == 5) {
                break;
            }
            number++;
            if (!isEvenNumber(number)) {
                counterOddNumbers++;
                continue;
            }
            System.out.println("Even number " + number);
            sumEvenNumbers += number;
            counterEvenNumbers++;
        }
        System.out.println("Total of " + counterEvenNumbers + " even numbers and " + counterOddNumbers + " odd numbers were found");
        System.out.println("Sum of even numbers is: " + sumEvenNumbers);
    }

    public static boolean isEvenNumber(int number) {

        return number % 2 == 0;
    }
}
