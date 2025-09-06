public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Item item1 = new Item("Generic", 20);
        Fruit fruit = new Fruit("Golden", "Apple", 20);
        Weapon weapon = new Weapon("Pistol", 2, 75, "Distance");

        inventory.addItem(item1);
        inventory.addItem(fruit);
        inventory.addItem(weapon);

        inventory.displayInventory();
    }
}
