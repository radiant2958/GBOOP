package DZ1;

public class Pacifier extends BabyProduct {

    public Pacifier(String name, Double price, Double minAge, String hypoallergenic, int quantity, String unitMeasure) {
        super(name, price, minAge, hypoallergenic, quantity, unitMeasure);
        
    }
    @Override
    public String toString() {
        
        return "Pacifier" +
        "name: " + name + "\n"+
        "price: " + price + "\n"+
        "minimum age: " + minAge + "\n"+
        "hypoallergenic: " + hypoallergenic + "\n"+
        "quantity: " + quantity + "\n"+
        "unit measure: " + unitMeasure;
    }

    
}
