public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/12/1996", "12/12/1996");
        System.out.println(tim);
        System.out.println("Age "+tim.getAge());
        System.out.println("Pay " + tim.collectPay());
    }
}
