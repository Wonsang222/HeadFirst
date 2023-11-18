package _1;

public enum Type {

    ACCOUSTIC, ELECTRIC;

    public String toString() {
        switch(this){
            case ACCOUSTIC: return "acoustic";
            case ELECTRIC: return "electric";
            default: return null;
        }
    }
}
