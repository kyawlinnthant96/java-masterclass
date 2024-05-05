package practice;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)",name,distance);
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Place> places = new LinkedList<>();
        addMorePlace(places,new Place("Mandalay", 10));
        addMorePlace(places,new Place("Yangon", 20));
        addMorePlace(places,new Place("Mandalay", 40));
        System.out.println(places);

        Scanner scanner = new Scanner(System.in);
        var iterator = places.listIterator();
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();
        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating :" + iterator.next());
            }
            if (!iterator.hasNext()) {
                System.out.println("Finale :" + iterator.previous());
            }

            System.out.println("Enter value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0,1);
            switch (menuItem) {
                case "F":
                    System.out.println("User Want to go Forward");
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("Move Backward");
                    if (iterator.hasNext()) {
                        System.out.println(iterator.previous());
                    }
                    if (forward) {
                        forward = true;

                    }
                    break;
                case "L":
                    System.out.println(places);
                    break;
                default:
                    System.out.println("Exit");
            }
        }


    }

    private static void addMorePlace(LinkedList<Place> list,Place place) {
        if (list.contains(place)) {
            System.out.println("Found duplicate: " + place);
        }

        for (Place p: list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate: " + place);
            }
        }

        var matchIndex = 0;
        for (var listPlace : list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchIndex, listPlace);
                matchIndex++;
            }
        }

        list.add(place);
    }

    private static void printMenu() {
        System.out.println("""
                Available actions (select word or letter)
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """);
    }
}
