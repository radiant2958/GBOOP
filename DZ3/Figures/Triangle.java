package DZ3.Figures;

public class Triangle extends Figure implements Perimeter {
    private double aSide;
    private double bSide;
    private double cSide;

    public Triangle(double aSide, double bSide, double cSide) throws Exception{
        this.aSide=aSide;
        this.bSide=bSide;
        this.cSide= cSide;
        if ((aSide + bSide) < cSide | (bSide + cSide) < aSide | (aSide + cSide) < bSide)  {

            throw new Exception("такого треугольника не существует");
            
        }
        if (aSide<=0|bSide<=0|cSide<=0) {
            
            throw new Exception("такого треугольника не существует");
            
        }
    }
    public double getASide() {
        return aSide;
    }
    public double getBSide() {
        return bSide;
    }
    public double getCSide() {
        return cSide;
    }
    @Override
    public double area() {
        double p = aSide+bSide+cSide/2;
        return Math.sqrt(p*(p-aSide)*(p-bSide)*(p-cSide));
    }
    @Override
    public double getPerimeter() {
        return aSide+bSide+cSide;
    }

   @Override
   public String toString() {
       
       return "Тругольник со сторонами: "+aSide+", "+bSide+", "+cSide;
   }
    
}
