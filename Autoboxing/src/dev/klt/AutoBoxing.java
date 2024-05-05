package dev.klt;

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



    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getDoubleLiteralObject() {
        return 100.00;
    }
}
