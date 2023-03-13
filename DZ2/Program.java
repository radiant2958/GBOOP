package DZ2;



public class Program implements Animal {
    public static void main(String[] args) {

        Cat cat = new Cat("Муся", 2.0, 20.0, "bleak", "дворовая", "да", "трехшерстная","2015.5.8", "глаткая");
        Dog dog = new Dog("Буч", 40.0, 50.0, "bleak", "терьер", "да", "тигровый", "2020.10.16", "да"); 
        Tiger tiger = new Tiger(70.0, 200.0, "bleak", "саванна", "2020.10.16");
        Bird bird = new Stork(7, 7.0, 4.2);


        dog.getShowAffection();
        

        Zoo zoo=new Zoo();
        zoo.addAnimal(cat);
        zoo.addAnimal(dog);
        zoo.addAnimal(tiger);
        zoo.addAnimal(bird);
        

        zoo.allPrintZoo();
        System.out.println();
        zoo.printAnimalZoo(0);
        System.out.println();
        zoo.makeSoundZoo(2);
        System.out.println();
        zoo.allMakeSound();
        dog.training();
        bird.fly();
   
   
    }

    @Override
    public double getHeight() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHeight'");
    }

    @Override
    public double getWeight() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWeight'");
    }

    @Override
    public String getEyeColor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEyeColor'");
    }

    @Override
    public void makeSound() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeSound'");
    }

    @Override
    public void printAnimal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printAnimal'");
    }
}
