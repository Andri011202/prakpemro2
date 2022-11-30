package praktikum5.soal1;

public class Paint {
    private double coverege;

    //-----------------------------------------
    // Constructor: Sets up the paint object.
    //-----------------------------------------
    public Paint(double coverege) {
        this.coverege = coverege;
    }

    //---------------------------------------------------
    // Returns the amount of paint (number of gallons)
    // needed to paint the shape given as the parameter.
    //---------------------------------------------------
    public double amount(Shape s) {
        System.out.println("Computing amount for "+s);
        return s.area() / coverege;
    }
}
