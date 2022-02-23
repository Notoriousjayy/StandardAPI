package Models;

import Interfaces.ComplexInterface;

public class Complex implements ComplexInterface {
    @Override
    public double real() {
        return 0;
    }

    @Override
    public double imaginary() {
        return 0;
    }

    @Override
    public Complex mult(Complex rhs) {
        return null;
    }

    @Override
    public Object clone() {
        return null;
    }
}
