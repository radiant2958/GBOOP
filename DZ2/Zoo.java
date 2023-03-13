package DZ2;

import java.util.ArrayList;

public class Zoo implements Animal{
    private ArrayList<Animal> animals;
  
    
    Zoo(){
        animals = new ArrayList<>();

    }

    public void addAnimal(Animal animal){
      
            animals.add(animal);
        
    }
    
    public void removeAnimal(int i) {
        animals.remove(i);
        
    }
    public void printAnimalZoo(int i) {
        Animal animal = animals.get(i);
        animal.printAnimal();
        
    }

    public void makeSoundZoo(int i) {
        Animal animal = animals.get(i);
        animal.makeSound();
  
    }
    public void allPrintZoo(){
        for (Animal animal : animals) {
            animal.printAnimal();
            System.out.println();
        }
    }
    public void allMakeSound(){
        for (Animal animal : animals) {
            animal.makeSound();
            System.out.println();
        }
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
