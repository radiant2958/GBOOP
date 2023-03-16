package DZ3.Figures;

public class Rectangle extends Figure implements Perimeter{
    private double aSide;
    private double bSide;

    public Rectangle(Double aSide, Double bSide) throws Exception{
        this.aSide=aSide;
        this.bSide=bSide;
        if (aSide<=0|bSide<=0) {
            throw new Exception("такого прямоугольника не существует");
            
        }
    }
    public double getASide() {
        return aSide;
    }
    public double getBSide() {
        return bSide;
    }

    @Override
    public double area() {
        return aSide*bSide;
    }
    @Override
    public double getPerimeter() {
       return 2*(aSide+bSide);
    }

    @Override
    public String toString() {
        return "Прямоугольник со сторонами: "+aSide+", "+bSide;
    }
}
