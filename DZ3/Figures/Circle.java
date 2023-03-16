package DZ3.Figures;



public class Circle extends Figure implements Circumference {
    private double radius;
    
    public Circle(double radius) throws Exception{
        this.radius = radius;
        if (radius<=0) {
            throw new Exception("круг с таким радиусом не существует");
            
        }
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getCircle() {
        return 2 * Math.PI*radius;
    }
    
    @Override
    public String toString() {
        
        return   "Круг с радиусом: "+radius;
     
    }

   
    
}
