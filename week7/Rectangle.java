import java.util.Objects;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    protected Point topLeft;

    public Rectangle(){}
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(Point topLeft, double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return this.length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return this.length*this.width;
    }

    public double getPerimeter(){
        return this.length*2 + this.width*2;
    }

    public String toString(){
        return "Rectangle[" + this.topLeft.toString() + "width=" + this.width + ",length=" + this.length + ",color="+ this.color + ",filled=" + this.filled + "]";
    }

    public Point getTopLeft(){
        return this.topLeft;
    }

    public void setTopLeft(Point topLeft){
        this.topLeft = topLeft;
    }

    public boolean equals(Object obj) {
        return (this.topLeft.equals(obj.topLeft) && this.length == obj.length && this.width == obj.width);
    }

    public int hashCode(){
        Objects.hash(this.length, this.width, this.topLeft);
    }
}