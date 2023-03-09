package DZ1;

public class Program {

    public static void printProduct(Product product) {
        System.out.println(product.toString());
        
    }

    public static void main(String[] args) {
        Product bread = new Bread("Ивановский", 115.5, "white", 50, "штуки", "12.04.2023");
        Product milk = new Milk("Коровка", 80.0, 0.800, 3, "23.07.2023", 300, "литр");
        Product lemonade = new Lemonade("Буратино", 20.0, 1.0, 60, "литр");
        Product eggs = new Eggs("Ряба", 80.8, 10, 50, "штуки", "30.06.2023");
        Product mask = new Mask("Чистая линия", 20.6, 5, 100, "штуки");
        Product toiletPaper = new ToiletPaper("nuts", 120.5, 4, 4, 156, "штуки");
        Product diapers = new Diapers("Pampers", 1050.0, 0.3, 12, 6, 8, "трусики", "yes", 70, "штуки");
        Product pacifier = new Pacifier("Baby", 267.0, 0.1, "no", 90, "штуки");
        
        printProduct(bread);
        System.out.println();
        printProduct(milk);
        System.out.println();
        printProduct(lemonade);
        System.out.println();
        printProduct(eggs);
        System.out.println();
        printProduct(mask);
        System.out.println();
        printProduct(toiletPaper);
        System.out.println();
        printProduct(diapers);
        System.out.println();
        printProduct(pacifier);
    }


    
}
