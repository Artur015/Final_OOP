package impl.operations;

import impl.ComplexNumber;

public class Addition extends ComplexOP1 {
    private double newReal;
    private double newImaginary;

    public Addition() {
    }

    @Override
    public ComplexNumber operation(ComplexNumber num1, ComplexNumber num2) {
        newReal = num1.getReal() + num2.getReal();
        newImaginary = num1.getImaginary() + num2.getImaginary();
        return new ComplexNumber (newReal, newImaginary);
    }

    @Override
    public String toString() {
        return "Summarize: " +
                newReal +
                " + " +
                newImaginary + "i";
    }
}
