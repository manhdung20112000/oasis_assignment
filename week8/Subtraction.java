public class Subtraction extends BinaryExpression{
    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return "("+left.toString()+" - "+right.toString()+")";
    }

    public double evaluate() {
        return (double)left.evaluate() - right.evaluate();
    }
}
