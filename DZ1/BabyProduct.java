package DZ1;

public class BabyProduct extends Product {

    protected double minAge;
    protected String hypoallergenic;

    public BabyProduct(String name, Double price, Double minAge, String hypoallergenic, int quantity, String unitMeasure) {
        super(name, price, quantity, unitMeasure);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    public double getMinAge() {
        return minAge;
        
    }
    public String getHypoallergenic(){
        return hypoallergenic;
    }


    @Override
    public String toString() {
        
        return "Baby product" +
        "name: " + name + "\n"+
        "price: " + price + "\n"+
        "minimum age: " + minAge + "\n"+
        "hypoallergenic: " + hypoallergenic + "\n"+
        "quantity: " + quantity + "\n"+
        "unit measure: " + unitMeasure;
    
    }
    
}
