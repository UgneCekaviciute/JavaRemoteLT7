package fundamentals_coding.uzduotis1;
import java.lang.Math;
public class Uzduotis1 {
    //Write an application that will read diameter of a circle (variable of type float)
    // and calculate perimeter of given circle. Firstly, assume π = 3.14. Later, use the
    // value of π from the built-in Math class.

    public static void main(String[] args) {
        float diameter = 4;
        float pi = (float) Math.PI;
        float perimeterOfACircle = (2*pi*(diameter/2));
        System.out.println("Perimeter of a circle is: " + perimeterOfACircle);
    }
}
