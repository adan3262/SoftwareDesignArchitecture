public class Price {
    String storeName;
    double amount;

    public Price(String storeName, double amount) {
        this.storeName = storeName;
        this.amount = amount;
    }

    public void display() {
        System.out.println(storeName + ": $" + amount);
    }
}
