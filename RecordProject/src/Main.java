public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Student s = new Student("s289000" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carole";
                        case 3 -> "Henry";
                        case 4 -> "Thomas";
                        case 5 -> "Josh";
                        default -> "Aliean";
                    },
                    "9/12/1996",
                    "Java Master Class"
                    );
        System.out.println(s);
        }
    }
}
