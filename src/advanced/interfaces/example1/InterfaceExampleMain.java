package advanced.interfaces.example1;

public class InterfaceExampleMain {
    public static void main(String[] args) {
        //susikuriam objektus su parametrais ir atspausdinam
        //ankstesnėse klasėse panaudotų metodų rezultatus
        Rectangle rectangle = new Rectangle(4,3);
        System.out.println(rectangle.getArea());
        rectangle.printShape();//iškviečiamas metodas, kuris atspausdina
        // klasės pavadinimą

        Square square = new Square(2);
        System.out.println(square.getPerimeter());
        square.printShape(); //iškviečiamas metodas, kuris atspausdina
        // klasės pavadinimą
    }
}
