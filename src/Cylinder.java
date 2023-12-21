public class Cylinder extends Circle {
    double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder() {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getAreaCylinder(){
        return (2*Math.PI*this.radius*(this.radius+this.height));
    }

    @Override
    public String toString() {
        return "Area Cylinder is: " + getArea()+ "\nColor is: " +getColor() + "\nHeight is: " +getHeight();
    }
}
