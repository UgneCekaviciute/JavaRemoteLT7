package fundamentals_coding.uzduotis3;
import java.util.Scanner;
import java.lang.Math;
public class Uzduotis3 {
    //Write a program for solving a quadratic equation. The program should take three integers
// (coefficients of the quadratic equation a, b, c) and calculate the roots x1 and x2
//  of the equation ax^2+bx+c=0. If delta ∆ comes out negative, print "Delta negative" and exit the program.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double delta = Math.pow(b,2) - 4*a*c;
        if (delta==0) {
            double x = (-b) / (2 * a);
            System.out.println("ax^2+bx+c= " + ((a * Math.pow(x, 2)) + (b * x) + c));
        }
        if (delta>0){
            double x1 = (-b-Math.sqrt(delta))/(2*a);
            double x2 = (-b+Math.sqrt(delta))/(2*a);
            System.out.println("x1 = " + x1 + "x2 = 1" + x2);
            System.out.println("ax^2+bx+c= " + ((a*Math.pow(x1,2))+(b*x1)+c) + " and ax^2+bx+c= "+ ((a*Math.pow(x2,2))+(b*x2)+c));

        }

        if (delta<0){
            System.out.println("Delta negative");

        }
    }
}
