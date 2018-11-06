package week7.task1;

public class Subtration extends BinaryExpression {


    private Expression left;
    private Expression right;


    public Subtration(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }




    public Expression left() {
        return left;
    }




    public Expression right(){
        return right;
    }




    int evaluate() {
        return left.evaluate() - right.evaluate();
    }



    public String toString() {
        return left.evaluate() + " - "+ right.evaluate();
    }
}