package DZ2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import  DZ2.Bird;

public class Consol  {
    
 
    public static void main(String[] args) {
        
    Animal animal;
    Zoo  zoo = new Zoo();
    System.out.println("Привет!Выбери нужный пункт меню");
    Scanner scanner = new Scanner(System.in);
    
    Boolean a = true;
    
    

    while(a==true){
        System.out.println("1.Добавить животное в зоопарк");
        System.out.println("2.Удалить животное из списка зооарка");
        System.out.println("3.Посмотреть характеристики животного");
        System.out.println("4. Узнать какой звук издает определенное животное");
        System.out.println("5. Посмотреть всех животных в зоопарке");
        System.out.println("6. Посмотреть все звуки животных в зоопарке");
        System.out.println("7. Посмотреть как летют птицы");
        System.out.println("8. Посмотреть как домашнее животное проявляет ласку");
        System.out.println("9. Посмотреть как дрессируют собак");
        System.out.println("10. выход");

        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                
                System.out.println("Введите цифру кого вы хотите добавить и через запятую характеристики вида"+"\n"+
                                "1. Cat, nickname,  height, weight,eyecolor, breed, vacciones, furColor, birthDate, wool "+"\n"+
                                "2. Dog, nickname, height, weight, eyecolor, breed, vacciones, furColor, birthDate, haveTrain "+"\n"+
                                "3. Tiger, height, weight, eyecolor, habitat, dateLocal"+"\n"+
                                "4. Wolf, height, weight, eyecolor, habitat, dateLocal, packLeader"+"\n"+
                                "5. Chicken, flyingHeight, height, weight"+"\n"+
                                "6. Stork, flyingHeight, height, weight");
                String ani = scanner.nextLine();
                String[] addAnimal = ani.split(",");
                if (addAnimal[0].equals("1")) {
                    animal = new Cat(addAnimal[1], Double.parseDouble(addAnimal[2]), Double.parseDouble(addAnimal[3]), addAnimal[4], addAnimal[5], addAnimal[6], addAnimal[7], addAnimal[8], addAnimal[9]);
                    zoo.addAnimal(animal);
                };
                if (addAnimal[0].equals("2")) {
                    animal = new Dog(addAnimal[1], Double.parseDouble(addAnimal[2]), Double.parseDouble(addAnimal[3]), addAnimal[4], addAnimal[5], addAnimal[6], addAnimal[7], addAnimal[8], addAnimal[9]);
                    zoo.addAnimal(animal);   
                };
                if (addAnimal[0].equals("3")) {
                    animal = new Tiger(Double.parseDouble(addAnimal[1]), Double.parseDouble(addAnimal[2]), addAnimal[3], addAnimal[4], addAnimal[5]);
                    zoo.addAnimal(animal);
                }
                if (addAnimal[0].equals("4")) {
                    animal = new Wolf(Double.parseDouble(addAnimal[1]), Double.parseDouble(addAnimal[2]), addAnimal[3], addAnimal[4], addAnimal[5], addAnimal[6]);
                    zoo.addAnimal(animal);
                }
                if (addAnimal[0].equals("5")) {
                    animal = new Chicken(Integer.parseInt(addAnimal[1]), Double.parseDouble(addAnimal[2]), Double.parseDouble(addAnimal[3])); 
                    zoo.addAnimal(animal);
                }
                if (addAnimal[0].equals("6")) {
                    animal = new Stork(Integer.parseInt(addAnimal[1]), Double.parseDouble(addAnimal[2]), Double.parseDouble(addAnimal[3]));
                    zoo.addAnimal(animal);
                }

                   
                break;
            case 2:
               System.out.println("Введ индекс животного, которого хотит удалить из списка зоопарка: ");
               int indexAnimal = scanner.nextInt();
               scanner.nextLine();
               zoo.removeAnimal(indexAnimal);
               break;
            case 3:
               System.out.println("Введ индекс животного, которого хотите посмотреть: ");
               int indexAnimalLook = scanner.nextInt();
               scanner.nextLine();
               zoo.printAnimalZoo(indexAnimalLook);
               break;
            case 4:
               System.out.println("Введ индекс животного, которого хотите узнать как он издает звук: ");
               int indexSound = scanner.nextInt();
               scanner.nextLine();
               zoo.makeSoundZoo(indexSound);
               break;
            case 5:
               zoo.allPrintZoo();
               break;
            case 6:
               zoo.allMakeSound();
               break;
            // case 7:
            //     for (Animal animals : zoo) {
            //     if (animals instanceof Bird) {
            //         animals.fly();
                    
            //     }}
            //     break;

            // case 8:
            //     for (Animal animals : zoo) {
            //         if (animals instanceof DomesticAnimal) {
            //             animals.getShowAffection();
                    
            //     }}
            //     break;
            
            // case 9:
            // for (Animal animals : zoo) {
            //     if (animals instanceof Dog) {
            //         animals.training();
                    
            //     }
                
            // }
  
            //    break;
              
            case 10:
                a=false;
                break;

        
            default:
                break;
        }







     } }

  
}
