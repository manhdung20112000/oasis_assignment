import java.util.Objects;

public class Rectangle extends Shape {
    protected Point topLeft ;
    protected double width;
    protected double length;

    public Rectangle (){};

    public Rectangle (double width , double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle (double width , double length , String color , boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle (Point topLeft , double width , double length , String color , boolean filled){
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    public double getWidth() { return width; }
    public double getLength() { return length; }
    public Point getTopLeft() { return topLeft; }
    public void setWidth(double width) { this.width = width; }
    public void setLength(double length) { this.length = length; }
    public void setTopLeft(Point topLeft) { this.topLeft = topLeft; }

    @Override
    public double getArea() {
        return (double) Math.round(width * length * 10) / 10;
    }

    @Override
    public double getPerimeter() {
        return (double) Math.round(2 * (width + length) * 10) / 10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.length, length) == 0 && Objects.equals(topLeft, rectangle.topLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width, length);
    }

    @Override
    public String toString() {
        return "Rectangle[topLeft=" + topLeft + ",width=" + width + ",length=" + length + ",color=" + color + ",filled=" + filled + "]";
    }
}
