public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder (){
    }

    public Cylinder (double radius){
        setRadius(radius);
    }

    public Cylinder (double radius, double height){
        setRadius(radius);
        this.height = height;
    }

    public Cylinder (double radius, double height, String color){
        setRadius(radius);
        setColor(color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }

    @Override
    public String toString(){
        return "Cylinder[" + super.toString() + ",height=" + this.height + "]";
    }

    @Override
    public double getArea(){
        return super.getArea()*2 + getRadius()*2*PI*this.height;
    }
}