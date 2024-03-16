package operations;
import operations.impl.*;

public class OperationFactory {
    public static Operation createOperation(char operationSymbol) {
        switch (operationSymbol) {
            case '+':
                return new AdditionOperation();
            case '*':
                return new MultiplicationOperation();
            case '/':
                return new DivisionOperation();
            default:
                throw new IllegalArgumentException("Invalid operation symbol: " + operationSymbol);
        }
    }
}

