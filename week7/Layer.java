import java.util.Objects;

public class Square extends Rectangle {
    public Square (){};

    public Square ( double side){
        super(side , side);
    }

    public Square ( double side , String color , boolean filled ){
        super(side , side);
        this.color = color;
        this.filled = filled;
    }

    public Square ( Point topLeft , double side , String color , boolean filled){
        super(side , side);
        this.topLeft = topLeft;
        this.color = color;
        this.filled = filled;
    }

    public double getSide (){
        return getWidth();
    }
    public void setSide( double side){
        this.width = side;
        this.length = side;
    }
    public void setWidth ( double side ){
        super.setWidth(side);
        this.length = side;
    }

    public void setLength ( double side ){
        super.setLength(side);
        this.width = side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.width, width) == 0 && Double.compare(square.length, length) == 0 && Objects.equals(topLeft, square.topLeft);
    }

    @Override
    public String toString() {
        return "Square[topLeft=" + topLeft + ",side=" + getSide() + ",color=" + color + ",filled=" + filled + "]";
    }
}
