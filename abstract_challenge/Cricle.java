package abstract_challenge;

public class Cricle  extends Shape {
    protected int radius;

    public Cricle  (int radius){
      this.radius=radius;
    }



    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }
     @Override
    public String toString() {
        return "Cricle  [ Area=" + calculateArea() + "]";
    }



    public static void main(String[] args) {
        Cricle  c = new Cricle (5);
       c.calculateArea();
       System.out.println(c);
    }
   
}
