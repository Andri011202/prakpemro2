package praktikum5.soal1;
import java.awt.*;
import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        final double COVEREGE = 350;
        Paint paint = new Paint(COVEREGE);

        Rectangle deck;
        Sphere bigBall;
        Cylinder tank;

        //instantiate the three shapes to paint
        double deckAmt, ballAmt, tankAmt;
        deck = new Rectangle(20,30);
        bigBall = new Sphere(15);
        tank = new Cylinder(10,30);

        //assign values to the Amt variables
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);

        //Print the amount of paint for each
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
