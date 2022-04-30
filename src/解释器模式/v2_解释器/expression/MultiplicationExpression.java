package 解释器模式.v2_解释器.expression;

/**
 * @author: tangliang
 * @date: 2020/5/4 00:31.
 * @description: XXX
 */
public class MultiplicationExpression implements Expression {
    private Expression expression1;
    private Expression expression2;

    public MultiplicationExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public int interpret() {
        return expression1.interpret() * expression2.interpret();
    }
}
