package _1;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);


//        Guitar whatErinLikes = new Guitar("", 0, "fender", "Stratocastor", "electric", "Alder", "Alder");
//        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocasotor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stracastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        List matchingGuitars = inventory.search(whatErinLikes);

        if (!matchingGuitars.isEmpty()) {

            for (Iterator i = matchingGuitars.iterator();i.hasNext();) {
                System.out.println("we got some");
            }
        } else {
            System.out.println("nah we dont");

        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("V95696", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }

}
