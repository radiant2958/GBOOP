package DZ1;

public class Diapers extends BabyProduct {
    protected int size;
    protected int minWeight;
    protected int maxWeight;
    protected String typeDiapers;

    public Diapers(String name, Double price, Double minAge, int size, int minWeight, int maxWeight, String typeDiapers, String hypoallergenic, int quantity, String unitMeasure) {
        super(name, price, minAge, hypoallergenic, quantity, unitMeasure);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.typeDiapers = typeDiapers;
        
    }

    public int getSize() {
        return size;
    }
    public int getMinWeight() {
        return minWeight;
    }
    public int getMaxWeight() {
        return maxWeight;
    }
    public String getTypeDiapers() {
        return typeDiapers;
    }
     @Override
     public String toString() {
         
         return "Diapers" +
         "name: " + name + "\n"+
         "price: " + price + "\n"+
         "minimum age: " + minAge + "\n"+
         "size: " + size + "\n"+
         "min weight: " + minWeight + "\n"+
         "max weight: " + maxWeight + "\n"+
         "type: " + typeDiapers + "\n"+
         "hypoallergenic: " + hypoallergenic + "\n"+
         "quantity: " + quantity + "\n"+
         "unit measure: " + unitMeasure;
     
     }
    
}
