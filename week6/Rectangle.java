public class Rectangle extends Shape{
    protected double width;
    protected double length;

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
        return "Rectangle[width=" + this.width + ",length=" + this.length + ",color="+ this.color + ",filled=" + this.filled + "]";
    }
}