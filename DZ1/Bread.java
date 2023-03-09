package DZ1;

public class Bread extends FoodProduct{

    protected String typeFlour;

    public Bread(String name, Double price, String typeFlour, int quantity, String unitMeasure, String shelfLive) {
        super(name, price, quantity, unitMeasure, shelfLive);
        this.typeFlour = typeFlour;
        
    }

    public String getTypeFlour(){
        return typeFlour;
    }
    @Override
    public String toString() {
        
        return "Bread" +
        "name: " + name + "\n"+
        "price: " + price + "\n"+
        "type of flour: " + typeFlour + "\n"+
        "quantity: " + quantity + "\n"+
        "unit measure: " + unitMeasure + "\n"+
        "shel life: " + shelfLive;
    }
    
    
}
