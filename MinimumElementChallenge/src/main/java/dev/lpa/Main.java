package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] testArray = readIntegers();
        System.out.println(Arrays.toString(testArray));
        System.out.println(findMin(testArray));

    }

    public static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter sequence of numbers seperated by commas:");
        String input = scanner.nextLine();
        String[] sArray = input.split(",");
        int[] intArray = new int[sArray.length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(sArray[i]);
        }

        return intArray;
    }

    public static int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }
}
