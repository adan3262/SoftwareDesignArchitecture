public class StoreService {
    public Price[] getNearbyPrices(String itemId) {
        // Simulated prices from stores
        return new Price[] {
            new Price("Store A", 4.99),
            new Price("Store B", 4.50),
            new Price("Store C", 5.10)
        };
    }
}
