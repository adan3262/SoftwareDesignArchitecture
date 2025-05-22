public class Item {
    String id;
    String name;
    String description;

    public Item(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public void display() {
        System.out.println("Item: " + name + " - " + description);
    }
}
