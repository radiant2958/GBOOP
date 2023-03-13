package DZ2;



public class Dog implements DomesticAnimal {
    private String nickname;
    private double height;
    private double weight;
    private String eyecolor;
    private String breed;
    private String vacciones;
    private String furColor;
    private String birthDate;
    private String haveTrain;

    public Dog(String nickname, double height, double weight,
    String eyecolor, String breed, String vacciones, String furColor, String birthDate, String haveTrain){
       this.nickname = nickname;
       this.height = height;
       this.weight = weight;
       this.eyecolor = eyecolor;
       this.breed = breed;
       this.vacciones = vacciones;
       this.furColor = furColor;
       this.birthDate = birthDate;
       this.haveTrain = haveTrain;
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
        System.out.printf(nickname + " говорит гав-гав-гав");
    }

    @Override
    public void printAnimal() {
        System.out.printf(
        "Собака"+"\n"+
        "имя: " + nickname +"\n"+
        "рост: "+height+"\n"+
        "вес: " + weight + "\n"+
        "цвет глаз: " + eyecolor + "\n"+
        "порода: " + breed + "\n"+
        "наличие прививок: " + vacciones + "\n"+
        "цвет шерсти: " + furColor + "\n"+
        "дата рождения: " + birthDate+"\n"+
        "наличие дрессировки: " + haveTrain);
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
        System.out.printf(nickname + "очень любит облизывать хозяина!");
    }

    protected String getHaveTrain(){
        return haveTrain;
    }

    protected void training(){
        System.out.println("Сидеть!");
    }
    
}