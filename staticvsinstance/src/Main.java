public class Main {
    public static void main(String[] args) {
       /* BankAccount myAccount = new BankAccount(123, "Kyaw Kyaw",800000);
        System.out.println("My total balance is : " + myAccount.getBalance());
        myAccount.withdraw(1230);
        System.out.println("Withdraw Amount :" + myAccount.getBalance());*/

//        Person mgmg = new Person();
//        mgmg.setAge(12);
//        mgmg.setName("MGMG");
//        System.out.println(mgmg.getAge()+" "+mgmg.getName());

        /*Customer myamya = new Customer("myamya", 2300,"mya@gmail.com" );
        System.out.println(myamya.getCreditLimit());

        Customer mgmg = new Customer("mg mg kyaw", "mgmg@gmail.com" );
        System.out.println(mgmg.getCreditLimit());
        System.out.println(mgmg.getEmail());
        System.out.println(mgmg.getName());*/
        for (int i = 0; i <= 4; i++) {
            Student student = new Student("S1000"+ i,
                switch (i) {
                    case 1 -> "Mary";
                    case 2 -> "Carol";
                    case 3 -> "Tim";
                    case 4 -> "Hary";
                    default -> "Anonymous";
                },
                "01/12/1996",
                "takekwendo"
                );
        System.out.println(student);
        }

    }
}
