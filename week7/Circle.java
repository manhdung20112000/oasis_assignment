import java.util.Objects;

public class Circle extends Shape {
    protected Point center;
    protected double radius;

    public Circle (){};

    public Circle ( double radius ){
        this.radius = radius;
    }

    public Circle ( double radius , String color , boolean filled ){
        super(color, filled);
        this.radius = radius;
    }
    public Circle ( Point center , double radius , String color , boolean filled ){
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return (double) Math.round(Math.PI * radius * radius * 10) / 10;
    }

    @Override
    public double getPerimeter() {
        return (double) Math.round(2 * Math.PI * radius * 10) / 10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && Objects.equals(circle.center, center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }

    public String toString () {
        return "Circle[center=" + center + ",radius=" + radius + ",color=" + color + ",filled=" + filled +"]";
    }
}