package challange;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return  String.format("%s (%d)", name, distance);
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Place> places = new LinkedList<>();

        Place yangon = new Place("Yangon", 3000);
        addPlaces(places,yangon);
        addPlaces(places,new Place("Mandalay", 400));
        addPlaces(places,new Place("NayPyiTaw", 600));
        addPlaces(places,new Place("Bago", 800));
        addPlaces(places,new Place("Shan", 900));
        places.addFirst(new Place("Mon",3434));
        System.out.println(places);

        var iterator = places.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {
            if(!iterator.hasPrevious()) {
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }
            if(!iterator.hasNext()) {
                System.out.println("Finale: " + iterator.previous());
            }
            System.out.println("Enter value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0,1);
            switch (menuItem) {
                case "F":
                    System.out.println("User want to go forward");
                    if (!forward) {
                        forward = true;
                        if (iterator.hasNext()) {
                            System.out.println(iterator.next());
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User want to go backward");
                    if (forward) {
                        forward = true;
                        if (iterator.hasPrevious()) {
                            System.out.println(iterator.previous());
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "L":
                    System.out.println(places);
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }
    }

    private static void addPlaces(LinkedList<Place> list, Place place) {
        if (list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }

        for (Place p:list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlaces : list) {
            if (place.distance() < listPlaces.distance()) {
                list.add(matchedIndex,place);
                return;
            }
            matchedIndex++;
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
