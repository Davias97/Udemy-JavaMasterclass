package dev.lap;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverse(array)));

    }

    public static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }
}
