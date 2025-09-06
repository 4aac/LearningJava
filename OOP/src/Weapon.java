public class Weapon extends Item implements ItemStuff {
    private int damage;
    private String type;

    public Weapon(String name, int quantity, int damage, String type) {
        super(name, quantity);
        this.type = type;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + getType() + ", Damage: " + getDamage() + ", Weapon: " + getName() + ", Quantity: " + getQuantity());
    }
}
