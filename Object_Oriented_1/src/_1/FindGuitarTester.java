package _1;

public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);


//        Guitar whatErinLikes = new Guitar("", 0, "fender", "Stratocastor", "electric", "Alder", "Alder");
        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocasotor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        Guitar guitar = inventory.search(whatErinLikes);

        if (guitar != null) {
            System.out.println("we got some");
        } else {
            System.out.println("sorry we dont have wht u lookin for");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("V95696", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }

}
