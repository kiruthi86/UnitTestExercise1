public class Main {

    public static void main(String[] args) {
        Customer c1 = new Customer("Martina", 25, 0.95);
        Account a1 = new Account(c1);
        System.out.println(a1.getInterest());
    }
}
