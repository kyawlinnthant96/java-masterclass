public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public Customer() {
        this("nobody@gmail.com",1000,"nobody");
    }

    public Customer(String email, String name) {
        this(name, 1000, email);
    }

    public Customer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
