// 77. Create a simple application with at least two packages: com.example.geometry and com.example.utils. In the geometry package, define classes like Circle and Rectangle. In the utils package, create a Calculator class that can compute areas of these shapes.
package GeometryCalculator.src.com.example.geometry;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getradius() {
        return radius;
    }

    public void setradius(int radius) {
        this.radius = radius;
    }

}
