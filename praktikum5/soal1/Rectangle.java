package praktikum5.soal1;

public class Rectangle extends Shape{
    private int length;
    private int width; //Radius in feet

    //----------------------------------
    // Constructor: Sets up the Rectangle.
    //----------------------------------
    public Rectangle(int length, int width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    //-----------------------------------------
    // Returns the surface area of the Rectangle.
    //-----------------------------------------
    @Override
    public double area() {
        return length * width;
    }

    //-----------------------------------
    // Returns the Rectangle as a String.
    //-----------------------------------
    @Override
    public String toString() {
        return super.toString() + " of length "+length+" and width "+ width;
    }
}
