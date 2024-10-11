public class HealthGooPotion extends Consumable {
    // Privata attributer
    private String flavor;

    // Konstruktor
    public HealthGooPotion(String name, String description, double weight, int goldValue, int restoreValue,
            String flavor) {
        super(name, description, weight, goldValue, restoreValue);
        this.flavor = flavor;
    }

    // Hämtare eller "Getters"
    public String getFlavor() {
        return flavor;
    }

    @Override
    public void use(Inventory inventory) {
        System.out.println("You consume the " + getName() + ". " + getDescription() + " It's " + flavor + "-flavored.");
        inventory.removeItem(this);
    }
}
