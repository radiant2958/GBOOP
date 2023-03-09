package DZ1;

public class Mask extends HygieneProducts{

    public Mask(String name, Double price, int numberOfPieces, int quantity, String unitMeasure) {
        super(name, price, numberOfPieces, quantity, unitMeasure);
        
    }
    @Override
    public String toString() {
        return "Mask" +
        "name: " + name + "\n"+
        "price: " + price + "\n"+
        "number of pieces: " + numberOfPieces + "\n"+
        "quantity: " + quantity + "\n"+
        "unit measure: " + unitMeasure;
    
    }

    
}
