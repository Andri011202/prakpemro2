package praktikum5.soal1;

public class Cylinder extends Shape {
    private double radius;
    private int height;

    //----------------------------------
    // Constructor: Sets up the sphere.
    //----------------------------------
    public Cylinder(double radius, int height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    //-----------------------------------------
    // Returns the surface area of the sphere.
    //-----------------------------------------
    @Override
    public double area() {
        return Math.PI*(radius*radius) * height;
    }

    //-----------------------------------
    // Returns the sphere as a String.
    //-----------------------------------
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }


}
