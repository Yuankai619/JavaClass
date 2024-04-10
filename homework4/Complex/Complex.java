package ntou.cs.java2024;
import java.security.SecureRandom;
import java.lang.Math;

public class Complex {
    private double real;
    private double imaginary;
    private static final SecureRandom randomNumbers = new SecureRandom();

    // Constructor with two arguments
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // No-argument constructor with random positive double values for real and imaginary
    public Complex() {
        this.real = randomNumbers.nextDouble();
        this.imaginary = randomNumbers.nextDouble();
    }

    // Return the conjugate of the complex number
    public Complex conjugate() {
        return new Complex(this.real, -this.imaginary);
    }

    // Return the absolute value of the complex number
    public double absoluteValue() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    // Add two Complex numbers
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Subtract two Complex numbers
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Multiply two Complex numbers
    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.imaginary * other.real + this.real * other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    // Divide two Complex numbers
    public Complex divide(Complex other) {
        Complex numerator = this.multiply(other.conjugate());
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        return new Complex(numerator.real / denominator, numerator.imaginary / denominator);
    }

    // Custom toString method to print Complex numbers in the form a + bi
    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
    }
}
