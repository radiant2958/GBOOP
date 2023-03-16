package DZ3;



import DZ3.Figures.Circle;
import DZ3.Figures.Figure;
import DZ3.Figures.Rectangle;
import DZ3.Figures.Square;
import DZ3.Figures.Triangle;

public class Program {
    public static void main(String[] args) throws Exception {
        FigureCollection figureCollection = new FigureCollection();
        Figure triangle = new Triangle(6.0,6.0,4.0);
        Figure square = new Square(5.0);
        Figure rectange = new Rectangle(4.0, 7.0);
        Figure circle = new Circle(3.0);
        Figure rectange2 = new Rectangle(7.0, 8.0);

        figureCollection.addFigure(circle);
        figureCollection.addFigure(triangle);
        figureCollection.addFigure(square);
        figureCollection.addFigure(rectange);

        figureCollection.allPrintFigure();

        figureCollection.removeFigure(2);
        System.out.println();
        figureCollection.allPrintFigure();
        System.out.println();
        figureCollection.printSign();
        System.out.println();
        figureCollection.updateFigure(0, rectange2);
        figureCollection.allPrintFigure();
        System.out.println();
        figureCollection.addFigure(circle);
        figureCollection.addFigure(square);
        figureCollection.printSign();
        System.out.println();
        figureCollection.sortOfArea();
        figureCollection.printSign();
        

        

        
    }
}
