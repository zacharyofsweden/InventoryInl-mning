public class Hat extends Armor {
    // Privat attribut 
    private int charismaBonus;
    // Konstruktor
    public Hat(String name, String description, double weight, int goldValue, int defense, int charismaBonus) {
        super(name, description, weight, goldValue, defense);
        this.charismaBonus = charismaBonus;
    }
    // Hämtare eller "Getters"
    public int getCharismaBonus() {
        return charismaBonus;
    }
    
    @Override
    public void equip() {
        System.out.println("You don the " + getName() + ". " + getDescription());
    }
}
