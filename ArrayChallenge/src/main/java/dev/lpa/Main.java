package dev.lpa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        

        int[] myArray = createIntArray(10);
        System.out.println(Arrays.toString(myArray));
        int[] copiedArray = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(copiedArray);
        int[] sortedArray = new int[copiedArray.length];
        for (int i = 0; i < copiedArray.length; i++) {
            sortedArray[(sortedArray.length - 1) - i] = copiedArray[i];
        }
        System.out.println(Arrays.toString(sortedArray));

    }

    public static int[] createIntArray(int len) {

        Random random = new Random();
        int[] newArray = new int[len];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(1000);
        }

        return newArray;
    }
}
