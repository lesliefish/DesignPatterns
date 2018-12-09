package patterns.strategy;

public class OperationMultiply implements Strategy {
    @Override
    public int doOperator(int num1, int num2) {
        return num1 * num2;
    }
}
