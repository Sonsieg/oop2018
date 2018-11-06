package week7.task1;

public abstract class Division extends Expression {
    private Expression left;
    private Expression right;


    public Division(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
}
