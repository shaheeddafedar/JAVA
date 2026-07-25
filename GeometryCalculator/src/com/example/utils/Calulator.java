package GeometryCalculator.src.com.example.utils;

import GeometryCalculator.src.com.example.geometry.Cricle;
import GeometryCalculator.src.com.example.geometry.Rectangle;

public class Calulator {
    public static void main(String[] args) {
        double pie = Math.PI;
        Cricle cricle = new Cricle(5);
        cricle.setradius(5);
        cricle.setradius(5);
         double Area_Cricle = pie*cricle.getradius()*cricle.getradius();
         System.out.println("Area of Cricle is "+Area_Cricle);

        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.setlenght(10);
        rectangle.setwidth(20);
        double Area_rectangle =rectangle.getlenght()*rectangle.getwidth();
         System.out.println("Area of rectangle is "+Area_rectangle);

    }
}
