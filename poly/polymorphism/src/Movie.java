public class Movie {
    public String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println( title + " is a " + instanceType + " film" );
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventures(title);
            case 'C' -> new Comedy(title);
            default -> new Movie(title);
        };
    }
}

class Adventures extends Movie {
    public Adventures(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                "Pleasent Scene",
                "Scary Music",
                "Somethin Bad Happens"
                );
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                "Something funny",
                "Humour Joke",
                "Best Acting"
                );
    }
}
