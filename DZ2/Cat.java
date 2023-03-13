package DZ2;



public class Cat implements DomesticAnimal  {
    private String nickname;
    private double height;
    private double weight;
    private String eyecolor;
    private String breed;
    private String vacciones;
    private String furColor;
    private String birthDate;
    private String wool;


    
    public Cat(String nickname, double height, double weight,
     String eyecolor, String breed, String vacciones, String furColor, String birthDate, String wool){
        this.nickname = nickname;
        this.height = height;
        this.weight = weight;
        this.eyecolor = eyecolor;
        this.breed = breed;
        this.vacciones = vacciones;
        this.furColor = furColor;
        this.birthDate = birthDate;
        this.wool = wool;

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
       System.out.println("мяу-мяу");
    }


    @Override
    public void printAnimal() {
        System.out.printf(
        "cat"+"\n"+
        "имя: " + nickname +"\n"+
        "рост: "+height+"\n"+
        "вес: " + weight + "\n"+
        "цвет глаз: " + eyecolor + "\n"+
        "порода: " + breed + "\n"+
        "наличие прививок: " + vacciones + "\n"+
        "наличие шерсти: " + wool + "\n"+
        "цвет шерсти: " + furColor + "\n"+
        "дата рождения: " + birthDate);
       
    }


    @Override
    public String getNickname() {
        return nickname;
    }


    @Override
    public String getBreed() {
        return breed;
    }


    @Override
    public String getVaccinations() {
        return vacciones;
    }


    @Override
    public String getFurColor() {
       return furColor;
    }


    @Override
    public String getBirthDate() {
       return birthDate;
    }


    @Override
    public void getShowAffection() {
        System.out.print(nickname + "любит, чтобы его(её) гладили");
        
    }
    protected String getWool() {
        return wool;
    }

    

    
}
