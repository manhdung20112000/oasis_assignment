import java.util.Objects;

public class Circle extends Shape{
    protected double radius;
    protected Point center;

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public Circle(Point center, double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }

    public String toString(){
        return "Circle[center=" + this.center.toString() + "radius=" + this.radius + ",color="+ this.color + ",filled=" + this.filled + "]";
    }

    public boolean equals(Object obj){
        return (this.radius == obj.radius && this.center == obj.center);
    }

    public Point getCenter(){
        return this.center;
    }

    public void setCenter(Point center){
        this.center = center;
    }

    public int hashCode(){
        return Objects.hash(this.radius, this.center);
    }
} 