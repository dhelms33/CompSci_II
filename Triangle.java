public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;
    public Triangle() {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }
    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    @Override
    public double getArea() {
        double sideArea = 0.5 * (side1 + side2 + side3);
        double shade = sideArea * (sideArea-side1) * (sideArea - side2) * (sideArea - side3);
        return Math.sqrt(shade);
    }
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    public String toString() {
        return "gTriangle: Side 1: " + side1 + " Side 2: " + side2 + " Side 3: " + side3;
    }

}
