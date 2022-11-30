package praktikum5.soal1;

abstract class Shape {
    protected String shapeName;
    //----------------------------------
    // Constructor: Sets up the shape.
    //----------------------------------
    protected Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    //-----------------------------------------
    // Returns the surface area of the shape.
    //-----------------------------------------
    protected abstract double area();

    //-----------------------------------
    // Returns the shape as a String.
    //-----------------------------------
    @Override
    public String toString() {
        return shapeName;
    }

}
