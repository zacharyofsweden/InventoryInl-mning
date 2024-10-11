public class Consumable extends Item implements Usable {
    // Privat attribut
    private int restoreValue;

    // Konstruktor
    public Consumable(String name, String description, double weight, int goldValue, int restoreValue) {
        super(name, description, weight, goldValue);
        this.restoreValue = restoreValue;
    }

    // Hämtare eller "Getters"
    public int getRestoreValue() {
        return restoreValue;
    }

    @Override
    public void use(Inventory inventory) {
        System.out.println("You use the " + getName() + ". " + getDescription());
        inventory.removeItem(this);
    }

}
