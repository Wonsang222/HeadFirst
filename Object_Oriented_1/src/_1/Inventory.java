package _1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List guitars;

    public Inventory() {
        this.guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type,Wood backWood,Wood
                           topWood) {
        Guitar guitar = new Guitar(serialNumber,price, builder, model, type, backWood, topWood);

        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList();
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            //일련번호, 가격 유일값이므로 무시
            GuitarSpec guitarSpec = guitar.getGuitarSpec();

            if (searchSpec.getBuilder() != guitarSpec.getBuilder()) {
                continue;
            }
            String model = searchSpec.getModel().toLowerCase();
            if ((model != null) && (!model.equals(""))&&(!model.equals(searchSpec.getModel().toLowerCase()))) {
                continue;
            }
            if (searchSpec.getType() != guitarSpec.getType()) {
                continue;
            }
            if (searchSpec.getBackwood() != guitarSpec.getBackwood()) {
                continue;
            }
            if (searchSpec.getTopwood() != guitarSpec.getTopwood()) {
                continue;
            }
            matchingGuitars.add(guitar);
            return matchingGuitars;
        }
        return null;
    }
}
