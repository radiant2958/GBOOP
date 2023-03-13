package DZ2;

public class Chicken extends Bird   {
    private double height;
    private double weight;
    private int flyingHeight;

    public Chicken(int flyingHeight, double height, double weight) {
        super(flyingHeight);
        this.height = height;
        this.weight = weight;
        
        
    }
    @Override
    public double getHeight() {
        
        return height;
    }
    @Override
    public double getWeight() {
       
        return weight;
    }
    @Override
    public void makeSound() {
        System.out.println("Ко-ко-ко");
        
    }
    @Override
    public void printAnimal() {
        System.out.printf(
        "курица"+"\n"+
        "рост: " + height + "\n"+
        "вес: " + weight+ "\n"+
        "высота полета: "+ flyingHeight);
        
    }
    @Override
    public void fly() {
        super.fly();
    }
    
    public int getFlyingHeight() {
        return flyingHeight;
    }
    @Override
    public String getEyeColor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEyeColor'");
    }
    

}
