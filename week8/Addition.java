public class Addition extends BinaryExpression{
    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return "("+left.toString()+" + "+right.toString()+")";
    }

    public double evaluate() {
        return (double)(this.left.evaluate() + this.right.evaluate());
    }
}
