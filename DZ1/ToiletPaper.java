package DZ1;

public class ToiletPaper extends HygieneProducts{
    protected int layer;

    public ToiletPaper(String name, Double price, int layer,int numberOfPieces, int quantity, String unitMeasure) {
        super(name, price, numberOfPieces, quantity, unitMeasure);
        this.layer = layer;
       
    }
    @Override
    public String toString() {
        
        return "Toiler paper" +
        "name: " + name + "\n"+
        "price: " + price + "\n"+
        "layer: " + layer + "\n"+
        "number of pieces: " + numberOfPieces + "\n"+
        "quantity: " + quantity + "\n"+
        "unit measure: " + unitMeasure;
    }
    
}
