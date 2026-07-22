//  Calculate the area and circumference of a circle for a given radius 
// using Math.PI
package challenges7chapter;

import java.util.Scanner;

public class circleexample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double PI = Math.PI;
        System.out.print("Enter Radius");
        double radius = input.nextInt();
        input.close();
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * PI * radius;
        System.out.printf("Area of circle is %f \n", area);
        System.out.printf("circumference of circle is %f", circumference);
    }
}
