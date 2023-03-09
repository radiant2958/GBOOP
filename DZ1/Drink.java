package DZ1;

public class Drink extends Product {
    protected double volume;

    public Drink(String name, Double price, Double volume, int quantity, String unitMeasure) {
        super(name, price, quantity, unitMeasure);
        this.volume = volume;
    }

    public double getVolume(){
        return volume;
    }

    @Override
    public String toString() {
        return "Drink" +
        "name: " + name + "\n"+
        "price: " + price + "\n"+
        "volume: " + volume + "\n"+
        "quantity: " + quantity + "\n"+
        "unit measure: " + unitMeasure;
        
    }
}
