public class ScanController {
    ItemService itemService = new ItemService();
    StoreService storeService = new StoreService();

    public void scanItem(String input) {
        Item item = itemService.getItemDetails(input);
        Price[] prices = storeService.getNearbyPrices(item.id);

        item.display();
        System.out.println("Prices in nearby stores:");
        for (Price price : prices) {
            price.display();
        }
    }

    // NEW METHOD for GUI
    public String scanItemWithReturn(String input) {
        Item item = itemService.getItemDetails(input);
        Price[] prices = storeService.getNearbyPrices(item.id);

        StringBuilder sb = new StringBuilder();
        sb.append("Item: ").append(item.name).append(" - ").append(item.description).append("\n");
        sb.append("Prices in nearby stores:\n");
        for (Price price : prices) {
            sb.append(price.storeName).append(": $").append(price.amount).append("\n");
        }
        return sb.toString();
    }
}
