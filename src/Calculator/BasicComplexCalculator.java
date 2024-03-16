package Calculator;

import operations.Operation;

public class BasicComplexCalculator {

    private Operation operation;

    public BasicComplexCalculator(Operation operation) {
        this.operation = operation;
    }

    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        return operation.execute(num1, num2);
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

}
