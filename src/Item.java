public abstract class Item {
    // Privat attributer
    private String name;
    private String description;
    private double weight;
    private int goldValue;

    // Konstruktor
    public Item(String name, String description, double weight, int goldValue) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.goldValue = goldValue;

    }

    // Hämtare eller "Getters"

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }

    public int getGoldValue() {
        return goldValue;
    }

}
