public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Student s = new Student("s100" + i,
                    switch (i) {
                        case 1 -> "Marlin";
                        case 2 -> "Jole";
                        case 3 -> "Ellie";
                        case 4 -> "Ana";
                        case 5 -> "Tommy";
                        default -> "Clicker";
                    },
                    "12/12/1996",
                    "java master class"
                    );
            System.out.println(s);
        }
    }
}
