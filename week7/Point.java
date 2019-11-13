import java.util.Objects;

public class Point {
    private double x, y;

    public Point (double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX (){
        return this.x;
    }

    public void setX (double x){
        this.x = x;
    }

    public double getY (){
        return this.y;
    }

    public void setY (double y){
        this.y = y;
    }

    public double distance (Point a){
        return Math.sqrt(Math.pow(a.x*this.x, 2) + Math.pow(a.y*this.y, 2));
    }

    public boolean equals (Object a){
        return (this.x == a.x && this.y == a.y);
    }

    public int hashCode () {
        return Objects.hash(this.x, this.y);
    }

    public String toString (){
        return "(" + this.x + "," + this.y + ")";
    }

}