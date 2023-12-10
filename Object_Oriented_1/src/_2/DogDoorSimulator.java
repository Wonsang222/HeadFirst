package _2;

public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);



        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {

        }

        remote.pressButton();
        System.out.println("\nFido is back inside" );


    }
}
