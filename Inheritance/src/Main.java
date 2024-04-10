public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/12/1996", "12/12/1996");
        System.out.println(tim);
        System.out.println("Age "+tim.getAge());
        System.out.println("Pay " + tim.collectPay());

        SalariedEmployee robin = new SalariedEmployee("Robin", "12/12/1996", "12/08/2023",800000);
        System.out.println( "Robin pay check $=" + robin.collectPay());
        robin.retire();
        System.out.println( "Robin pay check $=" + robin.collectPay());

        HourlyRateEmployee emma = new HourlyRateEmployee("Emma", "12/8/1997", "6/12/2023",15);
        System.out.println(emma.getDoublePay());
    }
}
