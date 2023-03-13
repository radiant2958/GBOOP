package DZ2;



public class Tiger implements WildAnimal {
    private double height;
    private double weight;
    private String eyecolor;
    private String habitat;
    private String dateLocal;

    public Tiger(double height, double weight, String eyecolor, String habitat, String dateLocal){
        this.height = height;
        this.weight = weight;
        this.eyecolor = eyecolor;
        this.habitat  = habitat;
        this.dateLocal = dateLocal;
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
        System.out.println("р-ррр-ррр");
    }

    @Override
    public void printAnimal() {
        System.out.printf("Tiger"+"\n"+
        "рост: "+height+"\n"+
        "вес: "+ weight + "\n"+
        "цвет глаз: "+ eyecolor + "\n"+
        "место обитания: " + habitat + "\n"+
        "дата нахождения: " + dateLocal+"\n");
    }

    @Override
    public String getHabitat() {
        return habitat;
    }

    @Override
    public String getDateLocation() {
        return dateLocal;
    }
    
}
