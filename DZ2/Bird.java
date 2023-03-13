package DZ2;

abstract class Bird implements Animal {
    protected Integer flyingHeight;

    public Bird(int flyingHeight) {
        this.flyingHeight = flyingHeight;
    }

   

    public void fly(){
        System.out.printf("Я лечу на  "+flyingHeight+" метрах.");
    }

    
    public int getFlyingHeight() {
        return flyingHeight;
    }
    
   
   
  
    



    
}
