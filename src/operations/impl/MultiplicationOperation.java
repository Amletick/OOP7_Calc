package operations.impl;

import Calculator.ComplexNumber;
import operations.Operation;

public class MultiplicationOperation implements Operation {
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginary = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(real, imaginary);
    }
}

