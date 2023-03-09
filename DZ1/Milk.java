package DZ1;

public class Milk extends Drink{

    protected int percentFat;
    protected String shelLive;
    
    
    public Milk(String name, Double price, Double volume, int percentFat, String shelLive, int quantity, String unitMeasure) {
        super(name, price, volume, quantity, unitMeasure);
        this.percentFat = percentFat;
        this.shelLive = shelLive;
        
    }
    public int getPercentFat(){
        return percentFat;
    }

    public String getShelLive(){
        return shelLive;
    }


    @Override
    public String toString() {
      
        return "Milk" +
        "name: " + name + "\n"+
        "price: " + price + "\n"+
        "volume: " + volume + "\n"+
        "percrnt fat: " + percentFat + "\n"+
        "shel live: " + shelLive + "\n"+
        "quantity: " + quantity + "\n"+
        "unit measure: " + unitMeasure;
    }

    
}
