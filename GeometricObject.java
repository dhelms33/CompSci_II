public  abstract class GeometricObject {
    public String color = "yellow";
    public boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject() {

    }
    public abstract double getArea();
    public abstract double getPerimeter();

    public GeometricObject(String color, boolean filled) {
        super();
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
       return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public String toString() {
        return "Created on " + dateCreated + "\n color: " + color + " and filled " + filled;
    }








}
