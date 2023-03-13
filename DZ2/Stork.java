package DZ2;

public class Stork extends Bird {
    private double height;
    private double weight;
    private int flyingHeight;

    public Stork(int flyingHeight, double height, double weight) {
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
    public String getEyeColor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEyeColor'");
    }

    @Override
    public void makeSound() {
        System.out.println("так кричит аист: ар-ар-ар");
    }

    @Override
    public void printAnimal() {
        System.out.printf(
            "аист"+"\n"+
            "рост: " + height + "\n"+
            "вес: " + weight+ "\n"+
            "высота полета: "+ flyingHeight);
    }
    public int getFlyingHeight() {
        return flyingHeight;
    }
    @Override
    public void fly() {
        super.fly();
    }
    
}
