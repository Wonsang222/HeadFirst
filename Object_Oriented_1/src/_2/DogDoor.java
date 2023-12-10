package _2;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;

    private Bark allowedBark;

    private ArrayList<Bark> allowedBarks = new ArrayList<Bark>();


    public void setOpen(boolean open) {
        this.open = open;
    }

    public Bark getAllowedBark() {
        return allowedBark;
    }

    public void addAllowedBark(Bark allowedBark) {
        allowedBarks.add(allowedBark);
    }

    public ArrayList<Bark> getAllowedBarks() {
        return allowedBarks;
    }

    public DogDoor() {
        this.open = false;
    }

    public void open() {
        System.out.println("The dog door open");
        open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close() {
        System.out.println("The dog door open");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }
}
