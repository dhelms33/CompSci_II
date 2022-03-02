import java.util.*;
import java.lang.Math;

//Complex Class
class Complex implements Comparable<Complex>, Cloneable {

    //Member variables
    private double real;
    private double imag;

    // Constructor
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    public Complex(double real) {
        this.real = real;
        this.imag = 0;
    }

    // Returns a string object
    public String toString() {
        return real + " + " + imag + "i";
    }

    //Getter methods
    public double getRealPart() {
        return this.real;
    }

    public double getImaginaryPart() {
        return this.imag;
    }

    //Addition
    public Complex add(Complex c2) {
        double totalRealPart = this.real + c2.getRealPart();
        double totalImagPart = this.imag + c2.getImaginaryPart();
        return new Complex(totalRealPart, totalImagPart);
    }

    //Subtraction
    public Complex subtract(Complex c2) {
        double wholeRealPart = this.real - c2.getRealPart();
        double wholeImagPart = this.imag - c2.getImaginaryPart();
        return new Complex(wholeRealPart, wholeImagPart);
    }

    //Multiplication
    public Complex multiply(Complex c2) {
        double wholeRealPart = (this.real*c2.getRealPart()) - (this.imag*c2.getImaginaryPart());
        double wholeImagPart = (this.imag*c2.getRealPart()) + (this.real*c2.getImaginaryPart());
        return new Complex(wholeRealPart, wholeImagPart);
    }

    //Division
    public Complex divide(Complex c2) {
        double wholeRealPart = ( (this.real*c2.getRealPart()) + (this.imag*c2.getImaginaryPart()) ) / ((c2.getRealPart()*c2.getRealPart())+(c2.getImaginaryPart()*c2.getImaginaryPart()));
        double wholeImagPart = (this.imag*c2.getRealPart()) + (this.real*c2.getImaginaryPart());
        return new Complex(wholeRealPart, wholeImagPart);
    }

    public int comparable(Object o) {
        Complex c = (Complex) o;
        return (int) (this.abs()-(c.abs()));
    }

    //Absolute value
    public double abs() {
        return Math.sqrt((this.real * this.real) + (this.imag * this.imag));
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public int compareTo(Complex c1) { //I was very confused with this part and included this method just in case
        if(abs() == c1.abs() ) {
            return 0;
        }
        else if(abs() > c1.abs() ) {
            return 1;
        }
        else {
            return -1;
        }
    }

}


