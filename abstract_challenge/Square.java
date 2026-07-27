package abstract_challenge;

public class Square extends Shape {
    protected int side;

    public Square(int side){
        this.side=side;
    }
   
    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
        
    }

        @Override
    public String toString() {
        return "Square  [ Area=" + calculateArea() + "]";
    }
    public static void main(String[] args) {
        Square s = new Square(8);
        s.calculateArea();
        System.out.println(s);
    }
}
