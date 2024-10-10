public class App {
    public static void main(String[] args) throws Exception {
        // Create inventory
        Inventory inventory = new Inventory();

        // Skapa dom olika saker för inventory
        ChainsawSword chainsawSword = new ChainsawSword(
                "Chainsaw Sword",
                "Warning You will die :): A deadly sword with a roaring chainsaw blade.",
                7.5,
                1500,
                75,
                100);

        Hat gnomeHatArmor = new Hat(
                "Gnome Hat Armor",
                "A charming hat that boosts defense and charisma.",
                2.0,
                500,
                15,
                10);

        HealthGooPotion healthGooPotion = new HealthGooPotion(
                "Health Goo Potion",
                "A viscous potion that heals wounds.",
                0.5,
                100,
                40,
                "Cherry");

        HealthGooPotion yummypotionmmmm = new HealthGooPotion(
                "SuperGooPotion", 
                "Wow this one is a nasty potion be careful taking this bad boy.", 
                0, 
                1000000, 
                1000, 
                "Acid");
        // Add items to inventory
        inventory.addItem(chainsawSword);
        inventory.addItem(gnomeHatArmor);
        inventory.addItem(healthGooPotion);
        inventory.addItem(yummypotionmmmm);

        // Visa alla  inventory kontent
        inventory.displayItems();

        // Tabort ett item
        inventory.removeItem(gnomeHatArmor);

        // Vissa inventory kontent igen
        inventory.displayItems();

        // Visa dom olika item Medoter
        chainsawSword.equip();
        chainsawSword.unequip();

        healthGooPotion.use();

        inventory.displayItems();
        yummypotionmmmm.use();
        chainsawSword.refuel(20);
        inventory.displayItems();
        chainsawSword.getFuelLevel();
    }
}
