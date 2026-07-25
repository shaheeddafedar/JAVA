package GeometryCalculator.src.com.example.utils;

import java.util.Scanner;

import GeometryCalculator.src.com.example.geometry.Circle;
import GeometryCalculator.src.com.example.geometry.Rectangle;

public class Calulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius of Cricle");
        int radius = input.nextInt();
        System.out.print("Enter the length of Rectangle ");
        int length = input.nextInt();
        System.out.print("Enter the width of Rectangle ");
        int width = input.nextInt();
        input.close();

        Circle Circle = new Circle(5);
        Circle.setradius(radius);
        double Area_Circle = Math.PI * Math.pow(Circle.getradius(), 2);
        System.out.println("Area of Circle is " + Area_Circle);

        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.setlength(length);
        rectangle.setwidth(width);
        double Area_rectangle = rectangle.getlength() * rectangle.getwidth();
        System.out.println("Area of rectangle is " + Area_rectangle);

    }
}
