package DZ3.Figures;

public class Square extends Rectangle{
   

    public Square(Double aSide) throws Exception {
        super(aSide, aSide);
        if (aSide<=0) {
            throw new Exception("такого квадрата не существует не существует");
            
        }
        
    }
    @Override
    public double getASide() {
        
        return super.getASide();
    }
    @Override
    public String toString() {
       return "Квадрат со сторонами равными: "+getASide();
    }

    
}
