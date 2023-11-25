package _1;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backwood;
    private Wood topwood;

    int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backwood, Wood topwood, int numStrings) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backwood = backwood;
        this.topwood = topwood;
        this.numStrings = numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackwood() {
        return backwood;
    }

    public Wood getTopwood() {
        return topwood;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public boolean matches(GuitarSpec spec) {

        if (builder != spec.getBuilder()) {
            return false;
        }
        String model = spec.getModel().toLowerCase();
        if ((model != null) && (!model.equals(""))&&(!model.equals(spec.getModel().toLowerCase()))) {
            return false;
        }
        if (type != spec.getType()) {
            return false;
        }
        if (backwood != spec.getBackwood()) {
            return false;

        }
        if (topwood != spec.getTopwood()) {
            return false;
        }

        if (numStrings != spec.getNumStrings()) {
            return false;
        }

        return true;
    }
}
