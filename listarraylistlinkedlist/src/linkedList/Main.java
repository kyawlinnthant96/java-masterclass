package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Chicago");
        placesToVisit.add(0,"Belgium");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
       /* removeElement(placesToVisit);
        System.out.println(placesToVisit);*/
/*
        gettingVisitedPlaces(placesToVisit);
        System.out.println(placesToVisit);*/
//        printItinerary2(placesToVisit);
        testIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> places) {
        places.addFirst("London");
        places.addLast("Japan");
        // Queue Method
        places.offer("Paris");
        places.offerFirst("Norway");
        places.offerLast("Sydney");
    }

    private static void removeElement(LinkedList<String> places) {
        places.remove(4);
        places.remove("Sydney");

        System.out.println(places);
        String s1 = places.remove();
        System.out.println(s1 + " was removed");

        String s2 = places.removeFirst();
        System.out.println(s2 + " was removed");
        String s3 = places.removeLast();
        System.out.println(s3 + " was removed");

        String p1 = places.poll();
        System.out.println(p1 + " was removed");

    }

    private static void gettingVisitedPlaces(LinkedList<String> places) {
        System.out.println("Retrieved places: " + places.get(4));

        System.out.println("First place: "+ places.getFirst());
        System.out.println("Last place: " + places.getLast());
        System.out.println("Chicago is at position: " + places.indexOf("Chicago"));
        System.out.println("Paris is at position: " + places.lastIndexOf("Paris"));
        System.out.println("Element from element: " + places.element());

        System.out.println("Element from peek()"+ places.peek());
        System.out.println("Element form peekfirst(): ");
    }

    public static void printItinerary(LinkedList<String> places) {
        System.out.println("Trip start at: " + places.getFirst());
        for (int i = 1; i < places.size(); i++) {
            System.out.println("---from" + places.get(i - 1)+ "to" + places.get(i));
        }
        System.out.println("Trip ends at: " + places.getLast());
    }

    private static void printItinerary2(LinkedList<String> places) {
        System.out.println("Trip start at: " + places.getFirst());
        String previousPlace = places.getFirst();
        ListIterator<String> iterator = places.listIterator();
        
        for (String place : places) {
            System.out.println("--- From " + previousPlace + " to " + place);
        }
        System.out.println("Trips end at: " + places.getLast());
    }

    private static void testIterator(LinkedList<String> places) {
        var iterator = places.listIterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equals("Chicago")) {
                iterator.add("San Francisco");
            }
        }
        System.out.println(places);
    }


}
