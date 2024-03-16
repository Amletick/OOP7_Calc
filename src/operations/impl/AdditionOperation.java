package operations.impl;

import Calculator.ComplexNumber;
import operations.Operation;

public class AdditionOperation implements Operation {
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.getReal() + num2.getReal();
        double imaginary = num1.getImaginary() + num2.getImaginary();
        return new ComplexNumber(real, imaginary);
    }
}

