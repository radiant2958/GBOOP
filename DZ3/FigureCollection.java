package DZ3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import DZ3.Figures.Circle;
import DZ3.Figures.Figure;
import DZ3.Figures.Rectangle;
import DZ3.Figures.Square;
import DZ3.Figures.Triangle;

public class FigureCollection {
    private List<Figure> figures;

    FigureCollection() {
        this.figures = new ArrayList<Figure>();
    }

    public void addFigure(Figure figure) {
        figures.add(figure);

    }

    public void removeFigure(int index) {
        figures.remove(index);

    }

    public void updateFigure(int index, Figure newFigure) {
        figures.set(index, newFigure);
    }

    public void printSign() {
        for (Figure figure : figures) {
            if (figure instanceof Triangle) {
                System.out.printf(((Triangle) figure).toString()+"\n");
                
            }
            if (figure instanceof Rectangle) {
                System.out.printf(((Rectangle) figure).toString()+"\n");
               
            }
            if (figure instanceof Square) {
                System.out.printf(((Square) figure).toString()+"\n");
                
            }
            if (figure instanceof Circle) {
                System.out.printf(((Circle) figure).toString()+"\n");
              
            }
        }

    }
    public void allPrintFigure() {
        for (Figure figure : figures) {
            if (figure instanceof Triangle) {
                System.out.printf(((Triangle) figure).toString()+"\n");
                System.out.printf("Площадь треугольника равна: "+ ((Triangle)figure).area()+"\n");
                System.out.printf("Периметр треугольника равен: "+ ((Triangle)figure).getPerimeter()+"\n");             
            }
            
            
            if (figure instanceof Rectangle) {
                System.out.printf(((Rectangle) figure).toString()+"\n");
                System.out.printf("Площадь прямоугольника равна: " + ((Rectangle) figure).area()+"\n");
                System.out.printf("Периметр прямоугольника равен: " + ((Rectangle) figure).getPerimeter()+"\n");
            }
            if (figure instanceof Square) {
                System.out.printf(((Square) figure).toString()+"\n");
                System.out.printf("Площадь квадрата равна: "+((Square) figure).area()+"\n");
                System.out.printf("Периметр кватрата равен: "+((Square) figure).getPerimeter()+"\n");
            }
            if (figure instanceof Circle) {
                System.out.printf(((Circle) figure).toString()+"\n");
                System.out.printf("Площадь круга равна: "+((Circle) figure).area()+"\n");
                System.out.printf("Длина окружности круга равна: "+((Circle) figure).getCircle()+"\n");
            }
            
        }
        
    }
    public void sortOfArea(){
        Comparator<Figure> byArea = Comparator.comparing(Figure::area);
        this.figures.sort(byArea);
        // for (Figure f : this.figures) {
        //     System.out.println(f);
        // }

    
   
    
}
}
    
        
    

 
 

