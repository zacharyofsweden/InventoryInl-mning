public class Armor extends Item implements Equippable {
    private int defense;
    // Konstruktor
    public Armor(String name, String description, double weight, int goldValue, int defense) {
        super(name, description, weight, goldValue);
        this.defense = defense;
    }
    //metod
    public int getDefense() {
        return defense;
    }

    @Override
    public void equip() {
        System.out.println("You wear the " + getName() + ". " + getDescription());
    }

    @Override
    public void unequip() {
        System.out.println("You remove the " + getName() + ".");
    }
}
