package dev.lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceryList = new ArrayList<>();
        while (flag) {
            printHelp();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceryList);
                case 2 -> removeItems(groceryList);
                default -> flag = false;
            }
            groceryList.sort(Comparator.naturalOrder());
            System.out.println(groceryList);
        }
    }

    private static void printHelp() {

        System.out.println("Avaiable actions:\n" +
                "0 - to shutdown\n" +
                "1 - to add item(s) to list (comma delimited list)\n" +
                "2 - to remove any items (comma delimited list)\n" +
                "Enter a number for which action you want to do: ");
    }

    private static void addItems(ArrayList<String> groceries) {

        System.out.println("Add item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
            if (groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {

        System.out.println("Remove item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }
}
