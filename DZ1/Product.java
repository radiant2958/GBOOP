package DZ1;
// 1. Название
// 2. Цена
// 3. Количество
// 4. Единица измерения
public class Product {
    protected String name;
    protected Double price;
    protected int quantity;
    protected String unitMeasure;

    public  Product(String name, Double price, int quantity, String unitMeasure) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unitMeasure = unitMeasure;

    }
    public String getName() {
        return name;
        
    }
    public Double getPrice() {
        return price;
        
    }
    public int getQuantity() {
        return quantity;
        
    }
    public String getUnitMeasure() {
        return unitMeasure;
        
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product" +
               "name: " + name + "\n"+
               "price: " + price + "\n"+
               "quantity: " + quantity + "\n"+
               "unit measure: " + unitMeasure;
    }



    
}
