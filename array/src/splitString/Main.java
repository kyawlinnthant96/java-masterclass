package splitString;

public class Main {
    public static void main(String... args) {
        System.out.println("Hello World Java");
        String[] splitStrings = "Hello World Java".split(" ");
        publicText(splitStrings);
    }

    private static void publicText(String[] textList) {
        for (String t: textList) {
            System.out.println(t);
        }
    }
}
