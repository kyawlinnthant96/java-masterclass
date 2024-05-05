package MoreList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] items = {"mike", "buck", "clevan", "cavaso"};
        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("butter");
        System.out.println(groceries);

        ArrayList<String> groceries2 = new ArrayList<>(List.of("honey", "sunflower","crub"));
        System.out.println(groceries2);

        groceries.addAll(groceries2);
        System.out.println(groceries);

        groceries.remove(1);
        System.out.println(groceries);

        groceries.removeAll(List.of("honey", "sunflower"));
        System.out.println(groceries);

        groceries.retainAll(List.of("butter", "crub"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);

        groceries.addAll(List.of("honey", "sunflower", "crub"));
        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
