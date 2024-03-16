import Calculator.*;

import operations.*;
import operations.impl.*;

import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = LoggerInitializer.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Enter the first complex number:");
        ComplexNumber num1 = InputHandler.inputComplexNumber();
        LOGGER.info("Enter the second complex number:");
        ComplexNumber num2 = InputHandler.inputComplexNumber();
        LOGGER.info("Enter operation (+, *, /):");
        char operationSymbol = InputHandler.inputOperation();

        try {
            Operation operation = OperationFactory.createOperation(operationSymbol);
            BasicComplexCalculator calculator = new BasicComplexCalculator(operation);
            ComplexNumber result = calculator.calculate(num1, num2);
            LOGGER.info("Result: " + result);
        } catch (IllegalArgumentException e) {
            LOGGER.warning(e.getMessage());
        }
    }
}
