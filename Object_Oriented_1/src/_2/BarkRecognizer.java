package _2;

import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark) {
        System.out.println("Bark Recognizer : Heard a '" + bark + "'" );

        List allowedBarks = door.getAllowedBarks();
        for (Iterator i = allowedBarks.iterator(); i.hasNext();) {
            Bark allowedBark = (Bark)i.next();
            if (allowedBark.equals(bark)) {
                door.open();
                return;
            }
        }

        if (door.getAllowedBark().equals(bark)) {
            door.open();
        } else {

        }
    }
}
