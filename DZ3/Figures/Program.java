package DZ3.Figures;

public class Program {
    public static void main(String[] args) throws Exception {
        Figure[] figures = new Figure[]{
            new Rectangle(4.0, 5.0),
            new Square(5.0),
            new Triangle(5.0, 5.0, 2.0),
            new Circle(5)

        };
        System.out.println(figures[0].area());
        System.out.println(figures[1].area());
        System.out.println(figures[2].area());
        System.out.println(figures[3].area());
        // System.out.println(figures[0].perimeter());
        // System.out.println(figures[1].perimeter());
        // System.out.println(figures[2].perimeter());
        // System.out.println(figures[3].perimeter());
      


    }
}
