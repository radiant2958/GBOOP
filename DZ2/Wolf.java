package DZ2;



public class Wolf implements WildAnimal{
    private double height;
    private double weight;
    private String eyecolor;
    private String habitat;
    private String dateLocal;
    private String packLeader;

    public Wolf(double height, double weight, String eyecolor, String habitat, String dateLocal, String packLeader) {
        this.height = height;
        this.weight = weight;
        this.eyecolor = eyecolor;
        this.habitat = habitat;
        this.dateLocal = dateLocal;
        this.packLeader = packLeader;
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
        return eyecolor;
    }

    @Override
    public void makeSound() {
        System.out.println("ауууууу");
    }

    @Override
    public void printAnimal() {
        System.out.printf(
        "волк"+"\n"+
        "рост: "+height+"\n"+
        "вес: "+ weight + "\n"+
        "цвет глаз: "+ eyecolor + "\n"+
        "место обитания: " + habitat + "\n"+
        "дата нахождения: " + dateLocal+"\n"+
        "явлется ли вожаком стои: "+ packLeader);
    }

    @Override
    public String getHabitat() {
       return habitat;
    }

    @Override
    public String getDateLocation() {
        return dateLocal;
    }
    
    protected String getPackLeader() {
        return packLeader;
    }
}
