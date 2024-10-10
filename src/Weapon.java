public class Weapon extends Item implements Equippable {
    // Privat attribut 
    private int damage;
    // Konstruktor
    public Weapon(String name, String description, double weight, int goldValue, int damage) {
        super(name, description, weight, goldValue);
        this.damage = damage;
    }
    // Hämtare eller "Getters"
    public int getDamage() {
        return damage;
    }

    @Override
    public void equip() {
        System.out.println("You equiped the " + getName() + ".");
    }

    @Override
    public void unequip() {
        System.out.println("You unequip the " + getName() + ".");
    }

}
