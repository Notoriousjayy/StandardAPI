package Interfaces;

import Models.Complex;

public interface ComplexInterface {
    double real();

    double imaginary();

    Complex mult(Complex rhs);

    Object clone();
}
