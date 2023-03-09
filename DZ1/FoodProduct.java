package DZ1;

public class FoodProduct extends Product {
    protected String shelfLive;

    public FoodProduct(String name, Double price, int quantity, String unitMeasure, String shelfLive) {
        super(name, price, quantity, unitMeasure);
        this.shelfLive = shelfLive; 
    }

    public String getShelLive(){
        return shelfLive;
    }

    @Override
    public String toString() {
        return "Food product" +
        "name: " + name + "\n"+
        "price: " + price + "\n"+
        "quantity: " + quantity + "\n"+
        "unit measure: " + unitMeasure + "\n"+
        "shel life: " + shelfLive;
    }
    
}
