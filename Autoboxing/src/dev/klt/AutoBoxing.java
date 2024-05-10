package dev.klt;

import java.util.ArrayList;

public class AutoBoxing {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15); // prefer but unnecessary
        Integer deprecatedBoxing = new Integer(15); // deprecated features
        int unboxedInt = boxedInt.intValue();

        // Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
        Double resultBoxed = getDoubleLiteralObject();
        double resultUnboxed = getDoubleObject();

        var ourList = getList(1,2,4,5);
        System.out.println(ourList);
    }

    private static ArrayList<Integer> getList(int... varargs) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int var : varargs) {
            list.add(var);
        }
        return list;
    }

    private static Integer returnInt(int i) {
        return i;
    }

    private static int returnAnint(Integer i) {
        return i;
    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getDoubleLiteralObject() {
        return 100.00;
    }
}
