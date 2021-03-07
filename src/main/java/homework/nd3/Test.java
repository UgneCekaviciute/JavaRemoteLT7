package homework.nd3;

public class Test {
    //5.	Implement a class named Rectangle, which has
    // two integer fields: a, b (the side lengths of the
    // rectangle). Please, add a constructor, which will
    // set values of all fields. Add to class definition
    // also the method named getArea(), which returns the
    // area of the rectangle and getPerimeter() returning
    // figure perimeter. For the created class definition
    // add a test class with main() method, where you have
    // to create an instance of type Rectangle using two-arguments
    // constructor, then call getArea() and getPerimeter() methods
    // and display returned values on the standard output.

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        System.out.println("a = " + rectangle.getA());
        System.out.println("b = " + rectangle.getB());
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());
    }
}
