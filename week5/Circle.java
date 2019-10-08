public class Circle {
    private double radius = 1.0;
    private String color = "red";
    protected static final double PI = 3.14;

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double _radius, String _color){
        this.radius = _radius;
        this.color = _color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return this.radius*this.radius*PI;
    }

    public String toString(){
        return "Circle[radius=" + this.radius + ",color=" + this.color + "]";
    }   
    // public static void main(String[] args) {
    //     Circle test = new Circle(10.4, "black");
    //     System.out.println(test.getArea());
    //     System.out.println(test.toString());
    // }
}