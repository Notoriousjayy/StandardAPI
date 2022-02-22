package Interfaces;

import Models.SequencialAllocatedPolynomial;

public interface PolynomialInterface {
    double evaluate(double x);
    void add(SequencialAllocatedPolynomial sequencialAllocatedPolynomial);

    void multiply(SequencialAllocatedPolynomial sequencialAllocatedPolynomial);
}
