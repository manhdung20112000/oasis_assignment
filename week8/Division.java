public class Division extends BinaryExpression{
    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return "("+left.toString()+" / "+right.toString()+")";
    }

    public double evaluate() {
        if (right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        return (double)left.evaluate() / right.evaluate();
    }
}
