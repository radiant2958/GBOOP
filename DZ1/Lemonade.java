package DZ1;

public class Lemonade extends Drink {

   

    public Lemonade(String name, Double price, Double volume, int quantity, String unitMeasure) {
        super(name, price, volume, quantity, unitMeasure);
       
    }

    @Override
    public String toString() {
        
        return "Lemonade" +
        "name: " + name + "\n"+
        "price: " + price + "\n"+
        "volume: " + volume + "\n"+
        "quantity: " + quantity + "\n"+
        "unit measure: " + unitMeasure;
    }


    
}
