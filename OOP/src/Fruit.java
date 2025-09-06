public class Fruit implements ItemStuff {
    private String type;
    private int quantity;
    private String name;

    public Fruit(String type, String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Fruit: " + getName() + ", Quantity: "  + getQuantity() + ", Type: " + type);
    }
}