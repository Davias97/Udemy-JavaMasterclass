package dev.lpa;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {

    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class Main {

    public static void main(String[] args) {

        LinkedList<Place> toVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(toVisit, adelaide);
        addPlace(toVisit, new Place("Adelaide", 1374));
        addPlace(toVisit, new Place("Brisbane", 917));
        addPlace(toVisit, new Place("Perth", 3923));
        addPlace(toVisit, new Place("Alice Springs", 2771));
        addPlace(toVisit, new Place("Darwin", 3972));
        addPlace(toVisit, new Place("Melbourne", 877));

        toVisit.addFirst(new Place("Sydney", 0));
        System.out.println(toVisit);

        var iterator = toVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final: " + iterator.previous());
                forward = false;
            }
            System.out.print("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

            switch (menuItem) {
                case "F":
                    System.out.println("User wants to go forward");
                    if (!forward) {
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User wants to go backwards");
                    if (forward) {
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious())
                        System.out.println(iterator.previous());
                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    System.out.println(toVisit);
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place) {

        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Already exists: " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlace : list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }

        list.add(place);
    }

    private static void printMenu() {

        System.out.print("""
                Avaiable actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """);
    }
}
