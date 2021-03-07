package basics;

import fundamentals_testing.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionExamples {
    //kuriamas testinis metodas, tikrinantis Calculator klasės sudėties metodą
    @Test
    public void testAssertEquals() {
        //given
        //negalime pasiekti add metodo, nesukūrę calculator objekto
        Calculator calculator = new Calculator();
        //when
        //išsisaugom rezultatą iš turimo metodo add į int kintamąjį result
        int result = calculator.add(5, 115);
        //then
        //kviečiame AssertEquals metodą
        // Assertions.assertEquals(3, result); mes test failed
        Assertions.assertEquals(120, result); //testas bus praeitas
    }
    @Test //testas, tikrinantis atimtį
    public void testCalculatorSubtraction() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.subtract(5, 115);
        //then
        Assertions.assertEquals(-110, result); //testas bus praeitas
    }
    @Test //testas tikrinantis daugybą
    public void testCalculatorMultiplication() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.multiply(2, 5);
        //then
        Assertions.assertEquals(10, result); //testas bus praeitas
    }
    @Test //testas tikrinantis dalybą
    public void testCalculatorDivision() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.divide(25, 5);
        //then
        Assertions.assertEquals(7, result); //testas bus praeitas
    }
}
