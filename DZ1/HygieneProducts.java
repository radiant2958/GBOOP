package DZ1;

public class HygieneProducts extends Product {

    protected int numberOfPieces;

    public HygieneProducts(String name, Double price, int numberOfPieces, int quantity, String unitMeasure) {
        super(name, price, quantity, unitMeasure);
        this.numberOfPieces = numberOfPieces;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
        
    }

    @Override
    public String toString() {
       
        return "Hygiene product" +
        "name: " + name + "\n"+
        "price: " + price + "\n"+
        "number of pieces: " + numberOfPieces + "\n"+
        "quantity: " + quantity + "\n"+
        "unit measure: " + unitMeasure;
    }
}
