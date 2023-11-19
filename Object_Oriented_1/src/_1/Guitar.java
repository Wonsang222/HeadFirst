package _1;

public class Guitar {
    private String serialNumber, model;
    private  double price;
    private GuitarSpec guitarSpec;

    public Guitar(String serialNumber,double price, GuitarSpec guitarSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = guitarSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
