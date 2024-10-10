public class ChainsawSword extends Weapon {
    // Privat attribut 
    private int fuelLevel;

    // Konstruktor
    public ChainsawSword(String name, String description, double weight, int goldValue, int damage, int fuelLevel) {
        super(name, description, weight, goldValue, damage);
        this.fuelLevel = fuelLevel;
    }
    
    //Metoder
    public int getFuelLevel() {
        return fuelLevel;
    }

    public void refuel(int amount) {
        fuelLevel += amount;
        System.out.println("You refueled the " + getName() + ". Fuel level is now " + fuelLevel + ".");
    }

    @Override
    public void equip() {
        System.out.println("You bravely attach the " + getName() + " to your arm. " + getDescription());
    }

    @Override
    public void unequip() {
        System.out.println("You wisely remove the " + getName() + " from your arm.");
    }
}
