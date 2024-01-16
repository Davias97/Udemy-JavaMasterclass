import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double minNumber = 0;
        double maxNumber = 0;
        boolean endless = true;
        int counter = 0;
        while (endless) {

            System.out.println("Please provide a number or any character to quit.");
            String input = scanner.nextLine();
            try {
                double number = Double.parseDouble(input);
                if (counter == 0) {
                    minNumber = number;
                    maxNumber = number;
                } else {
                    if (number > maxNumber) {
                        maxNumber = number;
                    } else if (number < minNumber) {
                        minNumber = number;
                    }
                }
                counter++;
            } catch (NumberFormatException e) {
                System.out.println("Input is not a number, exiting program now.");
                break;
            }
        }
        System.out.println("Minimum number was: " + minNumber + " and maximum number was: " + maxNumber);
    }
}
