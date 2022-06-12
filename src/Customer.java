public class Customer {

    private String name;
    private int age;
    private double creditScore;

    public Customer(String name, int age, double creditScore) {
        this.name = name;
        this.age = age;
        this.creditScore = creditScore;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getCreditScore() {
        return creditScore;
    }
}
