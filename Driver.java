/**
 * @author Dereck Helms
 * @class Computer Science 2
 * @intstructor Adil Ibrahim
 */
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Complex number: ");
        double complex1a = sc.nextDouble();
        double complex1b = sc.nextDouble();
        Complex complex1 = new Complex(complex1a, complex1b);
        System.out.println("Enter the second complex number: ");
        double complex2a = sc.nextDouble();
        double complex2b = sc.nextDouble();
        Complex complex2 = new Complex(complex2a, complex2b);
        System.out.println("(" + complex1 +")" + " + " + "(" + complex2 +")" + " = " + complex1.add(complex2));
        System.out.println("(" + complex1 +")" + " - " + "(" + complex2 +")" + " = " + complex1.subtract(complex2));
        System.out.println("(" + complex1 +")" + " * " + "(" + complex2 +")" + " = " + complex1.multiply(complex2));
        System.out.println("(" + complex1 +")" + " / " + "(" + complex2 +")" + " = " + complex1.divide(complex2));
        Complex complex3 = null;
        try {
            complex3 = (Complex)complex1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(complex1 == complex3);
        System.out.println(complex3.getRealPart());
        System.out.println(complex3.getImaginaryPart());
        Complex c4 = new Complex(4, -0.5);
        Complex[] list = {complex1, complex2, complex3, c4};
        java.util.Arrays.sort(list);
        System.out.println(java.util.Arrays.toString(list));
        }
    }

