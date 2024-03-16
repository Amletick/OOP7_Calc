package Calculator;

import java.util.Scanner;
import java.util.logging.Logger;

public class InputHandler {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Logger LOGGER = LoggerInitializer.getLogger(InputHandler.class.getName());

    public static ComplexNumber inputComplexNumber() {
        LOGGER.info("Enter real part:");
        double real = scanner.nextDouble();
        LOGGER.info("Enter imaginary part:");
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }

    public static char inputOperation() {
        LOGGER.info("Enter operation (+, *, /):");
        char operation = scanner.next().charAt(0);
        LOGGER.info("operations.Operation selected: " + operation);
        return operation;
    }
}
