package abstract_challenge;

public class Square extends Shape {
    protected int side;

    public Square(int side){
        this.side=side;
    }
    @Override
    public String toString() {
        return "Cricle [ Area=" + area + "]";
    }
   
    double area =0;
    @Override
    public void calculateArea() {
        area = Math.pow(side, 2);
        
    }

    public static void main(String[] args) {
        Square s = new Square(8);
        s.calculateArea();
        System.out.println(s);
    }
}
