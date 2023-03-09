package DZ1;

public class Eggs extends FoodProduct{
    protected int quantityInPackage;

    public Eggs(String name, Double price, int quantityInPackage, int quantity, String unitMeasure, String shelfLive) {
        super(name, price, quantity, unitMeasure, shelfLive);
        this.quantityInPackage = quantityInPackage;
    }  
    public int getQuantityInPackage(){
        return quantityInPackage;
    }  
    @Override
    public String toString() {
        
        return "Eggs" +
        "name: " + name + "\n"+
        "price: " + price + "\n"+
        "quantity in package: " + quantityInPackage + "\n"+
        "quantity: " + quantity + "\n"+
        "unit measure: " + unitMeasure + "\n"+
        "shel life: " + shelfLive;
    }
}
